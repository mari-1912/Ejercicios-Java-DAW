package Tema2;

public class ejercicio12_otroFor {

	public static void main(String[] args) {
		/*
		 * 
		 */
		for (int i = 0, j = 0; i < 5 && j <5; i++, j++) {
			System.out.print(i + j + " ");
		}
		
		System.out.println();
		for (int i = 0, j = 0; i < 5 && j <5; i++, j++) {
			System.out.print(i + "" + j + " ");
		}
		
		// otro ejemplo
		int i = 5;
		int j = ++i; // ++i --> pre incremento y despues asignacion
		int k = i++; // i++ --> post incremento pero primero asignacion
		System.out.println();
		System.out.print("i = " + i + " ");
		System.out.print("j = " + j + " ");
		System.out.print("k = " + k + " ");
		
		//otro ejemplo
		System.out.println();
		int a = 1, b = 1, c = 1;
		while (a<5) {
			b = ++a;
			c = a++;
		}
		System.out.println(b + " " + c);

	}

}
