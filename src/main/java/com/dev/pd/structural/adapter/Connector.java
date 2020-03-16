package com.dev.pd.structural.adapter;

public class Connector {
	
	public SonySmartTV connectToTV() {
		// Sony specific implementation...
		SonySmartTV sonySmartTVInterface = new SonySmartTV();
		System.out.println("Sony smart TV connected");
		return sonySmartTVInterface;
	}

	public void disconnect() {
		// Sony specific implementation...
		System.out.println("Sony smart TV disconnected");
	}

}
