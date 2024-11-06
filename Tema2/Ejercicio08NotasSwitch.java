package Tema2;

import java.util.Scanner;

public class Ejercicio08NotasSwitch {

	public static void main(String[] args) {
		// pedir nota numerica del 0 al 10 y si <0 y >10 error
		// o a 3 muy def., 3 a 5 insuf., 5 a 6 bien, 6 a 9 notable
		// 9 a 10 sobresaliente
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota: ");
		int nota = sc.nextInt();
		
		switch (nota) {
			case 0,1,2 -> //entonces haz esto
				System.out.println("Muy deficiente");
			case 3,4 ->
					System.out.println("insuficiente");
			case 5 ->
				System.out.println("Bien");
			case 6,7,8 ->
				System.out.println("Notable");
			case 9,10 -> 
				System.out.println("Sobresaliente");
			default ->
				System.out.println("Nota no válida");
		
		}
		sc.close();

	}

}
