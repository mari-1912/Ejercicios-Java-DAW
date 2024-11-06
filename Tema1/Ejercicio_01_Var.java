package Tema1;

public class Ejercicio_01_Var {

	public static void main(String[] args) {
		// Esto es un comentario 
		/*esto son
		 * varias lineas de comentario
		 */
		/*System.out.println("Hola Mundo");
		System.out.println(1234);
		System.out.println(5678);*/
		
		//ejemplo de variable string
		String nombre = "Pilar";
		System.out.println("El nombre es: " + nombre);
		
		//ejemplo de variable int
		int number = 15;
		System.out.println("El número es: " + number);
		int x = 1;
		int y = 2;
		int z = 3;
		System.out.println(x+y+z);
		System.out.println("El número es: " +x+y+z);
		System.out.println("El número es: " + (x+y+z));
		
		/*int number1 = 10; 
		int suma = number + number1;*/
		
		//constantes
		// las constantes nunca pueden tener una asignacion diferente, siempre tiene que ser la misma
		final double PI = 3.141592;
		System.out.println(PI);
	}

}
