package com.dev.pd.structural.adapter;

public class TVAdapterExample {

	public static void main(String[] args) {
		
		executeDefaultActions(new SonyAdapter(new Connector()));
		
		System.out.println("**************************************");
		
		executeDefaultActions(new PhillipsAdapter(new PhillipsSmartTV()));
		
		System.out.println("**************************************");
		
		executeDefaultActions(new SamsungAdapter(new SamsungSmartTV()));

	}
	
	private static void executeDefaultActions(TargetSmartTVInterface smartTVInterface) {
		smartTVInterface.connectToTV();
		smartTVInterface.connectToWifi("myPersonalWifi");
		smartTVInterface.showWidget("wifi.connected.notificator");
		smartTVInterface.startPlay(0);
	}

}
