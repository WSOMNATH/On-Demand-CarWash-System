package com.ondemandcarwash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
@GetMapping("/hello")
	public String Sayhelo() {
		return "hello from Admin";
	}
}
