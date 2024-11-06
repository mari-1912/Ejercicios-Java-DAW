package Tema2;

public class ejercicio11_For {

	public static void main(String[] args) {
		// for sencillo de numeros del 1 al 10
		// 1. punto de inicio(en este caso 0)
		// 2. hasta donde llega(en este caso hasta que i sea mayor de 10)
		// 3. el incremento(en este caso de uno en uno)
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " ");
		}
		
		// cuenta descendiente desde 10
		System.out.println("\nCuenta descendente");
		int i;
		for (i = 10; i > 0; i--) {
			System.out.println(i + " ");
		}
		
		// 10 numeros pares
		System.out.println(i + "\nNúmeros pares: ");
		for (i = 0; i <= 10; i +=2 ) {
			System.out.println(i + " ");
		}
		
		//suma de los 100 primeros números
		System.out.println("\nSuma de los 100 primeros números ");
		int suma=0;
		for (i = 0; i <= 100; i++) {
			suma+=i;
		}
		System.out.println(" " + suma);
		
		for (i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println("("+i+ "," +j+")");
			}
			System.out.println(" ");
		}
		System.out.println(" ");


	}

}
