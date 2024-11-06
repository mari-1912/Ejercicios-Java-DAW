package Tema2;

import java.util.Scanner;

public class ejercicio20_switch {
	
	/*
	 * dada una lista de valores correspondiente a una semana. 
	 * nuestro programa deberá decirle a Felipe el dia de la semana
	 * que mas y menos ha vendido, y si las ventas del domingo superan la media
	 * El programa recibira recaudacion de cada dia de la semana
	 * sera necesario utilizar el bucle for 
	 * el programa debe mostrar
	 * - el dia que mas se vende
	 * - el dia que menos se vende
	 * - despues se indicara un SI si el domingo se realizaron mas ventas
	 * que la media semanal
	 */

	public static void main(String[] args) {
		
		//System.out.println(diaSemana(5));
		
		Scanner sc = new Scanner(System.in);
		int iTotal = 0, iMax = Integer.MIN_VALUE, iMin = Integer.MAX_VALUE;
		int iDiaMax = 0, iDiaMin = 0, iRecaudado = 0;
		System.out.println("Introduce la recaudacion de martes a domingo: ");
		for (int i = 2; i <= 7; i++) {
			System.out.println("\nRecaudación del " + (diaSemana(i)) + ":");
			iRecaudado = sc.nextInt();
			// ver si lo recaudado supera la max
			// ver si lo recaudado es menos que el minimo
			// calcular el total recaudado
			// indicar el dia que mas, menos se vende
			
			
			
		} // fin de for
		
	} //fin de main
	
	private static String diaSemana(int i) {
		String sSol="";
		
		switch(i) {
		
			case 1 -> 
				sSol = "Lunes";
			case 2 -> 
				sSol = "Martes";
			case 3 -> 
				sSol = "Miércoles";
			case 4 ->
				sSol = "Jueves";
			case 5 ->
				sSol = "Viernes";
			case 6 ->
				sSol = "Sábado";
			case 7 ->
				sSol = "Domingo";
			default ->
				sSol = "Dia no válido";
		}
		return sSol;
		
	}

}
