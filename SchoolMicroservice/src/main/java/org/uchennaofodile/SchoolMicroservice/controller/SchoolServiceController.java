package org.uchennaofodile.SchoolMicroservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.uchennaofodile.SchoolMicroservice.model.Schools;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@RestController
public class SchoolServiceController {

	static List<Schools> SchoolList = new ArrayList<>();
	static {

		SchoolList = new ArrayList<>();
		Schools s1 = new Schools(UUID.randomUUID(), "PerscholasNY", "NYC");
		Schools s2 = new Schools(UUID.randomUUID(), "PerscholasNJ", "NJ");
		Schools s3 = new Schools(UUID.randomUUID(), "PerscholasDA", "Dallas");
		Schools s4 = new Schools(UUID.randomUUID(), "PerscholasAT", "Atlanta ");
		Schools s5 = new Schools(UUID.randomUUID(), "PerscholasBA", "Baltimore ");
		Schools s6 = new Schools(UUID.randomUUID(), "PerscholasBA", "Boston ");
		Schools s7 = new Schools(UUID.randomUUID(), "PerscholasDE", "Detroit ");
		SchoolList.add(s1);
		SchoolList.add(s2);
		SchoolList.add(s3);
		SchoolList.add(s4);
		SchoolList.add(s5);
		SchoolList.add(s6);
		SchoolList.add(s7);

	}
	
	//Routes
	
	@GetMapping("/ClientTwo-StudentService")
	public ResponseEntity<?> callEurekaClient2() {
		return new ResponseEntity<>("Hello From Eureka Client Two - Student Service", HttpStatus.OK);
	}
	@GetMapping("/addschool/{id}")
	public String showProduct(@PathVariable("id") UUID id) {
		Schools newSchool = new Schools(id, "PerscholasPHI", "Philadelphia");
		return "Schools is going to add --> " + newSchool.toString();
	}
	@GetMapping("/allSchools")
	List<Schools> getAllSchools(){
		return SchoolServiceController.SchoolList;
	}
	
}
