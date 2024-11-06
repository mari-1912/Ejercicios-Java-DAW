package Tema2;

import java.util.Scanner;

public class practica_bucles_calculoFactorial {

	public static void main(String[] args) {
		// Programa que pida un número y calcule su factorial. // por ejemplo: el factorial de 10 es:  10*9*8*7*6*5*4*3*2*1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un número: ");
		int num, factorial = 1;
		num = sc.nextInt();
		
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("\nEl factorial de " + num + " es: " + factorial);
		
		sc.close();
	}

}
