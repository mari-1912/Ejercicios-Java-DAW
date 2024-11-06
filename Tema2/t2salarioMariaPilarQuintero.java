package Tema2;

import java.util.Scanner;

public class t2salarioMariaPilarQuintero {

	public static void main(String[] args) {
		// 
		float horas, precioHora, salarioBruto = 0, tarifa, impuestos = 0;
		//pedimos por pantalla las horas trabajadas y
		//la tarifa hora que cobra
		Scanner sc = new Scanner(System.in);
		System.out.println("Horas trabajadas esta semana: ");
		horas = sc.nextFloat();
		System.out.println("Precio hora tarifa normal: ");
		precioHora = sc.nextFloat();
		//comproobamos si las horas indicadas se pagan a precio normal o 
		//si son más y se pagan a 1,5 veces la tarifa normal
		if (horas<=35) {
			salarioBruto = horas * precioHora;
		} 
		else if (horas>35) {
			salarioBruto = horas * (float) (precioHora * 1.5);
		} else;
		
		if (salarioBruto<=500) {
			System.out.println("Salario libre de impuestos: ");
		} 
		else if (salarioBruto>500 && salarioBruto<900) {
			impuestos = (salarioBruto*25/100);
			System.out.println("Los impuestos son: " + impuestos);

		} 
		else if (salarioBruto>900) {
			
		}
		
		System.out.println("El salario bruto es: " + salarioBruto + " Los impuestos son: " + impuestos + " El salario neto (salario-impuestos) es: " + (salarioBruto - impuestos));

		
	}

}
