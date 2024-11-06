package Tema1;

import java.util.Scanner;

public class Ejercicio32Anyos {

	public static void main(String[] args) {
		// pedir al usuario el año actual, el año que nació y mostrar los años que tiene
		int actual;
		int nac;
		
		System.out.println("Indica el año actual: ");
		Scanner scanner = new Scanner (System.in);
		actual = scanner.nextInt();
		System.out.println("Indica tu año de nacimiento: ");
		nac = scanner.nextInt();
		
		System.out.println("Actualmente tienes: " + (actual - nac) + " años.");
	
		scanner.close();

	}

}
