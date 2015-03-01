package com.socaquiz;

import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody HelloWorld printHello() {
		HelloWorldDao helloWorldDao = new HelloWorldDao(
				Persistence.createEntityManagerFactory("com.socaquiz.jpa"));
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("Spring MVC Framework!");
		
		helloWorldDao.create(helloWorld);
		
		return helloWorldDao.getById(helloWorld.getId());
	}
}
