package Tema1;

import java.util.Scanner;

public class Ejercicio31Edad {

	public static void main(String[] args) {
		// Pedir al usuario su edad y mostrar la edad que tendrá el año próximo
		int edad;
		System.out.println("Indica tu edad actual: ");
		try (Scanner scanner = new Scanner (System.in)) {
			edad = scanner.nextInt();
			scanner.close();
		}
		System.out.println("Tu edad actual es: " + edad + " años. "+ " El año que viene tendrás: " + (++edad) + " años.");
		
	}

}
