package com.example.apirestspring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerUrl {
	@GetMapping("/")
	public String mensaje() {
		return "hola";
	}
}
