package com.rbei.smartcity.springconfigclient;

public class CloudConfiguration {

	String minimum;
	String maximum;
	
	
	protected CloudConfiguration() {
	}
	protected CloudConfiguration(String minimum, String maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
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
