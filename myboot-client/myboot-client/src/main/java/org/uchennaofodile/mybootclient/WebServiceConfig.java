package org.uchennaofodile.mybootclient;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.context.annotation.Bean;
import org.springframework.context. annotation.Configuration;
 @Configuration
public class WebServiceConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
 Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
 marshaller.setContextPath("org.uchennaofodile.mybootclient");
 return marshaller;
	}
 @Bean
 public CountryClient countryClient(Jaxb2Marshaller marshaller) {
 CountryClient client = new CountryClient();
 client.setDefaultUri("http://localhost:8080/ws/countries.wsdl");
 client.setMarshaller (marshaller);
 client.setUnmarshaller (marshaller);
 return client;
 }
	}