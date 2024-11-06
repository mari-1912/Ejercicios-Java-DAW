package Tema2;

public class ejercicio13_cadenas {

	public static void main(String[] args) {
		
		String str1 = "nombre";
		String str2 = "nombre";
		String str3 = new String("nombre");
		String str4 = "Nombre";
		System.out.println(str1.equals(str2)); //funcion para igualar cadenas, compara el valor de dentro "nombre"
		System.out.println(str1 == str2); //comparando el objeto, la variable
		System.out.println(str1 == str4); //es false, porque no tienen exactamente el mismo nombre 
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str4));

	}

}
