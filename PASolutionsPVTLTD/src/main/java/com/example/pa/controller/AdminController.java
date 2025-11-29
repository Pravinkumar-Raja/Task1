package com.example.pa.controller;

import java.util.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/welcome")
	public String meth1()
	{
		return "<h1>Welcome to Spring Boot Application</h1>";
	}
	@GetMapping("/data")
	public List<String> meth2()
	{
		List l=Arrays.asList("Mango","Grapes","Orange","Papaya");
		return l;
	}
}
