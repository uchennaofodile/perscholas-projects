package org.uchennaofodile.FileUploadDemo.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.uchennaofodile.FileUploadDemo.Product;

@Controller
public class ProductController {
	@PostMapping("/product-input-form")
	public String inputProduct(Model model) {
	    model.addAttribute("product", new Product());
	    return "productForm";
	}
	
	@PostMapping("/save-product")
	   public String FileUpload(@RequestParam("images") MultipartFile[] files,
	                            Model model, Product product, RedirectAttributes redirect) throws IOException {
	       //path to the upload dir, can be read from a properties File as well
	       String uploadDir = "/Users/ahmshahparan/MultipleFileUpload";
	       // Save tile on system
	       for (MultipartFile file : files) {
	           if (!file.getOriginalFilename().isEmpty()) {
	               BufferedOutputStream BufferedOutputStream = new BufferedOutputStream(
	                       new FileOutputStream(new File(uploadDir, file.getOriginalFilename())));
	               //TODO fix
	               java.io.BufferedOutputStream outputStream = null;
				outputStream.write(file.getBytes());
	               outputStream.flush();
	               outputStream.close();
	           } else {
	               redirect.addFlashAttribute("msg", "Please select at least one file..");
	               return "redirect:/product-input-form";
	           }
	       }
	       model.addAttribute("msg", "Multiple files uploaded successfully. ");
	       model.addAttribute("product", product);
	       return "viewProductDetail";
	   }
	}



