package EstudioEnCasa;

import java.util.Scanner;

public class ejercicio_piramide_hueca {

	public static void main(String[] args) {
		// github 20 piramide hueca
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca la altura de la pirámide: ");
	    int numeroFilas = sc.nextInt();

	    System.out.print("Introduzca el carácter de relleno: ");
	    String relleno = sc.next();
	    
	    int altura = 1;
	    int espaciosInternos = 0;
	    
	    while (altura < numeroFilas) {
	      
	      // inserta espacios delante
	      for (int i = 1; i <= numeroFilas-1; i++) {
	        System.out.print(" ");
	      }
	      
	      // pinta la línea
	      System.out.print(relleno);
	      for (int i = 1; i < espaciosInternos; i++) {
	        System.out.print(" ");
	      }
	      
	      if (altura>1) {
	        System.out.print(relleno);
	      }
	      
	      System.out.println();
	      altura++;
	      numeroFilas--;
	      espaciosInternos += 2;
	    } // fin del while
	    
	    // base de la pirámide
	    for (int i = 1; i < altura*2; i++) {
	      System.out.print(relleno);
	    }
	    
	    sc.close();

	}

}
