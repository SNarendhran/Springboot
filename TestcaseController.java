package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class TestcaseController {
	@GetExchange("/Testcase")
	public String home() 
	{
		return "Welcome to Spring Boot";
	}
}
