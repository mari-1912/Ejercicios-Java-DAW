package EstudioEnCasa;

import java.util.Scanner;

public class EjercicioLata {

	public static void main(String[] args) {
		// tienes un cilindro de un tamaño y litros de liquido en una jarra
		// saber si el liquido entra en la lata justo, rebosa o queda hueco
		// en caso de rebosar cuanto es y si queda hueco cuanto queda
		
		// radio lata = 20cm y altura= 50cm // 1cm^3=1ml
		// pi*r^2*h volumen del cilindro
		
		// se introduce la cantidad de liquido por pantalla en litros
		
		//el if con operadores ternarios siempre que puedas
		
		int radio = 20;
		int alt = 50;
		final float pi = 3.14f;
		
		float vol = pi*(radio*radio)*alt;
		System.out.println(vol);
		
		float capacidadLata = (vol/1000);
		System.out.println(capacidadLata);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Indica cuanto líquido hay en la jarra en L: ");
		float litrosJarra = scanner.nextFloat();
		scanner.close();
		boolean entra = true, noEntra = false;
		boolean siCabe = (capacidadLata>=litrosJarra)?entra:noEntra;
		if (siCabe) {
			if (litrosJarra==capacidadLata) {
				System.out.println("El líquido está justo");
			} 
			else {
				double queda =(capacidadLata-litrosJarra);
				System.out.println("Aún quedan " + queda + " litros de hueco en la lata");
			}
		}
		else {
			double sobra = (litrosJarra-capacidadLata);
			System.out.println("Sobran " + sobra + " litros de líquido");
		}
			
	}

}


