package com.dev.pd.structural.adapter;

public class SamsungSmartTV {
	
	public void conn() {
		// Samsung specific implementation...
		System.out.println("Samsung smart TV connected");
	}

	public void disconn() {
		// Samsung specific implementation...
		System.out.println("Samsung smart TV disconnected");
	}

	public void openMenu() {
		// Samsung specific implementation...
		System.out.println("Samsung smart TV menu opened");
	}

	public void startPlayback(long startTime) {
		// Samsung specific implementation...
		System.out.println("Samsung smart TV playback started at " + startTime);
	}

	public void ffwPlayback(short speed) {
		// Samsung specific implementation...
		System.out.println("Samsung smart TV fast forwarding playback with speed " + speed);
	}

	public void rwnPlayback(short speed) {
		// Samsung specific implementation...
		System.out.println("Samsung smart TV rewind playback with speed " + speed);
	}

	public void wifiConn(String wifiName) {
		// Samsung specific implementation...
		System.out.println("Samsung smart TV connected to wireless network with name " + wifiName);
	}

	public void showWidget(String widgetID) {
		// Samsung specific implementation...
		System.out.println("Samsung smart TV showing widget with ID " + widgetID);
	}


}
