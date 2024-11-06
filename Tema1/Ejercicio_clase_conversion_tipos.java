package Tema1;

public class Ejercicio_clase_conversion_tipos {

	public static void main(String[] args) {
		// Tipos básicos
		byte edad = 30;
		double altura = 1.70;
		char inicial = 'A';
		boolean estudiante = true;
		System.out.println("edad= " + edad);
		System.out.println("altura= " + altura);
		System.out.println("inicial= " + inicial);
		System.out.println("esEstudiante= " + estudiante);
		
		// conversiones de 32 a 64
		int iNum=3;
		double dNum=iNum;
		System.out.println("dNum= " + dNum);
	
		// conversion de tipos
		double dNum2=5.2;
		int iNum2= (int)dNum2;
		System.out.println("iNum2 " + iNum2);
	}

}
