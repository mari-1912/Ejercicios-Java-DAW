package practica_ex2;

import java.util.Scanner;

public class ejercicio_banco {

	public static void main(String[] args) {
		/*
		 * HAY UN CAJERO AUTOMATICO
		 * AL ENTRAR HAY UN MENU CON VARIAS OPCIONES
		 * 1. INGRESAR, 2. RETIRAR, 3. CONSULTAR 4. CAMBIAR EUR A DOLAR 5. SALIR
		 * 
		 */
		int numero;
		double dinero=0, ingresar, retirar;
		String divisa = "euro";
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Ingresa una opción: ");
			numero = sc.nextInt();
			
			if (numero == 1) {
				System.out.println("Indica cuánto dinero ingresas: ");
				ingresar = sc.nextDouble();
				dinero += ingresar;
				
			} else if (numero == 2) {
				System.out.println("Indica cuánto dinero retiras: ");
				retirar = sc.nextDouble();
				
				if (dinero<retirar) {
					System.out.println("No puedes eres panza mileurista y no tienes ni un duro :D");
				} else {
					dinero -= retirar;
				}
				
			} else if (numero == 3) {
				System.out.println("Tu saldo es: " + dinero);
				
			} else if (numero == 4){
				//1eur = 1,08dolar
				if (divisa == "euro") {
					dinero *= 1.08;
					divisa = "dolar";
				} else {
					dinero /= 1.08;
					divisa = "euros";
				}
								
			} else if (numero == 5) {
				System.out.println("Hasta pronto");
				
			} else {
				System.out.println("Error, selecciona otra opcion");
			}
			
			
		} while (numero != 5);
		
		
	}

}
