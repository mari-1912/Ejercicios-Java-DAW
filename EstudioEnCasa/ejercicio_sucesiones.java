package EstudioEnCasa;

public class ejercicio_sucesiones {
	
	/*
	 * pintar con los diferentes tipos de bucles la siguiente serie:
	 * 
	 * 1,2,3,4,5,6,7,8,9,10
	 */

	public static void main(String[] args) {
		
		int i = 0;
		
		//primera serie
		System.out.println("Serie con for: ");
		
		for (i = 1; i <= 10; i++) {
			
			if (i < 10) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			} //fin del if 
			
		} //fin del for
		
		i = 1;
		
		System.out.println("");
		
		//segunda serie
		System.out.println("Serie con while: ");
		
		while (i <= 10) {
			if (i < 10) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
			
			i++;
		} //fin while
		
		i = 1;
		
		System.out.println("");
		
		//tercera serie
		System.out.println("Serie con do while: ");
		
		do {
			
			if (i < 10) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
			
			i++;
			
		} while (i <= 10); 

	}

}
