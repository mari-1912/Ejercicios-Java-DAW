package EstudioEnCasa;

import java.util.Scanner;

public class calculadoraIF {

	public static void main(String[] args) {
		/*
		 * Escribe un programa en Java que actúe como una calculadora básica. 
		 * El programa solicitará al usuario ingresar dos números y una operación matemática (+, -, x, /). 
		 * Luego, calculará la operación seleccionada y mostrará el resultado en la pantalla.
		 * Si el símbolo de la operación es diferente a los operadores permitidos (+, -, x, /), el programa indicará "Caracter no reconocido".
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Ingresa el segundo número: ");
		int num2 = sc.nextInt();
		System.out.println("Indica la operación que quieres realizar entre; +, -, /, * : ");
		String operacion = sc.next();
		if (operacion == "+") {
			int suma = num1 + num2;
			System.out.println("Resultado de la suma: " + suma);
		}
		else if (operacion == "-") {
			int resta = num1 + num2;
			System.out.println("Resultado de la resta: " + resta);
		}
		else if (operacion == "/") {
			int division = num1 / num2;
			System.out.println("Resultado de la division: " + division);
		}
		else if (operacion == "*") {
			int multi = num1 * num2;
			System.out.println("Resultado de la multiplicacion: " + multi);
		}
		else {
			System.out.println("Caracter no reconocido");
		}
		sc.close();


	}

}
