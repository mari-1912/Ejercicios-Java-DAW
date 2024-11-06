package Tema2;

public class ejercicio_13_bucleAnidado {

	public static void main(String[] args) {
		/*
		 * 
		 */
		System.out.println();
		//triangulo
		
		pintarTrianguloDerecha();
		
		System.out.println();

		pintarTrianguloCentrado();


	} //fin main
	
	private static void pintarTrianguloDerecha() {
		//pinta un triangulo alineado a la derecha
		int filas = 5;
		
		for (int i = 1; i <= filas; i++) {
			//imprimir espacios en blanco para alinear el triangulo
			
			for (int j = filas; j > i; j--) {
				System.out.print("");
			}
			//imprimir asteriscos
			
			 for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			//salto de linea para la siguiente fila
			System.out.println();
		}
	}
	
	private static void pintarTrianguloCentrado() {
		int filas = 5;
		
		for (int i = 1; i <= filas; i++) {
			//imprimir espacios en blanco para alinear el triangulo
			
			for (int j = filas; j > i; j--) {
				System.out.print(" ");
			}
			//imprimir asteriscos
			
			for (int k = 1; k<=(i*2-1); k++) {
				System.out.print("*");
			}
			//salto de linea para la siguiente fila
			System.out.println();
		}
	}
	

}
