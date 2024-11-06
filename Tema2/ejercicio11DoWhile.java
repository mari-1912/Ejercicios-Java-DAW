package Tema2;

import java.util.Scanner;

public class ejercicio11DoWhile {

	// control+shift+f formatea el codigo
	
	public static void main(String[] args) {
		/*
		 * programar que pide numeros por pantalla hasta que se introduzca el 0 y cuando termine muestre el mayor
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		int mayor = Integer.MIN_VALUE;
		
		System.out.println("Indica números, 0 para terminar: ");
		
		do {
			System.out.println("Número: ");
			num = sc.nextInt();
			if (num > mayor) {
				mayor = num;
			}
		} while (num!=0);
		
		System.out.println("El mayor es: " + mayor);
		sc.close();
		

	}

}
