package Tema1;

import java.util.Scanner;

public class Ejercicio35NumPar {

	public static void main(String[] args) {
		// pedir al usuario un número y mostrar si es par o impar
		
		Scanner scanner = new Scanner (System.in);

		System.out.print("Introduce un número: ");
		int numero = scanner.nextInt();
	    // cuando el if solo tiene una linea no hace falta poner llaves    
	    if (numero % 2 == 0) {
	    	System.out.println("El número " + numero + " es par.");
	    } else {
	    	System.out.println("El número " + numero + " es impar.");
	    }
	        
	    scanner.close();

	}

}
