package com.demo_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getMessage {
	
	@GetMapping("/message")
	public String GetData() {
		return "Hello";
	}

}
