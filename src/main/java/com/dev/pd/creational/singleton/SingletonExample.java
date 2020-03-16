package com.dev.pd.creational.singleton;

import java.util.Scanner;

public class SingletonExample {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Inicio de la aplicación Futbol Total");
			System.out.println("1-> Llamar al capitán");
			System.out.println("2-> Salir");
			
			
			int option = scanner.nextInt();
			
			switch (option) {
			case 1:
				Captain captain = Captain.getInstance();
				System.out.println(captain);
				break;
			case 2:
				scanner.close();
				System.out.println("Fin de la aplicación");
				System.exit(0);
			default:
				System.out.println("Opción inválida");
				break;
			}
			
		} while (true);
		
	}

}
