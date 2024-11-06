package EstudioEnCasa;

import java.util.Scanner;

public class ejercicio_numerosPrimos {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que diga si un número introducido por teclado
 *     es o no primo. Un número primo es aquel que sólo es divisible entre
 *     él mismo y la unidad.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		boolean esPrimo = true;
		
		System.out.println("Indica un número: ");
		
		int num = sc.nextInt();
		
		for (int i = 2; i < num; i++) {
			
			if (num % i == 0) {
				
				esPrimo = false;
				System.out.println("No es un número primo");
			} else {
				
				esPrimo = true;
				System.out.println("Es primo");
			}
		}

	}

}
