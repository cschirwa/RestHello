package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping()
	public String hi_default() {
		return "Hello. \n "
				+ " You can try /{name}";
	}

	@GetMapping("/{name}")
	public String hi(@PathVariable String name) {
		return "Hi " + name;
	}
	
}
