package com.example.coldchain.SpringRunnermodule;

import com.example.coldchain.alerts.Alert;


//@SpringBootApplication
public class ColdchainVisibilityApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(ColdchainVisibilityApplication.class, args);
//	}
	
	  public static void main(String[] args) {
	
	    Alert alert = new Alert("item is in good condition");
	        alert.sendAlertMessage();
	  	  
	  }
}
