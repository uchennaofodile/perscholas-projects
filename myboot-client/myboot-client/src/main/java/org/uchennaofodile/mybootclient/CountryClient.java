package org.uchennaofodile.mybootclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CountryClient extends WebServiceGatewaySupport {
	private static final Logger Log = LoggerFactory.getLogger(CountryClient.class);

	public GetCountryResponse getCountry(String country) {
		GetCountryRequest request = new GetCountryRequest();
		request.setName(country);
		getWebServiceTemplate();

		Log.info("Requesting information for " + request.getName());

		GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);
		return response;
	}

}