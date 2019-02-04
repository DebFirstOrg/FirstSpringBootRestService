package com.microservice.cloud.currencyconversionservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("/test")
	public String testMethod() {
		
		
		return "Hello world..........";
		
	}
	
	

}
