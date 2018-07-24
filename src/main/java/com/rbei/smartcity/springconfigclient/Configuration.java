package com.rbei.smartcity.springconfigclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("cloud-config-client")
public class Configuration {

	
	private String maximum;
	private String minimum;
	
	protected Configuration() {
		
	}
	
	public Configuration(String maximum, String minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	
	public String getMaximum() {
		return maximum;
	}
	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}
	public String getMinimum() {
		return minimum;
	}
	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}
}
