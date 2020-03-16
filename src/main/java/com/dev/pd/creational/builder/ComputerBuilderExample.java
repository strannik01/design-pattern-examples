package com.dev.pd.creational.builder;

public class ComputerBuilderExample {

	public static void main(String[] args) {
		System.out.println("***ComputerBuilderExample Demo***");
		System.out.println("Construya su PC");
		
		
		final Product product = new Computer().addProcessor(new Processor("Intel", "Core i5"))
				.addDisk(new Disk("Western Digital", "WD1600AAJB")).addMemory(new Memory("Kington", "DDR3")).constructComputer();
		
		System.out.println(product);
		System.out.println("--------------");
		
		final Product product2 = new Computer().addProcessor(new Processor("AMD", "Ryzen 5"))
				.addDisk(new Disk("Western Digital", "WD1589AAJX")).addMemory(new Memory("Scan", "8 GB")).addGraficCard(new GraficCard("GRAF05", "P9")).constructComputer();
		
		System.out.println(product2);
		System.out.println("--------------");
		
	}

}
