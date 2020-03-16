package com.dev.pd.structural.adapter;

public class SamsungAdapter implements TargetSmartTVInterface {

	private final SamsungSmartTV samsungSmartTVInterface;

	// -------------------------------------------------------------------------
	// Constructors:

	public SamsungAdapter(SamsungSmartTV samsungSmartTVInterface) {
		this.samsungSmartTVInterface = samsungSmartTVInterface;
	}

	// -------------------------------------------------------------------------
	// TargetSmartTVInterface implementation:

	@Override
	public void connectToTV() {
		samsungSmartTVInterface.conn();
	}

	@Override
	public void disconnectTV() {
		samsungSmartTVInterface.disconn();
	}

	@Override
	public void showMeny() {
		samsungSmartTVInterface.openMenu();
	}

	@Override
	public void startPlay(long startTime) {
		samsungSmartTVInterface.startPlayback(startTime);
	}

	@Override
	public void ffw(short speed) {
		samsungSmartTVInterface.ffwPlayback(speed);
	}

	@Override
	public void rwn(short speed) {
		samsungSmartTVInterface.rwnPlayback(speed);
	}

	@Override
	public void connectToWifi(String wifiName) {
		samsungSmartTVInterface.wifiConn(wifiName);
	}

	@Override
	public void showWidget(String widgetID) {
		samsungSmartTVInterface.showWidget(widgetID);
	}
}
