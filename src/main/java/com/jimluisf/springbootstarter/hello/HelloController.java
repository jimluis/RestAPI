package com.jimluisf.springbootstarter.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/")
@RestController
public class HelloController 
{
//	@GetMapping("/hello")
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}
	
	
}
