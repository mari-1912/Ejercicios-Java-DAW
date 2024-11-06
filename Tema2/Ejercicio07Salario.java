package Tema2;

import java.util.Scanner;

public class Ejercicio07Salario {

	public static void main(String[] args) {
		// Inicio programa salario
		
		Scanner sc = new Scanner(System.in);
		int ihoras;
		double dTarifa, dSalario, dImpuesto = 0;
		System.out.println("Horas trabajadas esta semana: ");
		ihoras = sc.nextInt();
		System.out.println("Precio hora tarifa normal: ");
		dTarifa = sc.nextDouble();
		//calculamos el salario
		//primeras 35h a tarifa normal
		//despues horas extras tarifa 1.5
		if (ihoras<35) {
			//no hay exras
			dSalario = ihoras*dTarifa;
		} 
		//si no horas extras tarifa 1.5
		else {
			dSalario = 35*dTarifa + (ihoras-35) * (dTarifa*1.5);
		}
		//calculamos impuestos
		if (dSalario<=500) {
			dImpuesto=0;
		}
		else if (dSalario<=900) {
			dImpuesto = (dSalario-500) * 0.25;
		}
		else {
			dImpuesto = (400*0.25) + ((dSalario - 900) * 0.45);
		}
		System.out.println("El salario bruto es: " + dSalario + " Los impuestos son: " + dImpuesto + " El salario neto es: " + (dSalario-dImpuesto));
		
		sc.close();
	}

}
