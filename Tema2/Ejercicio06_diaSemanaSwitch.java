package Tema2;

import java.util.Scanner;

public class Ejercicio06_diaSemanaSwitch {

	public static void main(String[] args) {
		// pide un numero del 1 al 7 <1 y >7 error
		// si es 1 lunes, 2 martes...
		
		int dia;
		Scanner sc = new Scanner(System.in);
		System.out.println("indica un numero del 1 al 7: ");
		dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Ese día no existe");
		}
		
		sc.close();
	}

}
