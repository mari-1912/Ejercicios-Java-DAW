package practica_ex2;

import java.util.Scanner;

public class ejercicio1_primos {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1: Comprobar si un número es primo
		 * Escribe un programa que pida al usuario que ingrese un número entero positivo y 
		 * determine si ese número es un número primo. Un número es primo si solo es divisible por 1 y por sí mismo.
		 * Utiliza un bucle para verificar los divisores del número.
		 * Usa condiciones (if) para determinar si el número tiene divisores además de 1 y el propio número.
		 */
		
		boolean esPrimo = true;
		int i = 2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		while (i <= (num/2) && esPrimo) {
			if (num % i == 0) {
				
				esPrimo = false;
				System.out.println("No es primo");
				
			} else {
				
				esPrimo = true;
				System.out.println("Es primo");
			} i++;
		}
	}

}
