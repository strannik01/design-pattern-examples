package com.dev.pd.creational.factoymethod;

import java.util.Scanner;

public class ConnectionDBExample {

	public static void main(String[] args) {
		System.out.println("********** ConnectionDBExample *********\n");
		int optionDB = 0;
		while (optionDB != 100) {
			System.out.println("\nSeleccione la base de datos para establecer conexión.");
			System.out.println("1. SQL Server");
			System.out.println("2. Oracle");
			System.out.println("3. MongoDB");
			System.out.println("4. Casandra");
			System.out.println("5. DB2");
			System.out.println("6. MySQL");
			System.out.println("100. Cerrar programa");
			
			Scanner scanner = new Scanner(System.in);
			optionDB = scanner.nextInt();
			
			if (optionDB == 100) {
				System.out.println("Fin de la aplicación");
				scanner.close();
				System.exit(0);
			}
			
			ConnectionDBFactory connectionDBFactory = new ConnectionDBFactory();
			ConnectionDB connection = connectionDBFactory.selectionConnectionDB(optionDB);
			connection.connect();
			
			System.out.println("Ingrese un valor para insertar: ");
			String value = scanner.next();
			connection.insert(value);
			connection.close();
		}
		
	}

}
