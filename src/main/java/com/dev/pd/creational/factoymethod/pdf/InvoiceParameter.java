package com.dev.pd.creational.factoymethod.pdf;

public class InvoiceParameter implements DocumentParameter {
	
	private String ruc;
	
	public InvoiceParameter() {
		System.out.println("Creando Invoice");
	}

	@Override
	public void createDocument(String xml) {
		System.out.println("Extrayendo datos");
		
		ruc = extractRUC(xml);
		System.out.println("ruc: " + ruc);
		
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
	

}
