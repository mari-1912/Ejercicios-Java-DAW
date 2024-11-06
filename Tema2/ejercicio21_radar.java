package Tema2;

import java.util.Scanner;

public class ejercicio21_radar {

	/*
	 * programa radar de tramo
	 * pedir tres numeros:
	 * - la distancia en metros que separa las dos camaras
	 * - la velocidad maxima en km/h del tramo
	 * - seundos que ha tardado el vehiculo en recorrer el tramo
	 * ******* 3 opciones de salida 
	 * - NO si no hay multa
	 * - Multa sin puntos si no excede del 20% de velocidad max.
	 * - Multa con puntos si excede el 20%
	 */
	
	public static void main(String[] args) {
		
		int dist, velMax, seg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica la distancia en metros que separa las dos cámaras: "); // pedir la distancia
		dist = sc.nextInt();
		
		System.out.println("Indica la velocidad máxima en km/h del tramo: "); // pedir la velocidad maxima
		velMax = sc.nextInt();
		
		System.out.println("Indica cuántos segundos ha tardado el vehículo en recorrer el tramo: "); // pedir los segundos
		seg = sc.nextInt();
		
		// pasar dist a km y los seg a horas
		
		int velkh = (dist/1000) * (seg/3600);
		
		if (velkh == velMax) 
		{
			System.out.println("No hay multa");
		}

	}

}
