package com.dev.pd.structural.adapter;

public class SonyAdapter implements TargetSmartTVInterface {
	
	private final Connector sonyConnector;
	private SonySmartTV sonySmartTVInterface;
	
	public SonyAdapter(Connector sonyConnector) {
		this.sonyConnector = sonyConnector;
	}

	@Override
	public void connectToTV() {
		sonySmartTVInterface = sonyConnector.connectToTV();
	}

	@Override
	public void disconnectTV() {
		sonyConnector.disconnect();
	}

	@Override
	public void showMenu() {
		sonySmartTVInterface.openMenu();
	}

	@Override
	public void startPlay(long startTime) {
		sonySmartTVInterface.play(startTime);
	}

	@Override
	public void ffw(short speed) {
		sonySmartTVInterface.fastForwardPlayback(speed);
	}

	@Override
	public void rwn(short speed) {
		sonySmartTVInterface.rewindPlayback(speed);
	}

	@Override
	public void connectToWifi(String wifiName) {
		sonySmartTVInterface.connectToWifi(wifiName);
	}

	@Override
	public void showWidget(String widgetID) {
		sonySmartTVInterface.openWidget(widgetID);
	}

}
