package com.dev.pd.creational.singleton;

public class Captain {
	private static Captain instance; 
	
	private Captain() {
		
	}
	
	public static synchronized Captain getInstance() {
		if (instance == null) {
			instance = new Captain();
			System.out.println("Nueva instancia creada de Captain");
		} else {
			System.out.print("Ya existe un capitán para tu equipo");
		}
		
		return instance;
	}

}
