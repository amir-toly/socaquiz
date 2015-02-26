package com.socaquiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody HelloWorld printHello() {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("Spring MVC Framework!");
		
		return helloWorld;
	}
}
