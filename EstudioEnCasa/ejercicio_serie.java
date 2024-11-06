package EstudioEnCasa;

import java.util.Scanner;

public class ejercicio_serie {

	public static void main(String[] args) {
		/*
		 * programa que pida numero entero positivo y
		 * calcule el resultado de esta serie:
		 * 1+1/2+1/3+1/4...
		 * si es escribe un numero incorrecto el prog
		 * no se ejecuta, pregunta de nuevo el num. 
		 */
		int num, i = 1;
		float resultado = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {	
			System.out.println("Ingresa un número entero positivo:");
			num = sc.nextInt();
			
			if (num > 0) {
				System.out.println("Excelente");
				while (i <= num) {
					resultado += (1/(float)i);
					i++;
				}
				
				/*for (int i = 1; i <= num;i++) {
					resultado += (1/(float)i);
				}*/
				
				System.out.println("El resultado es: " + resultado);
				{break;}
			} 
			else {
				System.out.println("El número no es correcto");
			}
		}
	}

}
