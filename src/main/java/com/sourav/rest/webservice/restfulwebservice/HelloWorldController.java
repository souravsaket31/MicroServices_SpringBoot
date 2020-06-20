package com.sourav.rest.webservice.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping(path = "/helloBean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hellow-world-Bean");
	}
}
