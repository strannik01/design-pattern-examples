package com.dev.pd.creational.builder;

public class Product {

	private Processor processor;
	private Disk disk;
	private Memory memory;
	private GraficCard graficCard;

	public Product(Processor processor, Disk disk, Memory memory, GraficCard graficCard) {
		super();
		this.processor = processor;
		this.disk = disk;
		this.memory = memory;
		this.graficCard = graficCard;
	}

	@Override
	public String toString() {
		return "Product [processor=" + processor + ", disk=" + disk + ", memory=" + memory + ", graficCard="
				+ graficCard + "]";
	}

}
