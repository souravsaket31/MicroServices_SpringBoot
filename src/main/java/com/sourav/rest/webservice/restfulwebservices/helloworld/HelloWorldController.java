package com.sourav.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/helloBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello-world-Bean");
	}

	@GetMapping(path = "/hello/{name}")
	public HelloWorldBean helloThere(@PathVariable String name)

	{
		return new HelloWorldBean(String.format("Welcome, %s", name));
	}
}
