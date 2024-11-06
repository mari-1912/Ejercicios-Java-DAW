package EstudioEnCasa;

import java.util.Scanner;

public class piramide_num {

	public static void main(String[] args) {
		/**
		 * 24. Escribe un programa que lea un número N e imprima una pirámide de números con N filas como
		 *     en la siguiente figura: 
		 *          1 
		 *         121
		 *        12321 
		 *       1234321
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica la altura de la pirámide");
		
		int num = sc.nextInt();
		int i=0;
		int altura = 1;
		int espacios = num - 1;
		
		while (altura <= num) {
			
			for (i = 1; i <= espacios; i++) {
				
				System.out.print(" ");
			}
			
			for (i = 1; i < altura; i++) {
				
				System.out.print(i);
			}
			
			for (i = altura; i > 0; i--) {
				System.out.print(i);
			}
			
			System.out.println();
			
			altura++;
			espacios--;
			
		}
		
		
		
	}

}
