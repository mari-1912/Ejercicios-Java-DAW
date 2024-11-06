package Tema2;

import java.util.Scanner;

public class Ejercicio03_mayor {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// dos numeros y ordena de  mayor a menor
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe dos números: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num2>num1) {
			System.out.println(num2 + " es mayor que " + num1);
		} else
			System.out.println(num2 + " es igual que " + num1);
		
		sc.close();
		
		print ("este mensaje");
	}
	
	/**
	 * 
	 * @param mensaje
	 */

	private static void print (String mensaje) {
		System.out.println(mensaje);
	}
	
	/**
	 * funcion suma
	 * @param num1 operando 1
	 * @param num2 operando 2
	 * @return resultado
	 * @author mari1
	 *@since 3/10/2024 
	 */
	
	private static int sumar (int num1, int num2) {
		return num1+num2;
	}
	
}
