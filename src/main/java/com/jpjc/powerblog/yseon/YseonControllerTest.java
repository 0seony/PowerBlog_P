package com.jpjc.powerblog.yseon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YseonControllerTest {
	
	@GetMapping("/0seony/test")
	public String hello(){
		return("<h1>hello im 0seony<h1>");
	}
}
