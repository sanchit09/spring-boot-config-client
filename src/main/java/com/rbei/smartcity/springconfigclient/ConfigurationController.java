package com.rbei.smartcity.springconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

	@Autowired
	private Configuration configuration;
	
	
	@RequestMapping("/configs")
	public CloudConfiguration retrieveConfigurations() {
		CloudConfiguration cloudConfig = new CloudConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
		return cloudConfig;
	}
}
