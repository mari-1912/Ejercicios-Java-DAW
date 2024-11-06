package Tema2;

import java.util.Scanner;

public class Ejercicio02_iguales {

	public static void main(String[] args) {
		// pedir dos numeros y decir si son iguales
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1==num2) {
			System.out.println("Ambos números son iguales");
		} else
			System.out.println("Son diferentes");
		
		sc.close();

	}

}
