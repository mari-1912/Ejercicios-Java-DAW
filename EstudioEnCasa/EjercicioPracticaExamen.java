package EstudioEnCasa;

import java.util.Scanner;

public class EjercicioPracticaExamen {

	public static void main(String[] args) {
		// Tenemos un numero decimal con 4 cifras antes y detras de la coma
		// 1234,5678 ---> 4321 + 8765

		/*
		 * declarar numero decimal
		 * duplicarlo
		 * x10000 
		 * %10
		 */
		
		double numeroDecimal;
		
		System.out.println("Escribe un número cuatro dígitos y cuatro decimales: ");
		
		Scanner scanner = new Scanner(System.in);
		numeroDecimal = scanner.nextDouble();
		scanner.close();
		
		System.out.println("El número escrito es: " + numeroDecimal);
		numeroDecimal = numeroDecimal * 10000;
		int num1 = (int)numeroDecimal % 10;
		numeroDecimal = numeroDecimal / 10;
		int num2 = (int)numeroDecimal % 10;
		numeroDecimal = numeroDecimal / 10;
		int num3 = (int)numeroDecimal % 10;
		numeroDecimal = numeroDecimal / 10;
		int num4 = (int)numeroDecimal % 10;
		
		numeroDecimal = numeroDecimal / 10;
		int num5 = (int)numeroDecimal % 10;
		numeroDecimal = numeroDecimal / 10;
		int num6 = (int)numeroDecimal % 10;
		numeroDecimal = numeroDecimal / 10;
		int num7 = (int)numeroDecimal % 10;
		numeroDecimal = numeroDecimal / 10;
		int num8 = (int)numeroDecimal % 10;
		
		int pack1 = (int) ((num4*1)+(num3*10)+(num2*100)+(num1*1000));
		
		int pack2 = (int) ((num8*1)+(num7*10)+(num6*100)+(num5*1000));
		
		int suma = (pack1 + pack2);
		
		System.out.println("El resultado de la suma es: " + suma);

	}

}
