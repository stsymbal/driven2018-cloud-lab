package com.bp3.driven2018.ZeroToCloudIn30MinLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	WelcomeService welcomeService;
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue="World") String name) {
		return String.format("Hello, %s! A welcome process instance with id=%s has been started for you.",
				name,
				welcomeService.startWelcomeProcess(name));
	}
}
