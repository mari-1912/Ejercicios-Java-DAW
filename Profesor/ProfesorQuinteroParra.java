package Profesor;

public class ProfesorQuinteroParra {
	private String dniProfesor;
	private String nombre;
	private String apellidos;
	private int edad;
	protected float nomina;
	public enum modulo{BBDD,Marcas,Programacion,Entornos,Interfaces}
	private modulo asignaturas;
	/**
	 * @param dniProfesor
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param nomina
	 * @param asignaturas
	 */
	public ProfesorQuinteroParra(String dniProfesor, String nombre, String apellidos, int edad,
			modulo asignaturas) {
		super();
		this.dniProfesor = dniProfesor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.asignaturas = asignaturas;
	}
	
	public void importeNomina(float sueldoBase, float complementos,float deducciones) {
		this.nomina= sueldoBase+complementos-deducciones;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		ProfesorQuinteroParra otroProf = (ProfesorQuinteroParra) obj;
		boolean iguales;
		if(this.nomina == otroProf.nomina) {
			iguales = true;
		} else {
			iguales = false;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "ProfesorQuinteroParra [dniProfesor=" + dniProfesor + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + ", nomina=" + nomina + ", asignaturas=" + asignaturas + "]";
	}
	
	
	
}
