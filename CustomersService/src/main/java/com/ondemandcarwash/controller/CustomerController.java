package com.ondemandcarwash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
     @GetMapping("/hello")
	public String sayhello() {
		return "hello from customer";
	}
}
