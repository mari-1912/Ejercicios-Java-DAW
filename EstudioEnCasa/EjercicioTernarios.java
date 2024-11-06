package EstudioEnCasa;

import java.util.Scanner;

public class EjercicioTernarios {

	public static void main(String[] args) {
		// pide al usuario que escriba dos numeros e indica cual es mayor y cual menor
		int num1, num2, mayor, menor;
		System.out.println("Escribe dos números: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		mayor = num1>num2?num1:num2;
		menor = num1<num2?num1:num2;
		System.out.println("El número " + mayor + " es mayor y el número " + menor + " es menor");

	}

}
