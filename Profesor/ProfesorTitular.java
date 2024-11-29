package Profesor;

public class ProfesorTitular extends ProfesorQuinteroParra{
	private int aniosAntiguedad;

	/**
	 * @param dniProfesor
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param nomina
	 * @param asignaturas
	 * @param aniosAntiguedad
	 */
	public ProfesorTitular(String dniProfesor, String nombre, String apellidos, int edad,
			modulo asignaturas, int aniosAntiguedad) {
		super(dniProfesor, nombre, apellidos, edad, asignaturas);
		this.aniosAntiguedad = aniosAntiguedad;
	}
	
	public void importeNomina(float sueldoBase,float complementos) {
		super.importeNomina(sueldoBase,complementos,this.aniosAntiguedad*10);
	}

	@Override
	public String toString() {
		return "ProfesorTitular [aniosAntiguedad=" + aniosAntiguedad + ", toString()=" + super.toString() + "]";
	}
	
	
}
