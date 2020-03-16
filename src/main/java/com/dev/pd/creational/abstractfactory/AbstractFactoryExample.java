package com.dev.pd.creational.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryExample {

	public static void main(String[] args) {
		
		System.out.println("Inicio del juego");
		System.out.println("**********************");
		System.out.println("Seleccione un acción:");
		System.out.println("1-> Crear Warrior");
		System.out.println("2-> Salir");
		
		Scanner scanner = new Scanner(System.in);
		int optionAction = scanner.nextInt();
		
		if (optionAction == 2) {
			System.out.println("Fin de la aplicación");
			System.exit(0);
		}
		
		System.out.println("Elige un nombre: ");
		String nameAvatar = scanner.next();
		
		AvatarAbstractFactory abstractFactory = new GoodAvatarFactory();
		Warrior warrior = abstractFactory.createWarrior(nameAvatar);
		System.out.println("Good " + nameAvatar + " la princesa Saly ha sido capturada debes combatir y vencer a como dé lugar" );
		System.out.println("Cargando ...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Listo");
		System.out.println("Presiona 1 para avanzar");
		System.out.println("Presiona 2 o cualquier tecla para inspeccionar");
		int action = scanner.nextInt();
		while (action == 1) {
			warrior.walk();
			warrior.walk();
			System.out.println("Presiona 1 para avanzar");
			System.out.println("Presiona 2 para inspeccionar");
			action = scanner.nextInt();
		}
		abstractFactory = new BadAvatarFactory();
		Warrior warriorBad = abstractFactory.createWarrior("Marlon");
		System.out.println("Oh vaya pero si es Marlon el destripador");
		
		warriorBad.walk();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		warriorBad.walk();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("La batalla está apunto de empezar");
		System.out.println("Cargando ...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		warriorBad.figth();
		System.out.println("Elige una acción: ");
		System.out.println("1-> Golpear");
		System.out.println("2-> Cambiar de arma");
		action = scanner.nextInt();
		
		int count = 0;
		while (action == 1) {
			warrior.figth();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			warrior.figth();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			warrior.figth();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			warriorBad.figth();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			warriorBad.figth();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			if (count == 3) {
				System.out.println("*****" + nameAvatar + " has vencido *****");
				System.out.println("Marlon tiene una honda gigante");
				System.out.println("Oprime 1 para tomar arma de Marlon ");
				action = scanner.nextInt();
				if (action == 1) {
					warrior.collectArm("honda gigante");
				}
				break;
			}
		}
		warrior.walk();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		warrior.walk();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("La princesa Saly está detrás del muro");
		System.out.println("Se recomienda cambiar de arma. Selecciona 2 para cambiar de arma");
		int actionArm = scanner.nextInt();
		if (actionArm == 2 && action == 1) {
			warrior.changeArm("honda gigante");
			System.out.println("Ahora puede usar honda gigante");
		}
		
		System.out.println("Seleccione 1 para golpear");
		int golpear = scanner.nextInt();	
		int count2 = 0;
		while (golpear == 1) {
			if (action == 1) {
				warrior.figth();
				warrior.figth();
				warrior.figth();
			} else {
				warrior.figth();
				warrior.figth();
				warrior.figth();
				warrior.figth();
				warrior.figth();
				warrior.figth();
			}
			count2++;
			if (count2 == 3) {
				System.out.println("EL muro se rompió");
				break;
			}
		}
		
		abstractFactory = new GoodAvatarFactory();
		Princess princess = abstractFactory.createPrincess("Saly");
		System.out.println("La princesa fue rescatada con éxito");
		System.out.println("Princesa: Oh " + nameAvatar + " eres el mejor");
		princess.kissTo(nameAvatar);
		
		System.out.println("Fin del juego");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.exit(0);
		
	}

	
	

}
