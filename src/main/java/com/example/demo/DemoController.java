package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot + WAVEFRONT! and Mae and Benny";
	}

}
