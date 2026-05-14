package com.axonivy.market.docuware.connector.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.axonivy.market.docuware.connector.StampServiceData;

import ch.ivyteam.ivy.bpm.engine.client.BpmClient;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmElement;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmProcess;
import ch.ivyteam.ivy.bpm.exec.client.IvyProcessTest;
import ch.ivyteam.ivy.scripting.objects.List;

@IvyProcessTest(enableWebServer = true)
public class StampServiceTest extends DocuWareConnectorTest {
	private static final BpmElement ADD_STAMP_SP = BpmProcess.path("StampService")
			.elementName("addStamp(String, String, String, List<String>)");

	@Test
	public void uploadFile(BpmClient bpmClient) throws IOException {
		List<String> values = List.create(String.class, new String[] { "EXAMPLE VENDOR NAME" });
		var result = bpmClient.start().subProcess(ADD_STAMP_SP).withParam("configKey", Constants.CONFIG_KEY)
				.withParam("fileCabinetId", Constants.FILE_CABINET_ID_OK)
				.withParam("documentId", Constants.DOCUMENT_ID_OK).withParam("stampId", "xxx")
				.withParam("stampFieldValues", values).execute();
		StampServiceData data = result.data().last();
		data.getAnnotations();
		assertThat(data.getAnnotations()).isNotNull();
		assertThat(data.getAnnotations().getAnnotations().size() > 0);
	}

}
