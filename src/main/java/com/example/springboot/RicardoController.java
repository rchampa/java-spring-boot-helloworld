package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RicardoController {

	@RequestMapping("/ricardo")
	public String index() {
		return "RicardoController";
	}

}
