package com.jpjc.powerblog.yehee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YeheeControllerTest {
	
	@GetMapping("/yehee/test")
	public String hello(){
		return("<h1>hello im yehee<h1>");
	}
}
