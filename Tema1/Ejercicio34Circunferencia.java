package Tema1;

import java.util.Scanner;

public class Ejercicio34Circunferencia {

	public static void main(String[] args) {
		// pedir al usuario el radio y mostrar longitud y area de la circunferencia
		
		float radio;
		final double PI = 3.141592;

		System.out.println("Indica el radio de la circunferencia: ");
		Scanner scanner = new Scanner (System.in);
		radio = scanner.nextFloat();
		
		// longitud 2*pi*r
		// area pi*r2
		
		System.out.println("La longitud de la circunferencia es: " + (2 * PI * radio) + " El área de la circunferencia es: " + (PI * (radio * radio))); 

		scanner.close();
	}

}
