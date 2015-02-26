package com.socaquiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView printHello() {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("Spring MVC Framework!");
		
		return new ModelAndView("hello", "helloWorld", helloWorld);
	}
}
