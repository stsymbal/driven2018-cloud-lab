package com.bp3.driven2018.ZeroToCloudIn30MinLab;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	@Autowired
	RuntimeService runtimeService;
	
	public String startWelcomeProcess(final String name) {
		return runtimeService.startProcessInstanceByKey("Welcome", name).getId();
	}
}
