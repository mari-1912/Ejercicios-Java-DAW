package pio.daw.tema5.serializa;

import java.io.Serializable;
import java.util.Date;

public class RegistroTemp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 123456L;

	private String ciudad;
	private Date fecha;
	private double tempMax;
	private double tempMin;
	
	/**
	 * @param ciudad
	 * @param fecha
	 * @param tempMax
	 * @param tempMin
	 */
	public RegistroTemp(String ciudad, Date fecha, double tempMax, double tempMin) {
		super();
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
	}
	
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * @return the tempMax
	 */
	public double getTempMax() {
		return tempMax;
	}
	
	/**
	 * @param tempMax the tempMax to set
	 */
	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}
	
	/**
	 * @return the tempMin
	 */
	public double getTempMin() {
		return tempMin;
	}
	
	/**
	 * @param tempMin the tempMin to set
	 */
	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}
	
	@Override
	public String toString() {
		return "RegistroTemp [ciudad=" + ciudad + ", fecha=" + fecha + ", tempMax=" + tempMax + ", tempMin=" + tempMin
				+ "]";
	}
	
	
}
