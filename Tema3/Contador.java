package Tema3;

public class Contador {
	
	static int contador = 0;
	
	Contador() {
		
		contador++;
		System.out.println("Constructor de contador: " + contador);
	}

	//alt mayus S  para desplegar menu de constructor, getters, setters...
	@Override
	public String toString() {
		return "Contador [contador=" + contador + "]";
	}
	
	

}
