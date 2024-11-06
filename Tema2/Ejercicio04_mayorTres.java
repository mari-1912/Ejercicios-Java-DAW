package Tema2;

//import java.util.Scanner;
import java.util.*;

public class Ejercicio04_mayorTres {

	public static void main(String[] args) {
		// ingresar 3 numeros y ordenar de mayor a menor
		
		/*List<Integer> numeros = new ArrayList<>();
		int num=0,n2=21,n3=222;
		numeros.add(num);
		numeros.add(n2);
		numeros.add(n3);
		Collections.sort();*/

		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta tres números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1>num2 && num1>num3) {
			if (num2>num3) {
				System.out.println("Orden: " + num1 + " > " + num2 + " > " + num3);
			} else if (num3>num2) {
				System.out.println("Orden: " + num1 + " > " + num3 + " > " + num2);
			}
		} else if (num2>num1 && num2>num3) {
			if (num1>num3) {
				System.out.println("Orden: " + num2 + " > " + num1 + " > " + num3);
			} else if (num3>num1) {
				System.out.println("Orden: " + num2 + " > " + num3 + " > " + num1);
			}
		} else {
			if (num1>num2) {
				System.out.println("Orden: " + num3 + " > " + num1 + " > " + num2);
			} else {
				System.out.println("Orden: " + num3 + " > " + num2 + " > " + num1);
			}
		} 
		
		sc.close();

	}

}
