package com.dev.pd.structural.adapter;

public class PhillipsSmartTV {
	
	public void connect() {
		// Phillips specific implementation...
		System.out.println("Phillips smart TV connected");
	}

	public void disconnect() {
		// Phillips specific implementation...
		System.out.println("Phillips smart TV disconnected");
	}

	public void menu() {
		// Phillips specific implementation...
		System.out.println("Phillips smart TV menu opened");
	}

	public void startPlay(long startTime) {
		// Phillips specific implementation...
		System.out.println("Phillips smart TV playback started at " + startTime);
	}

	public void ffw(short speed) {
		// Phillips specific implementation...
		System.out.println("Phillips smart TV fast forwarding playback with speed " + speed);
	}

	public void rwn(short speed) {
		// Phillips specific implementation...
		System.out.println("Phillips smart TV rewind playback with speed " + speed);
	}

	public void connectWifi(String wifiName) {
		// Phillips specific implementation...
		System.out.println("Phillips smart TV connected to wireless network with name " + wifiName);
	}

	public void showWidget(String widgetID) {
		// Phillips specific implementation...
		System.out.println("Phillips smart TV showing widget with ID " + widgetID);
	}

}
