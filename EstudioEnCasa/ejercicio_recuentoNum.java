package EstudioEnCasa;

import java.util.Scanner;

public class ejercicio_recuentoNum {

	public static void main(String[] args) {
		/*
		 * 21. Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
		 * nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
		 * El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no
		 * se incluye en el cómputo.
		 */

		// el programa debe recoger numeros hasta un punto concreto, un numero negativo
		
		// nos tiene que decir cuantos numeros se han introducido (sin contar el negativo de parada)
		
		// realizar la media de los numeros impares
		
		// indicar cual es el numero mayor entre los pares
		
		//declaramos las variables que vamos a usar
		int num = 0, totalnum=0, sumaImpar=0, totalImpar=0, mayorPar=0;
		
		//llamamos a la funcion scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe números, cuando quieras parar escribe un negativo");
		
		//usamos un bucle para pedir  numeros al usuario con condicion de parada que sean numeros negativos
		
		do {
			
			num = sc.nextInt();
			
			if (num >=0) {
				totalnum++;
				
				if (num % 2 != 0) {
					sumaImpar+=num;
					totalImpar++;
				} else {
					
					if (num > mayorPar) {
						mayorPar = num;
						
					} else {}
					
				}
				
			} else {}
			
		} while (num >= 0);
		
		System.out.println("Los positivos son: " + totalnum);
		System.out.println("La media de los impares es: " + (sumaImpar/totalImpar));
		System.out.println("El mayor de los pares es: " + mayorPar);



		
		
		
		
	}

}
