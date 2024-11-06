package EstudioEnCasa;

import java.util.Scanner;

public class EjercicioNumPar {

	public static void main(String[] args) {
		//  pedir al usuario un número y mostrar si es par o impar
		System.out.println("Escribe un número: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par");
		} else {
			System.out.println("El número " + num + " es impar");
		}
		sc.close();
	}

}
