package Tema1;

import java.util.Scanner;

public class MediaMariaPilarQuintero {

	public static void main(String[] args) {
		float media;
		Scanner scanner = new Scanner("Escribe dos notas: ");
		float nota1 = scanner.nextFloat();
		float nota2 = scanner.nextFloat();
		media = ((nota1 + nota2) / 2);
		System.out.println("Tu nota media es: " + media);
		scanner.close();
	}

}
