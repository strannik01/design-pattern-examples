package com.dev.pd.creational.builder;

public class Processor {

	private String mark;
	private String model;

	public Processor(String mark, String model) {
		super();
		this.mark = mark;
		this.model = model;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Processor [mark=" + mark + ", model=" + model + "]";
	}
	
	

}
