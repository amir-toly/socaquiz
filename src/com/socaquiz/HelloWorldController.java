package com.socaquiz;

import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping(value = "/{helloWorldId}", method = RequestMethod.GET)
	public @ResponseBody HelloWorld printHello(@PathVariable Long helloWorldId) {
		HelloWorldDao helloWorldDao = new HelloWorldDao(
				Persistence.createEntityManagerFactory("com.socaquiz.jpa"));
		
		return helloWorldDao.getById(helloWorldId);
	}
}
