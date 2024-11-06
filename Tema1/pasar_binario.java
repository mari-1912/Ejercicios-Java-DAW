package Tema1;

import java.util.Scanner;

public class pasar_binario {

	public static void main(String[] args) {
		// pide un numero por pantalla y escribelo en binario
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un número entre el 10 y el 30: ");
		int resto1, resto2, resto3, resto4, resto5;
		int num = scanner.nextInt();
		resto1 = num % 2;
		num = num / 2;
		resto2 = num % 2;
		num = num / 2;
		resto3 = num % 2;
		num = num / 2;
		resto4 = num % 2;
		num = num / 2;
		resto5 = num % 2;
		num = num / 2;
		System.out.println("El número escrito en número binario es: " + resto5 + resto4 + resto3 + resto2 + resto1);
		scanner.close();
	}

}
