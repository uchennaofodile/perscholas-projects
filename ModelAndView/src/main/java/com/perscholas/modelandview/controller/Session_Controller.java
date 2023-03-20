package com.perscholas.modelandview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.perscholas.modelandview.model.User;

@Controller
public class Session_Controller {
   
   @GetMapping("/dologin")
   public String doLogin(@ModelAttribute("u") User u, Model model) {
           //model.addAttribute("FormVar", u); Redundant and not needed
           return "UserForm";
          // We will create UserForm.html page in next step
       }

  //This example is redundant and will not be used 
//   @PostMapping("/Getuser")
//   public String userInfo(@ModelAttribute("u") User user, Model model) {
//       System.out.println("Email: " + user.getEmail());
//       System.out.println("First Name: " + user.getName());
//       System.out.println("Id: " + user.getId());
//       model.addAttribute("stu",user);
//       return "showData";
//  // We will create showData.html page in next step
//   }
   @PostMapping("/Getuser")
   public String userInfo(@ModelAttribute("u") User user) {
       System.out.println("Email: " + user.getEmail());
       System.out.println("First Name: " + user.getName());
       System.out.println("Id: " + user.getId());
       return "showData";
  // We will create showData.html page in next step
   }
}


