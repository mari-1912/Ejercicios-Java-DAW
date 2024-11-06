package Tema2;

import java.util.Scanner;

public class Ejercicio05_notas {

	public static void main(String[] args) {
		// pide nota numerica de 0 a 10 (si es <0 o >10 error)
		// de 0 a 3 muy deficiente
		// de 3 a 5 insuficiente, de 5 a 6 bien, de 6 a 9 notable
		// de 9 a 10 sobresaliente
		// nota tipo double
		
		double nota;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica tu nota: ");
		nota = sc.nextDouble();
		
		if (nota>=0 && nota<3) {
			System.out.println("Tu nota es: " + nota + " muy deficiente");
		} else if (nota>=3 && nota<5) {
			System.out.println("Tu nota es: " + nota + " insuficiente");
		} else if (nota>=5 && nota<7) {
			System.out.println("Tu nota es: " + nota + " bien");
		} else if (nota>=7 && nota<9) {
			System.out.println("Tu nota es: " + nota + " notable");
		} else if (nota<=10) {
			System.out.println("Tu nota es: " + nota + " sobresaliente");
		} else if (nota<0 && nota>10) {
			System.out.println("Error");
		}
		
		// da error numeros negativos
		sc.close();

	}

}
