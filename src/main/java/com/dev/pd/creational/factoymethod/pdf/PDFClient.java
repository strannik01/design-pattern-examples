package com.dev.pd.creational.factoymethod.pdf;

public class PDFClient {

	public static void main(String[] args) {
		String xml = "<Invoice><Ruc>20551093035</Ruc></Invoice>";
		DocumentParameterFactory factory = new DocumentParameterFactory();
		DocumentParameter documentPar = factory.selectDocument("invoice");
		documentPar.createDocument(xml);
	}

}
