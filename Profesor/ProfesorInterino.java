package Profesor;

import java.util.Calendar;

public class ProfesorInterino extends ProfesorQuinteroParra{
	private Calendar fechaInicioInterinidad;

	/**
	 * @param dniProfesor
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param nomina
	 * @param asignaturas
	 * @param fechaInicioInterinidad
	 */
	public ProfesorInterino(String dniProfesor, String nombre, String apellidos, int edad,
			modulo asignaturas, Calendar fechaInicioInterinidad) {
		super(dniProfesor, nombre, apellidos, edad, asignaturas);
		this.fechaInicioInterinidad = fechaInicioInterinidad;
	}
	
	public void importeNomina(float sueldoBase,float complementos) {
		//sueldo+complementos-deducciones
		//las deducciones fijas son 100€ 
		super.importeNomina(sueldoBase,complementos,100);
	}

	@Override
	public String toString() {
		return "ProfesorInterino [fechaInicioInterinidad=" + fechaInicioInterinidad.getTime() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
