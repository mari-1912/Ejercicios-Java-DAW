package Tema2;

import java.util.Scanner;

public class simulacroExamen_23octubre {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa en java que pida 5 números enteros 
		 * El bucle se ejecutará 5 veces
		 * Puede usarse while o for
		 */
		
		//funcion escaner para despues poder pedir los numeros por pantalla
		Scanner sc = new Scanner(System.in);
		
		//declaramos las distintas variables
		double positivos = 0, negativos = 0, ceros = 0, sumaPositivos = 0, sumaNegativos = 0;
		
		//bucle for para que se hagan las comprobaciones según el numero indicado (5)
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Introduce número: ");
			double numeros = sc.nextDouble(); //pedimos los numeros por pantalla
			
			//condicion con if para determinar cuales son positivos, negativos o 0
			if (numeros > 0) {
				positivos = positivos + numeros;
				sumaPositivos++;
			} else if (numeros < 0) {
				negativos = negativos + numeros;
				sumaNegativos++;
			} else {
				ceros++;
			}
			
		}
		
		//realizamos las medias 
		double mediaPositivos = (positivos / sumaPositivos);
		double mediaNegativos = (negativos / sumaNegativos);
		
		//imprimimos por pantalla el resultado
		System.out.println("El número de ceros introducidos es de: " + ceros);
		System.out.println("Media de los positivos: " + mediaPositivos);
		System.out.println("Media de los negativos: " + mediaNegativos);
		

	}

}
