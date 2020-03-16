package com.dev.pd.creational.factoymethod;

public class MongoConnectionDB implements ConnectionDB {
	
	private boolean isConnected = false;

	@Override
	public void connect() {
		System.out.println("Conectando a MongoDB");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MongoDB conectado");
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
		System.out.println("Cerrando conexión a MongoDB");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isConnected = false;
		System.out.println("conexión a MongoDB cerrada");
	}
	
	public boolean getConnected() {
		return isConnected;
	}

}
