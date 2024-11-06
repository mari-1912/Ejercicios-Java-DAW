package Tema2;

import java.util.Scanner;

public class practica_bucles_sueldos {

	public static void main(String[] args) {
		// Programa que pida 5 sueldos. Mostrar la suma, la media y cuántos hay mayores de 1000€
		//Declaramos las variables y las inicializamos
		int num=1, mayorMil=0;
		double sumaSueldos=0;
		//Llamamos a la funcion Scanner
		Scanner sc = new Scanner(System.in);
		//Usamos el while para declarar dentro cuantos sueldos pedimos
		while (num<=5) 
		{
			System.out.println("Indica " + num + "º sueldo: ");
			double sueldo = sc.nextDouble();
			//Hacemos la suma de los sueldos que va ingresando el usuario
			sumaSueldos += sueldo;
			
			//Usamos un if dentro del while, para localizar cuales son mayores de 1000
			if (sueldo>1000) 
			{
				mayorMil++;
			} 
			//Cada vez que se ejecute se suma un número hasta que llegue a la condición de parada
			num++;
		}
		//Hacemos la media de los sueldos
		double mediaSueldos = sumaSueldos / 5;
		System.out.println("La suma de los sueldos es: " + sumaSueldos + " €");
		System.out.println("La media de los sueldos es: " + mediaSueldos + " €");
		System.out.println("Los sueldos mayores de 1000€ son: " + mayorMil);
		sc.close();

	}

}
