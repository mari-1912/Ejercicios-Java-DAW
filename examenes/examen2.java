package examenes;

import java.util.Scanner;

public class examen2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion=0;
		
		do {
			System.out.println("Menu del programa del alumno Miguel Fernández-Ventura López");
	        System.out.println("Opción 1: Usando el bucle for pinta los números pares del 2 al 20.");
	        System.out.println("Opción 2: Usando while pinta los impares del 21 al 1 en orden decreciente.");
	        System.out.println("Opción 3: Salir");
	        System.out.println("Ingrese su opción: ");
			
	        switch (opcion) {
	        case 1 -> {
		        System.out.println("Ha seleccionado la opción 1");
	        	for (int i = 2; i<=20;i+=2) {
	        		System.out.print(i + " ");
	        	} //fin del for
	        }
	        case 2 -> {
		        System.out.println("Ha seleccionado la opción 2");
		        int cont=21;
		        while (cont>0) {
	        		System.out.print(cont + " ");
		        }
	        }
	        case 3 -> {
		        System.out.println("Saliendo del programa");
	        }
	        default -> {
	        	System.out.println("No has seleccionado ninguna opcion.");
	        }
	        
	        } //fin del switch
	        
		} while (opcion !=3);
		
        System.out.println("Fin del programa.");

	}

}
