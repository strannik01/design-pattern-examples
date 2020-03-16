package com.dev.pd.creational.factoymethod.pdf;

public class BoletaParameter implements DocumentParameter {

	public BoletaParameter() {
		System.out.println("Creando Boleta");
	}
	
	@Override
	public void createDocument(String xml) {
		System.out.println("Extrayendo datos");
		
	}

}
