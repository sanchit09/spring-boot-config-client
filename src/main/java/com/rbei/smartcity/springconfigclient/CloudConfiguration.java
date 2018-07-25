package com.rbei.smartcity.springconfigclient;

public class CloudConfiguration {

	String minimum;
	String maximum;
	String hostname;
	
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	protected CloudConfiguration() {
	}
	
	protected CloudConfiguration(String minimum, String maximum, String hostname) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
		this.hostname = hostname;
	}
	public String getMinimum() {
		return minimum;
	}
	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}
	public String getMaximum() {
		return maximum;
	}
	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}
	
}
