package EstudioEnCasa;

import java.util.ArrayList;

public class EstudiantesPoo {
	
	private String nombre, matricula;
	private int edad;
	private double nota1, nota2, nota3;
	
	/**
	 * 
	 * @param nombre
	 * @param matricula
	 * @param edad
	 * @param nota1
	 * @param nota2
	 * @param nota3
	 */
	public EstudiantesPoo(String nombre, String matricula, int edad, double nota1, double nota2, double nota3) {
		
		this.nombre = nombre;
		this.matricula = matricula;
		this.edad = edad;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;

	}
	
	public EstudiantesPoo(String nombre, String matricula, int edad) {
		
		this.nombre = nombre;
		this.matricula = matricula;
		this.edad = edad;
	}

	/**
	 * 
	 * @param media
	 * @return
	 */
	public double calcularMedia(double media) {
		
		return media = nota1 + nota2 + nota3 / 3;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public String getMatricula() {
		
		return this.matricula;
	}
	
	public int getEdad() {
		
		return this.edad;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void setMatricula(String matricula) {
		
		this.matricula = matricula;
	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
	}
	
	public void setNota1(double nota1) {
		
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) {
		
		this.nota2 = nota2;
	}
	
	public void setNota3(double nota3) {
		
		this.nota3 = nota3;
	}
	
	public void setNotas(double nota1, double nota2, double nota3) {
		
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double calcularMedia() {
		
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public void mostrarInfo() {
		
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Media de notas: " + this.calcularMedia());

	}

}
