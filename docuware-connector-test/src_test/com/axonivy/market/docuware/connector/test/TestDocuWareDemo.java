package com.axonivy.market.docuware.connector.test;

import org.junit.jupiter.api.Test;

import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.bpm.engine.client.BpmClient;
import ch.ivyteam.ivy.bpm.engine.client.ExecutionResult;
import ch.ivyteam.ivy.bpm.exec.client.IvyProcessTest;
import ch.ivyteam.ivy.environment.AppFixture;
import ch.ivyteam.ivy.security.ISession;

@IvyProcessTest
public class TestDocuWareDemo {
	
	@Test
	public void testOrganizations(BpmClient bpmClient, ISession session, AppFixture fixture, IApplication app) {
		fixture.environment("dev-axonivy");
		
		ExecutionResult result = bpmClient.start()
				.process("DocuWareDemo/organizations.ivp")
				.execute();
	}
}