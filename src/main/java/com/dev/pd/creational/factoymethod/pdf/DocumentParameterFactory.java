package com.dev.pd.creational.factoymethod.pdf;

public class DocumentParameterFactory {
	
	public DocumentParameter selectDocument(String type) {
		switch (type) {
		case "invoice":
			return new InvoiceParameter();
		case "boleta":
			return new BoletaParameter();
		default:
			throw new IllegalArgumentException("El tipo " + type + " es inválido");
		}
	}

}
