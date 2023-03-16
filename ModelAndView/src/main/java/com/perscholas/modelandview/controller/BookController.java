package com.perscholas.modelandview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {
	@GetMapping("/books/{ISBN}")
	public String showBookDetails(@PathVariable("ISBN") String id, Model model){
	 	  model.addAttribute("ISBNAttribute", id);
	 	  return "bookDetails";
	}

}
