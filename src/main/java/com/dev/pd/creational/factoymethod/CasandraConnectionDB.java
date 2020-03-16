package com.dev.pd.creational.factoymethod;

public class CasandraConnectionDB implements ConnectionDB {
	
	private boolean isConnected = false;

	@Override
	public void connect() {
		System.out.println("Conectando a Casandra");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Casandra conectado");
		isConnected = true;
	}

	@Override
	public void insert(String auto) {
		if (isConnected) {
			System.out.println("auto insertado " + auto);
			System.out.println("Datos del auto:");
			System.out.println("Color: rojo");
			System.out.println("Marca: Toyota");
			System.out.println("Modelo: Yaris");
		} else
			System.err.println("Establezca primero una conexión");

	}

	@Override
	public void close() {
		System.out.println("Cerrando conexión a Casandra");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isConnected = false;
		System.out.println("conexión a Casandra cerrada");
	}
	
	public boolean getConnected() {
		return isConnected;
	}

}
