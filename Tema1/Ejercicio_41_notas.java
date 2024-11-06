package Tema1;

import java.util.Scanner;

public class Ejercicio_41_notas {

	public static void main(String[] args) {
		System.out.println("Escribe tres notas: ");
		Scanner scanner = new Scanner(System.in);
		/*int nota1 = scanner.nextInt();
		int nota2 = scanner.nextInt();
		int nota3 = scanner.nextInt();*/
		// hay que declarar primero las variables como float
		float nota1 = scanner.nextFloat();
		float nota2 = scanner.nextFloat();
		float nota3 = scanner.nextFloat();
		float mediaBoletin = ((nota1 + nota2 + nota3) / 3);
		// conversion de double a int 
		int mediaExpediente = (int)mediaBoletin;
		System.out.println("Tu nota media del expediente es: " + mediaExpediente);
		System.out.println("Tu nota media del boletín es: " + mediaBoletin);
		scanner.close();
	}

}
