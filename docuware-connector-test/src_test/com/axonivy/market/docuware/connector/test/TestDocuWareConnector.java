package com.axonivy.market.docuware.connector.test;

import static org.assertj.core.api.Assertions.assertThat;
import static com.axonivy.utils.e2etest.enums.E2EEnvironment.REAL_SERVER;
import java.util.function.Function;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import com.axonivy.connector.docuware.connector.DocuWareEndpointConfiguration;
import com.axonivy.connector.docuware.connector.DocuWareFieldTableItem;
import com.axonivy.connector.docuware.connector.DocuWareKeywordsField;
import com.axonivy.connector.docuware.connector.DocuWareProperty;
import com.axonivy.connector.docuware.connector.auth.OAuth2Feature;
import com.axonivy.market.docuware.connector.constants.DocuwareTestConstants;
import com.axonivy.utils.e2etest.context.MultiEnvironmentContextProvider;
import com.axonivy.utils.e2etest.utils.E2ETestUtils;

import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.bpm.exec.client.IvyProcessTest;
import ch.ivyteam.ivy.environment.AppFixture;
import ch.ivyteam.ivy.rest.client.RestClient;
import ch.ivyteam.ivy.rest.client.RestClientFeature;
import ch.ivyteam.ivy.rest.client.RestClients;
import ch.ivyteam.ivy.rest.client.RestClient.Builder;
import ch.ivyteam.ivy.scripting.objects.List;

@IvyProcessTest(enableWebServer = true)
@ExtendWith(MultiEnvironmentContextProvider.class)
public class TestDocuWareConnector {
  protected boolean isRealCall;

  @BeforeEach
  void beforeEach(ExtensionContext context, AppFixture fixture, IApplication app) {
    isRealCall = context.getDisplayName().equals(REAL_SERVER.getDisplayName());
    E2ETestUtils.determineConfigForContext(context.getDisplayName(), runRealEnv(fixture), runMockEnv(fixture, app));
  }

  @AfterEach
  void afterEach(ExtensionContext context, AppFixture fixture, IApplication app) {
    RestClients clients = RestClients.of(app);
    clients.remove("DocuWare");
  }

  public <T> void assertServiceErrorCodeIs404(T data, Function<T, Integer> errorCodeExtractor) {
    int errorCode = errorCodeExtractor.apply(data);
    assertThat(errorCode).isEqualTo(404);
  }

  private Runnable runRealEnv(AppFixture fixture) {
    return () -> {
      String host = System.getProperty(DocuwareTestConstants.HOST);
      String defaultInstance = System.getProperty(DocuwareTestConstants.DEFAULT_INSTANCE);
      String instanceHost = System.getProperty(DocuwareTestConstants.INSTANCE_HOST);
      String instanceGrantType = System.getProperty(DocuwareTestConstants.INSTANCE_GRANT_TYPE);
      String instanceUsername = System.getProperty(DocuwareTestConstants.INSTANCE_USERNAME);
      String instancePassword = System.getProperty(DocuwareTestConstants.INSTANCE_PASSWORD);
      String trustedUserName = System.getProperty(DocuwareTestConstants.INSTANCE_TRUSTED_USERNAME);
      String trustedUserPassword = System.getProperty(DocuwareTestConstants.INSTANCE_TRUSTED_USER_PASSWORD);
      String fileCabinetid = System.getProperty(DocuwareTestConstants.FILE_CABINET_ID);

      fixture.var("docuwareConnector.host", host);
      fixture.var("docuwareConnector.defaultInstance", defaultInstance);
      fixture.var("docuwareConnector.instances.primary.host", instanceHost);
      fixture.var("docuwareConnector.instances.primary.grantType", instanceGrantType);
      fixture.var("docuwareConnector.instances.primary.username", instanceUsername);
      fixture.var("docuwareConnector.instances.primary.password", instancePassword);
      fixture.var("docuwareConnector.instances.primary.trustedUserName", trustedUserName);
      fixture.var("docuwareConnector.instances.primary.trustedUserPassword", trustedUserPassword);
      fixture.var("docuwareConnector.instances.primary.filecabinetid", fileCabinetid);
    };
  }

  private Runnable runMockEnv(AppFixture fixture, IApplication app) {
    return () -> {
      fixture.var("docuwareConnector.host", "TESTHOST");
      fixture.var("docuwareConnector.username", "TESTUSER");
      fixture.var("docuwareConnector.password", "TESTPASS");
      fixture.var("docuwareConnector.filecabinetid", "123");
      RestClient restClient = RestClients.of(app).find("DocuWare");
      // change created client: use test url and a slightly different version of the DocuWareOAuth2TestFeature
      Builder builder = RestClient.create(restClient.name()).uuid(restClient.uniqueId())
          .uri("http://{ivy.engine.host}:{ivy.engine.http.port}/{ivy.request.application}/api/docuWareMock")
          .description(restClient.description()).properties(restClient.properties());
      // use test feature instead of real one
      for (RestClientFeature feature : restClient.features()) {
        if (feature.clazz().contains(OAuth2Feature.class.getCanonicalName())) {
          feature = new RestClientFeature(DocuWareOAuth2TestFeature.class.getCanonicalName());
        }
        builder.feature(feature.clazz());
      }
      builder.feature("ch.ivyteam.ivy.rest.client.security.CsrfHeaderFeature");
      restClient = builder.toRestClient();
      RestClients.of(app).set(restClient);
    };
  }

  public static List<DocuWareProperty> prepareDocuWareProperties() {
    List<DocuWareProperty> propertyList = new List<DocuWareProperty>();
    DocuWareProperty dwp = new DocuWareProperty();
    dwp.setFieldName("ACCESS_LEVEL");
    dwp.setItem("3");
    dwp.setItemElementName("String");
    propertyList.add(dwp);

    DocuWareFieldTableItem dwt = new DocuWareFieldTableItem();
    dwt.createRow().addColumnValue("NOTES__CONTENT", "HR input profile.", "String").addColumnValue("NOTES__AUTHOR",
        "PTA", "String");
    DocuWareProperty dwtp = new DocuWareProperty("EMPLOYEE_NOTES", dwt, "Table");
    propertyList.add(dwtp);

    DocuWareKeywordsField keywordField = new DocuWareKeywordsField();
    keywordField.append("1st Keyword");
    keywordField.append("2nd Keyword");
    DocuWareProperty keywordProperty = new DocuWareProperty("TAGS", keywordField, "Keywords");
    propertyList.add(keywordProperty);

    return propertyList;
  }

  public static DocuWareEndpointConfiguration prepareDocuWareEndpointConfiguration() {
    DocuWareEndpointConfiguration configuration = new DocuWareEndpointConfiguration();
    return configuration;
  }
}
