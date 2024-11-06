package Tema3;

public class ClaseCocheTest {

	public static void main(String[] args) {
		
		ClaseCoche cocheAlejandro = new ClaseCoche("Rojo", 200, 2.0); //initial position x0, y0 
									//control + space para ver los diferentes metodos de la clase
		//cocheAlejandro.avanzar();
		//cocheAlejandro.girarIzquierda();
		//cocheAlejandro.parar();
		System.out.println("El color del coche es: " + cocheAlejandro.getColor());
		System.out.println("La velocidad del coche es: " + cocheAlejandro.getVelocidad());
		System.out.println("El tamaño del coche es: " + cocheAlejandro.getTamanyo());
		//cocheAlejandro.imprimirDatosCoche();

		/*		
		
		System.out.println("");
		
		ClaseCoche cocheGonzalo = new ClaseCoche("Blanco", 280, 3.5, 3, 4); //initial position x3, y4
		
		cocheGonzalo.girarDerecha();
		cocheGonzalo.avanzar();
		cocheGonzalo.imprimirDatosCoche();*/
	}

}
