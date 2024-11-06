package EstudioEnCasa;

import java.util.Scanner;

public class EjercicioNotaMedia {

	public static void main(String[] args) {
		// pide al usuario dos notas y calcula la nota media
		System.out.println("Escribe dos notas: ");
		Scanner sc = new Scanner(System.in);
		float nota1 = sc.nextFloat();
		float nota2 = sc.nextFloat();
		sc.close();
		/*float notaMedia = (nota1 + nota2)/2;
		System.out.println("La nota media es: " + notaMedia);*/
		System.out.println("La nota media es: " + ((nota1 + nota2)/2));
	}

}
