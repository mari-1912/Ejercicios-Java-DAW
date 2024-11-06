package Tema1;

import java.util.Scanner;

public class Ejercicio33Media {

	public static void main(String[] args) {
		// pedir al usuario dos notas y calcular la media
		float nota1;
		float nota2;
		
		System.out.println("Indica dos notas para calcular tu nota media: ");
		Scanner scanner = new Scanner (System.in);
		nota1 = scanner.nextFloat();
		nota2 = scanner.nextFloat();
		
		System.out.println("Tu nota media es: " + ((nota1 + nota2) / 2));
		
		scanner.close();

	}

}
