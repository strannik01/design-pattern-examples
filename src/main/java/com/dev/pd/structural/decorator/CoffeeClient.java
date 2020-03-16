package com.dev.pd.structural.decorator;

import java.util.Scanner;

public class CoffeeClient {

	public static void main(String[] args) {
		System.out.println("Preparando un rico café");
		System.out.println("************************");
		
		Coffee coffee = new DefaultCoffe();
		String coffeeMade = coffee.makeCoffee();
		System.out.println(coffeeMade);
		System.out.println(coffee.getCost());
		System.out.println("_________________");
		
		System.out.println("Seleccione el tipo de azúcar que desea:");
		System.out.println("1-> Blanca");
		System.out.println("2-> Rubia");
		System.out.println("3-> Edulcorante");
		System.out.println("Seleccione 'N' para ver siguiente opción, 'S' para salir");
		
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		
		checkExitOption(scanner, option);
		
		Coffee coffeeWhitSugar = getCoffeeWhitSugar(coffee, option);
		System.out.println(coffeeWhitSugar.makeCoffee());
		System.out.println(coffeeWhitSugar.getCost());
		System.out.println("_________________");
		
		System.out.println("Seleccione el tipo de especia:");
		System.out.println("1-> Vainilla");
		System.out.println("2-> Canela");
		System.out.println("3-> Azafrán");
		System.out.println("Seleccione 'S' para salir");
		
		option = scanner.nextLine();
		
		checkExitOption(scanner, option);
		
		Coffee coffeeWhitSpice = getCoffeeWhitSpice(coffeeWhitSugar, option);
		System.out.println(coffeeWhitSpice.makeCoffee());
		System.out.println(coffeeWhitSpice.getCost());
		System.out.println("_________________");
		
		System.out.println("Disfrute su café");
		scanner.close();
	}

	private static void checkExitOption(Scanner scanner, String option) {
		if (option.equalsIgnoreCase("S")) {
			System.out.println("Fin de la aplicación");
			scanner.close();
			System.exit(0);
		}
	}

	private static Coffee getCoffeeWhitSugar(Coffee coffee, String option) {
		switch (option) {
		case "1":
			return new WhiteSugarDecorator(coffee);
		case "2":
			return new BrunetteSugarDecorator(coffee);
		case "3":
			return new SweetenerDecorator(coffee);
		case "n":
		case "N":
			return coffee;
		default:
			throw new IllegalArgumentException("Tipo " + option + " no disponible");
		}
	}
	
	private static Coffee getCoffeeWhitSpice(Coffee coffee, String option) {
		switch (option) {
		case "1":
			return new VanillaDecorator(coffee);
		case "2":
			return new CinnamonDecorator(coffee);
		case "3":
			return new SaffronDecorator(coffee);
		case "n":
		case "N":
			return coffee;
		default:
			throw new IllegalArgumentException("Tipo " + option + " no disponible");
		}
	}

}
