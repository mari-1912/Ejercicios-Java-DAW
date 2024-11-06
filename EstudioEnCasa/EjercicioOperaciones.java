package EstudioEnCasa;

import java.util.Scanner;

public class EjercicioOperaciones {

	public static void main(String[] args) {
		// Escribe un programa que pida por pantalla dos números
		// y muestre el resultado de la +, la -, la *, la /
		System.out.println("Escribe dos números por pantalla: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("La suma de ambos números es: " + (num1 + num2));
		System.out.println("La resta de ambos números es: " + (num1 - num2));
		System.out.println("La multiplicacion de estos números da: " + (num1 * num2));
		System.out.println("La división de estos números da: " + (num1/num2));
		sc.close();
	}

}
