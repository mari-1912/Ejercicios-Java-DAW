package Tema1;

import java.util.Scanner;

public class ejercicio_43_numreves {

	public static void main(String[] args) {
		//Programa que pide un numero entre 0 y 99999
		// y lo pinte al reves
		
		/* EJEMPLO:
		 * int iAux1 = 1234;
		int iRes = iAux1 % 10;
		System.out.println("Res= " + iRes);*/

		/*
		 * 564
		 */
		System.out.println("Escribe un número entre 0 y 99999: ");
		int num1;
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		int resto = num1 % 10;
		int resto1 = num1/10 % 10;
		int resto2 = num1/100 % 10;
		int resto3 = num1/1000 % 10;
		int resto4 = num1/10000 % 10;
		System.out.println("El número al revés es: " + resto + resto1 + resto2 + resto3 + resto4);
		scanner.close();
		/*
		 * unidad = inum % 10;
		 * inum = inum / 10;
		 * decenas = inum % 10;
		 * inum = inum / 10;
		 * centenas = inum % 10;
		 * ...
		 */
	}

}
