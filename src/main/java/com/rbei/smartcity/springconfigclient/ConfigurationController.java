package com.rbei.smartcity.springconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@Autowired
	Environment env;
	
	@RequestMapping("/configs")
	public CloudConfiguration retrieveConfigurations() {
		CloudConfiguration cloudConfig = new CloudConfiguration(configuration.getMaximum(),configuration.getMinimum(), configuration.getHostname());
		
		System.out.println(env.getProperty("JAVA_HOME"));
		System.out.println(env.getProperty("HOST_NAME"));
		return cloudConfig;
	}
}
