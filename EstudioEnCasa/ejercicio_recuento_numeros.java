package EstudioEnCasa;

import java.util.Scanner;

public class ejercicio_recuento_numeros {

	public static void main(String[] args) {
		//13. Escribe un programa que lea una lista de diez números y determine
		// cuántos son positivos, y cuántos son negativos.
		
		Scanner sc = new Scanner(System.in);
		
		int numeros;
		int negativos = 0;
		int positivos = 0;
		
		
		
		for (int i = 0;i < 10;i++) {
			
			System.out.println("Introduce el " + (i + 1) + "º númmero: ");
			numeros = sc.nextInt();

			if (numeros > 0) {
				positivos++;
			} else {
				negativos++;
			}
						
		}
		
		System.out.println("Los números positivos son: " + positivos + " y los números negativos son: " + negativos);
		
		
	}

}
