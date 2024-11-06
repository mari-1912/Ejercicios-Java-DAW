package Tema1;

import java.util.Scanner;

public class Eejercicio_03_Operacion {

	public static void main(String[] args) {
		// Escribe un programa que pida por pantalla dos números
		// y muestre el resultado de la +, la -, la *, la /
		
		int num1, num2;
		
		System.out.println("Escribe dos números: ");
		Scanner scanner = new Scanner (System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		System.out.println("Los números introducidos son: " + num1 + " y " + num2);
		scanner.close();
		
		System.out.println("La suma de ambos números es: " + (num1 + num2));
		System.out.println("La resta de ambos números es: " + (num1 - num2));
		System.out.println("La multiplicación de ambos números es: " + (num1 * num2));
		System.out.println("La división de ambos números es: " + (num1 / num2));
		
	}

}
