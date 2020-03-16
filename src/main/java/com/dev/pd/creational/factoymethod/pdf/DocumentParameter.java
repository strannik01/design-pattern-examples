package com.dev.pd.creational.factoymethod.pdf;

public interface DocumentParameter {
	
	public void createDocument(String xml);
	
	public default String extractRUC(String xml) {
		int data =  xml.indexOf('2');
		return xml.substring(data, data + 11);
	}

}
