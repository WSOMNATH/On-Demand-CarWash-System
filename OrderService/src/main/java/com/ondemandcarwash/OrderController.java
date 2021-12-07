package com.ondemandcarwash;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	@GetMapping("/hello")
public String sayhello() {
	return "thanks for order";
}
}
