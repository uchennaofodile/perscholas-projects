package com.perscholas.ExerciseOne_Rest.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("home")
public class MyController {
@RequestMapping({"/login"}) // either type '/' or index
public String showlogin()
{//hostname:port/home/login
return "inboxpage"; //html file name
}
@RequestMapping("/")
public String simplemethod() {
//mapped to hostname:port/home/
return "inboxpage";
}
@RequestMapping("/index")//declares page url
public String showindex() {//method name should describe the page that is being returned
//mapped to hostname:port/home/index/
return "inboxpage"; //html file we want to return
}
}