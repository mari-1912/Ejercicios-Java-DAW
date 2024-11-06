package Tema2;

import java.util.Scanner;

public class ejercicio12_while_binario {

	public static void main(String[] args) {
		/*
		 * Usando while, pide un número, pasar este a binario 
		 */
		//1. pedir el numero
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un número: ");
		int num = sc.nextInt();
		
		//2. declarar la variable para almacenar el número convertido
		String binario = " ";
		
		//3. inicio bucle
		while (num>0) {
			//4. calcular el resto
			int resto = num % 2;
			//5. actualizar el valor del numero con la division por 2
			num/= 2;
			//6. concatenar el resto a lo que valia binario
			binario = resto+binario;
			//7. fin bucle
		}
		
		System.out.println("\nEl número en binario es: " + binario);
		
		sc.close();
	}

}
