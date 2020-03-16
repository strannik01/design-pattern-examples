package com.dev.pd.creational.builder;

public class Computer implements ComputerBuilder {
	
	private Processor processor;
	private Disk disk;
	private Memory memory;
	private GraficCard graficCard;
	Product product;
	

	@Override
	public ComputerBuilder addProcessor(Processor processor) {
		this.processor = processor;
		return this;
	}

	@Override
	public ComputerBuilder addDisk(Disk disk) {
		this.disk = disk;
		return this;
	}

	@Override
	public ComputerBuilder addMemory(Memory memory) {
		this.memory = memory;
		return this;
	}

	@Override
	public ComputerBuilder addRedCard() {
		System.out.println("Se añade tarjeta de red por default");
		return this;
	}

	@Override
	public ComputerBuilder addGraficCard(GraficCard graficCard) {
		this.graficCard = graficCard;
		return this;
	}

	@Override
	public Product constructComputer() {
		return new Product(processor, disk, memory, graficCard);
	}

	@Override
	public Product getConstructedComputer() {
		return product;
	}

}
