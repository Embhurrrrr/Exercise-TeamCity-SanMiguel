package org.ssglobal.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/greet")
	public String greetings() {
		return "Helloooo";
	}
}
