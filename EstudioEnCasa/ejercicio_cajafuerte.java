package EstudioEnCasa;

import java.util.Scanner;

public class ejercicio_cajafuerte {

	public static void main(String[] args) {
		/*
		 *  Realiza el control de acceso a una caja fuerte. La combinación
 *    será un número de 4 cifras. El programa nos pedirá la combinación
 *    para abrirla. Si no acertamos, se nos mostrará el mensaje
 *    “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 *    “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 *    oportunidades para abrir la caja fuerte.
		 */
		int combinacion = 1912;
		int numero;
		int intentos = 4;
		boolean acertado = false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca la clave de la caja fuerte: ");
			numero = sc.nextInt();
			
			if (numero == combinacion) {
				acertado = true;
			} else {
				System.out.println("Clave incorrecta!");
			} 
			
			intentos--;
			
		} while ((intentos > 0 && (!acertado)));
		
		if (acertado) {
			System.out.println("Has abierto la caja fuerte!");
		} else {
			System.out.println("Lo siento, has agotado las 4 oportunidades");
		}
		
		
	}

}
