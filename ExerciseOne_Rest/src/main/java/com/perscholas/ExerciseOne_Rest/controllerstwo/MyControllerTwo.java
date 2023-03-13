package com.perscholas.ExerciseOne_Rest.controllerstwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllerTwo{
@GetMapping({ "login"}) // either type '/' or index //same as /login
public String showIndex()
{
return "index";//when you access localhost:8080/login a corresponding controller method mapped to the 
//URL is invoked which returns a string
//Spring uses this returned string and appends .html to index to locate the necessary index.html file
//to render the file
//the template file with the name index.html must be present in the configured template location
//it will then be displayed in the browser
}
}