package com.jpjc.powerblog.gaeul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GaeulControllerTest {

	@GetMapping("/gaeul/test")
	public String hello() {
		return("<h1>hello im gaeul<h1>");

	}
}

