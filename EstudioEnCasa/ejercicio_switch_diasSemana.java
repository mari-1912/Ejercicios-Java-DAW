package EstudioEnCasa;

import java.util.Scanner;

public class ejercicio_switch_diasSemana {
	
	private static String diasSemana(int i) {
		
		String dia = "";
		Scanner sc = new Scanner(System.in);
		
		dia = sc.next();
		
		switch (i){
		
		case 1 ->
			dia = "lunes";
		case 2 ->
			dia = "martes";
		case 3 ->
			dia = "miércoles";
		case 4 ->
			dia = "jueves";
		case 5 ->
			dia = "viernes";
		case 6 ->
			dia = "sábado";
		case 7 ->
			dia = "domingo";
		default ->			
			System.out.println("Día no válido");
		} 
		
		return dia;
	}

	public static void main(String[] args) {
		
	

	}

}
