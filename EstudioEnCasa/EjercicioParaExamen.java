package EstudioEnCasa;

import java.util.Scanner;

public class EjercicioParaExamen {

	public static void main(String[] args) {
		// escribir por pantalla un numero y detectar si es par o impar
		// si es par comprueba si es multiplo de 10 
		// si es impar multiplicalo por el mismo numero pero al reves ej; si es 145, pues se multiplica 142*241
		// solo numeros del 0 al 9999
		int numero, numeroD, numero1,numero2, numero3, numero4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número de máximo 4 cifras: ");
		numero = sc.nextInt();
		sc.close();
		if (numero%2==0) {
			System.out.println("El número " + numero + " es par.");
			if (numero%10==0) {
				System.out.println("El número " + numero + " es múltiplo de 10.");
			} 
			else {
				System.out.println("El número " + numero + " no es múltiplo de 10.");
			}
		}
		else if (numero%2!=0) {
			System.out.println("El número " + numero + " es impar.");
			numeroD=numero;
			numero1 = numeroD%10;
			numeroD = numeroD/10;
			numero2 = numeroD%10;
			numeroD = numeroD/10;
			numero3 = numeroD%10;
			numeroD = numeroD/10;
			numero4 = numeroD%10;
			numeroD = numeroD/10;
			int nuevoNumero = (numero1*1000+numero2*100+numero3*10+numero4*1);
			System.out.println("El número " + numero + " del revés es " + nuevoNumero);
			int multiplicacion = (numero*nuevoNumero);
			System.out.println("La multiplicación del número " + numero + " y el mismo al revés da: " + multiplicacion);
		}

	}

}
