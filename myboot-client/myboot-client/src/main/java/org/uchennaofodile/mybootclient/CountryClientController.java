package org.uchennaofodile.mybootclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryClientController {
	@Autowired
	private CountryClient client;

	@GetMapping("/getCountry")
	public GetCountryResponse invokeCountryClientToGetCountry(GetCountryRequest request) {
		return client.getCountry(request.name);
	}
}