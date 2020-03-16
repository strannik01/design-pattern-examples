package com.dev.pd.creational.builder;

public interface ComputerBuilder {
	
	ComputerBuilder addProcessor(Processor processor);
	ComputerBuilder addDisk(Disk disk);
	ComputerBuilder addMemory(Memory memory);
	ComputerBuilder addRedCard();
	ComputerBuilder addGraficCard(GraficCard graficCard);
	Product constructComputer();
	Product getConstructedComputer();

}
