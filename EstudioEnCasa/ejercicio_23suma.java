package EstudioEnCasa;

import java.util.Scanner;

public class ejercicio_23suma {

	public static void main(String[] args) {
		/*23. Escribe un programa que permita ir introduciendo una serie indeterminada
 *     de números mientras su suma no supere  el valor 10000. Cuando esto último
 *     ocurra, se debe mostrar el total acumulado, el contador de los números
 *     introducidos y la media.
 *     */
		
		int num, suma=0, totalnum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe números, se para cuando su suma llegue a 1000.");
		
		while (suma <= 1000) {
			
			num = sc.nextInt();
			
			suma+=num;
			
			totalnum++;
		}
		
		System.out.println("El total de númmeros acumulado es: " + totalnum);
		System.out.println("El total de la suma es: " + suma);
		System.out.println("La media de los números es: " + (suma / totalnum));


		

	}

}
