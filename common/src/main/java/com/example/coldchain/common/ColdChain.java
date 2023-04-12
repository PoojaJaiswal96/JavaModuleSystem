package com.example.coldchain.common;

public class ColdChain {
	
	public Integer temp;
	public Integer humidity;
	
	
	public ColdChain(Integer temp, Integer humidity) {
		super();
		this.temp = temp;
		this.humidity = humidity;
	}
	
	
	public void findColdChainParameter() {
		System.out.println( " Temprature : " +  temp +  " humidity : " + humidity);
	}
	
	
	

}
