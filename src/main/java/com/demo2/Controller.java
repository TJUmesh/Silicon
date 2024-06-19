package com.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Controller {

	//this is Controller class
	@GetMapping
	public String demo()
	{
		return "This is Spring Boot Code";
	}
	
}
