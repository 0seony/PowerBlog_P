package com.jpjc.joseungwan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSWControllerTest {
	@GetMapping("/joseungwan/test")
	public String hello(){
		return("<h1>hello im seungwan<h1>");
	}
}
