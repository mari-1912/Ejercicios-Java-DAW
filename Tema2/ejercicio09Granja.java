package Tema2;

import java.util.Scanner;

public class ejercicio09Granja {

	public static void main(String[] args) {
		/* HACER CON if
		 * en una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
		 * el numero de animales que alimentar (todos de la misma especie) es numAnimales,
		 * y sabemos que cada animal come una media de kilosPorAnimal,
		 * diseña un programa que solicite al usuario:
		 * 1. cantidad de comida DOUBLE
		 * 2. numero de animales INT
		 * 3. kilos por animal DOUBLE
		 * y nos diga si tenemos alimento suficiente para cada animal
		 * en caso negativo, ha de calcular la racion a repartir entre los animales
		 * (tener en cuenta que no se puede dividir por cero)
		 */
		int numAnimales;
		double comidaDiaria, kilosPorAnimal, reparticion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica cuanta cantidad de comida hay: ");
		comidaDiaria = sc.nextDouble();
		System.out.println("Indica cuantos animales hay: ");
		numAnimales = sc.nextInt();
		System.out.println("Indica cuantos kilos comen los animales habitualmente: ");
		kilosPorAnimal = sc.nextDouble();
		
		
		if (numAnimales*kilosPorAnimal<=comidaDiaria) {
			System.out.println("Hay alimento suficiente para todos los animales");
		}
		else {
			System.out.println("No hay alimento suficiente");
			if (numAnimales==0) {
				System.out.println("Error");
			}
			else {
				reparticion = comidaDiaria/numAnimales;
				System.out.println("La ración a repartir entre cada animal es: " + reparticion + " kg.");
			}
		}
		sc.close();

	}

}
