package Tema1;

import java.util.Scanner;

public class operador_ternario {

	public static void main(String[] args) {
		// int menor = 2>4 ? 2 : 4; 
		// si dos es mayor que cuatro me quedo con el primer número, es decir el 2 (true), 
		//como no lo es, me quedo con el segundo número, es decir el 4 (false)
		
		//EJERCICIO 4.4 
		// Programa que pide dos numeros por pantalla
		// y muestra el mensaje: el numero mayor es_ y el numero menor es_
		
		/*System.out.println("Escribe dos números: ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int condicion = 1<3?num1:num2;
		System.out.println("El número mayor es: " + num1 + " el número menor es: " + num2);
		scanner.close();*/
		System.out.println("Escribe dos números: ");
		int num1, num2, mayor, menor;
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		mayor = num1 > num2 ? num1 : num2;
		menor = num1 < num2 ? num1 : num2;
		System.out.println("El número mayor es: " + mayor + " el número menor es: " + menor);
		scanner.close();
	}

}
