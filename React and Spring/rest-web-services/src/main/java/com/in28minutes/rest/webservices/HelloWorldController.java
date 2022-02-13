package com.in28minutes.rest.webservices; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller 
@RestController
public class HelloWorldController {
	
	@GetMapping( path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping( path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	//n g
	@GetMapping( path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

}