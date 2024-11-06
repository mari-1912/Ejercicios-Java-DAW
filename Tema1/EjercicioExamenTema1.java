package Tema1;

import java.util.Scanner;

public class EjercicioExamenTema1 {

	public static void main(String[] args) {
		// programa para que el trabajador de una taquilla sepa cuánto cobrar según cuántas entradas y de cada tipo se compren
		// infantiles = 4.5
		// juveniles = 10.5
		// adulto = 15.9
		// senior = 9.9
		final double inf = 4.5;
		final double juv = 10.5;
		final double adul = 15.9;
		final double sen = 9.9;
		int infantil, juvenil, adulto, senior;
		double pago;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántas entradas infantiles?: ");
		infantil = sc.nextInt();
		System.out.println("¿Cuántas entradas juveniles?: ");
		juvenil = sc.nextInt();
		System.out.println("¿Cuántas entradas adultos?: ");
		adulto = sc.nextInt();
		System.out.println("¿Cuántas entradas senior?: ");
		senior = sc.nextInt();
		sc.close();
		pago = (inf*infantil) + (juv*juvenil) + (adul*adulto) + (sen*senior);
		System.out.println("Cantidad a cobrar: " + pago);

		




	}

}
