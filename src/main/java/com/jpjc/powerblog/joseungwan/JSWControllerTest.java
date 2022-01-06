package com.jpjc.powerblog.joseungwan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JSWControllerTest {
	@GetMapping("/joseungwan/test")
	public String hello(){
		System.out.println("ddddd");
		return("<h1>hello im seungwan!!222222<h1>");
	}

	@GetMapping("/joseungwan/test2")
	public String hello2(){
		System.out.println("ddddd");
		return("<h4>hello im seungwan!!!!<h4>");
	}
}