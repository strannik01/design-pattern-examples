package com.dev.pd.creational.builder;

public class Disk {
	
	private String mark;
	private String model;
	
	public Disk(String mark, String model) {
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
		return "Disk [mark=" + mark + ", model=" + model + "]";
	}
	
	
	
}
