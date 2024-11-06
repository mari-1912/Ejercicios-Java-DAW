package Tema2;

public class ejercicio10While {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ejemplos de while
		 * pintar los 5 primeros numeros 
		 */
		int contador = 1;
		while (contador <= 5) {
			System.out.println(contador + " ");
			contador++;
		}
		/*
		 * mismo pero del 5 al 1
		 */
		int contador1 = 5;
		while (contador1 >= 1) {
			System.out.println(contador1 + " ");
			contador1--;
		}
		/*
		 * pintar los 10 primeros numeros pares
		 */
		int contador2 = 1;
		while (contador2 <= 10) {
			if (contador2 % 2 == 0) {
				System.out.println(contador2);
			}
			contador2++;
		}
		
		/*
		 * usando la funcion esPar
		 */
		int contador3 = 1;
		while (contador3 <= 10) {
			if (esPar(contador3)) {
				System.out.println(contador3);
			}
			contador3++;
		}
		

	}
	/**
	 * 
	 * @param iNum para validar si es par
	 * @return true o false
	 * @author mari1
	 */
	private static boolean esPar(int iNum) {
		/*boolean bEsPar=false;
		if (iNum%2==0) {
			bEsPar=true;
		return bEsPar;
		}
		return bEsPar;
		*/
		return (iNum%2==0);
		
	}

}
