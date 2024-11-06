package EstudioEnCasa;

public class practica_while {

	public static void main(String[] args) {
		/*
		 * ejemplos de while
		 * pintar los 5 primeros numeros 
		 */
		int contador = 1;
		while (contador <= 5) {
			System.out.println("\n" + contador + " ");
			contador++;
		}
		/*
		 * mismo pero del 5 al 1
		 */
		int contador1 = 5;
		while (contador1>=1) {
			System.out.println("\n" + contador1 + " ");
			contador1--;
		}
		
		
		/*
		 * pintar los 10 primeros numeros pares
		 */
		int contador2 = 1;
		while (contador2 <= 10) {
			if (contador2 %2 == 0) {
				System.out.println(contador2);
			} contador2++;
		
		}
		
		
		/*
		 * usando la funcion esPar
		 */
		int contador3 = 1;
		while (contador3 <= 10) {
			if (esPar(contador3)) {
				System.out.println(contador3);
			} contador3++;
		}
		
		
	}
	
	private static boolean esPar(int iNum) {
		boolean nEsPar = false;
		if (iNum %2 == 0) {
			nEsPar = true;
			return nEsPar;
		}
		return nEsPar;
		
	}

}
