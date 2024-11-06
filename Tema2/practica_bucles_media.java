package Tema2;

import java.util.Scanner;

public class practica_bucles_media {

	public static void main(String[] args) {
		// Programa que pida 5 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
		
		//decalaramos las variables que vamos a utilizar
		int positivos=0, negativos=0, ceros=0;
		int sumaPositivo=0, sumaNegativo=0;
		//inicializamos la función Scanner
		Scanner sc = new Scanner(System.in);
		//Usamos el bucle for para pedir los 5 números por pantalla
		for (int i = 1; i <= 5; i++) {
			System.out.println("Indica el  " + i + "º número:");
			int num = sc.nextInt();
			
			//dentro del for, usamos un if para identificar los positivos, los negativos y los ceros
			if (num>0) {
				positivos = positivos + num;
				sumaPositivo++;
			} else if (num<0) {
				negativos = negativos + num;
				sumaNegativo++;
			} else {
				ceros++;
			}
			
			
		}
		
		//sacamos las notas medias 
		
		double mediaPositivos = sumaPositivo > 0 ? positivos / sumaPositivo : 0;
		double mediaNegativos = sumaNegativo > 0 ? negativos / sumaNegativo : 0;
		
		//pintamos por pantalla los resultados de las medias
		System.out.println("\nLa media de los números positivos es: " + mediaPositivos);
		System.out.println("\nLa media de los números negativos es: " + mediaNegativos);
		System.out.println("\nLa cantidad de ceros es: " + ceros);
		
		sc.close();
		

	}

}
