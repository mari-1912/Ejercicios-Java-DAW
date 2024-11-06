package EstudioEnCasa;

import java.util.Scanner;

public class ejercicio_tablas_multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 5. Bucles
		 * 
		 * 8. Muestra la tabla de multiplicar de un número introducido por teclado.
		 * 
		 * @author Luis José Sánchez
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número y le mostraré su tabla de multiplicar: ");
		int numeroIntroducido = sc.nextInt();
		        
		for (int i = 0; i <= 10; i++) {
			System.out.printf(numeroIntroducido + "x" + i + " = " + numeroIntroducido * i + "\n");
		}

		  
		

	}

}
