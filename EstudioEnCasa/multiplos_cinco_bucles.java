package EstudioEnCasa;

public class multiplos_cinco_bucles {

	public static void main(String[] args) {
		/*
		 * escribe los numeros multiplos de 5 desde el 0 al 100 usando for, while y do while
		 */
		
		/*int i;
		
		for (i = 0; i <= 100; i+=5) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		i=0;
		
		while (i <= 100) {
			System.out.print(i + " ");
			i+=5;
		}
		
		System.out.println("");
		i = 0;
		
		do {
			System.out.print(i + " ");
			i+=5;
		} while (i <= 100);
		*/
		
		/*
		 * Muestra los números del 320 al 160, contando de 20 en 20 hacia
		 * atrás utilizando un bucle for, while y do while 
		 */
		int num=320;
		
		for (int i = 320; i >= 160; i-=20) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		while (num >= 160) {
			System.out.print(num + " ");
			num-=20;
		}
		
		System.out.println("");
		num = 320;
		
		do {
			System.out.print(num + " ");
			num-=20;
		} while (num >= 160);

	}

}
