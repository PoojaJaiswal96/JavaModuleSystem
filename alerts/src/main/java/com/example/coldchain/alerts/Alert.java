package com.example.coldchain.alerts;

import com.example.coldchain.common.ColdChain;

public class Alert {
	private String message;

	public Alert(String message) {
		this.message = message;
	}

	public void sendAlertMessage() {
		
		ColdChain coldChain = new ColdChain(2, 80);
		coldChain.findColdChainParameter();
		
		System.out.println(message);
		System.out.println("Alert message send successfully");
	}
}
