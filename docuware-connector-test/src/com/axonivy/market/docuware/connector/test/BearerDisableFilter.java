package com.axonivy.market.docuware.connector.test;

import java.io.IOException;

import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.core.Feature;
import jakarta.ws.rs.core.FeatureContext;

import com.axonivy.connector.docuware.connector.auth.DocuWareAuthFeature;

/**
 * Make the Bearer token unreadable by Ivy, otherwise it will throw an error because it is not really a bearer token.
 */
class BearerDisableFilter implements ClientRequestFilter {

	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		var headers = requestContext.getHeaders();
		var authHeader = headers.get(DocuWareAuthFeature.AUTHORIZATION);

		if(authHeader != null) {
			var authValue = authHeader.toString();
			if(authValue.contains(DocuWareAuthFeature.BEARER)) {
				headers.putSingle(DocuWareAuthFeature.AUTHORIZATION, authValue.replace(DocuWareAuthFeature.BEARER, "IgnoredBearer "));
			}
		}
	}

	protected static class BearerDisableFeature implements Feature {
		@Override
		public boolean configure(FeatureContext context) {
			var bearerFilter = new BearerDisableFilter();
			context.register(bearerFilter, Priorities.AUTHORIZATION + 1);
			return true;
		}

	}
}