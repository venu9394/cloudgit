package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessage {

	
@RequestMapping("service/{message}")
	
	public String welcome(@PathVariable String message) {
		
		/*return "welcome to IBM india india";*/
		return message +" !!!  IBM CLOUD Tool chain sample deployment..";
	}


}
