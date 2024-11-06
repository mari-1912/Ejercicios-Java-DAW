package EstudioEnCasa;

import java.util.Scanner;

public class EjercicioHorasMinutos {

	public static void main(String[] args) {
		// programa que pide las horas y queremos sacar cuantos segundos son
		float seg, min, numero;
		final float num = 60;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indica un número entre el 1 y el 12: ");
		numero = scanner.nextFloat();
		scanner.close();
		min = numero * num;
		seg = min * num;
		System.out.println("Son: " + seg + " segundos");
		
	}

}
