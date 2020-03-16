package com.dev.pd.creational.factoymethod;

public interface ConnectionDB {
	
	void connect();
	
	void insert(String auto);
	
	void close();
	
	static boolean isConnected(boolean isConnected) {
		return isConnected;
	}

}
