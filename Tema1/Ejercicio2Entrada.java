package Tema1;

import java.util.Scanner;
/* uso de librerias. Las librerias se especifican al principio del programa y hay que importarlas*/

public class Ejercicio2Entrada {

	public static void main(String[] args) {
		
		// Declaramos una variable de tipo int 
		int num;
		//Mostramos un mensaje
		
		System.out.print("Escribe un númer del 1 al 10: ");
		// va a pedir un numero por pantalla
		Scanner sc = new Scanner(System.in);
		// quiero que en num se guarde el numero que el usuario introduzca
		num = sc.nextInt();
		System.out.println("El número introducido es: " + num);
		sc.close();

	}

}
