package com.perscholas.PostMappingDemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.perscholas.PostMappingDemo.model.User;

@RestController
public class Usercontroller {
@PostMapping("/users")//handles HTTP Post Request
public void printData(@RequestBody User user) {//Retrieves the request's body from the server and automatically converts it to a Java Object
	System.out.println("Printing the user data: " +user);

}
}
