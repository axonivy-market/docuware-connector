package com.axonivy.market.docuware.connector.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.axonivy.connector.docuware.connector.DocuWareService;
import com.axonivy.market.docuware.connector.constants.DocuwareTestConstants;

import ch.ivyteam.ivy.environment.IvyTest;

@IvyTest
public class DocuWareServiceTest extends DocuWareConnectorTest {
	private static final String PLAINTEXT = "p=IV&play=123&fc=abc&lct=veryfast";

	@Test
	void testEncryptAndDecrypt() {
		String encrypt = DocuWareService.get().dwEncrypt(DocuwareTestConstants.CONFIG_KEY_TEST, PLAINTEXT);
		assertNotNull(encrypt);

		String decrypt = DocuWareService.get().dwDecrypt(DocuwareTestConstants.CONFIG_KEY_TEST, encrypt);
		assertEquals(PLAINTEXT, decrypt);
	}
}
