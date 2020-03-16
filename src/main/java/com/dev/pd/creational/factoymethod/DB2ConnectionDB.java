package com.dev.pd.creational.factoymethod;

public class DB2ConnectionDB implements ConnectionDB {

	private boolean isConnected = false;

	@Override
	public void connect() {
		System.out.println("Conectando a DB2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("DB2 conectado");
		isConnected = true;
	}

	@Override
	public void insert(String auto) {
		if (isConnected)
			System.out.println("auto insertado " + auto);
		else
			System.err.println("Establezca primero una conexión");

	}

	@Override
	public void close() {
		System.out.println("Cerrando conexión a DB2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isConnected = false;
		System.out.println("conexión a DB2 cerrada");
	}
	
	public boolean getConnected() {
		return isConnected;
	}

}
