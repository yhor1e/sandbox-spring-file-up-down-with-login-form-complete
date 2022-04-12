package com.example.uploadingfiles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class LogRestController {
	@GetMapping("/log/{name}")
	public String complete(@PathVariable String name) {  
		System.out.println("-------------------");
		System.out.println(name);
		return name;
	}
}