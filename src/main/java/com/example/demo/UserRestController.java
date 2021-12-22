package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping(value="/greet")
	public String welcome()
	{
		return "Welcome to Monica IT";
	}
}
