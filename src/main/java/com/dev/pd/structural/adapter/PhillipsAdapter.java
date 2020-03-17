package com.dev.pd.structural.adapter;

public class PhillipsAdapter implements TargetSmartTVInterface {

	private final PhillipsSmartTV phillipsSmartTVInterface;

	// -------------------------------------------------------------------------
	// Constructors:

	public PhillipsAdapter(PhillipsSmartTV phillipsSmartTVInterface) {
		this.phillipsSmartTVInterface = phillipsSmartTVInterface;
	}

	// -------------------------------------------------------------------------
	// TargetSmartTVInterface implementation:

	@Override
	public void connectToTV() {
		phillipsSmartTVInterface.connect();
	}

	@Override
	public void disconnectTV() {
		phillipsSmartTVInterface.disconnect();
	}

	@Override
	public void showMenu() {
		phillipsSmartTVInterface.menu();
	}

	@Override
	public void startPlay(long startTime) {
		phillipsSmartTVInterface.startPlay(startTime);
	}

	@Override
	public void ffw(short speed) {
		phillipsSmartTVInterface.ffw(speed);
	}

	@Override
	public void rwn(short speed) {
		phillipsSmartTVInterface.rwn(speed);
	}

	@Override
	public void connectToWifi(String wifiName) {
		phillipsSmartTVInterface.connectWifi(wifiName);
	}

	@Override
	public void showWidget(String widgetID) {
		phillipsSmartTVInterface.showWidget(widgetID);
	}
}
