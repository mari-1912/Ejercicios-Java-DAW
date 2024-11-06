package Tema3;

public class ClaseCoche3 {
	
	private String color;
	private int velocidad;
	private double tamanyo;
	
	
	@Override
	public String toString() {
		return "ClaseCoche3 [color=" + color + ", velocidad=" + velocidad + ", tamanyo=" + tamanyo + ", posicionX="
				+ posicionX + ", posicionY=" + posicionY + ", getColor()=" + getColor() + ", getVelocidad()="
				+ getVelocidad() + ", getTamanyo()=" + getTamanyo() + ", getPosicionX()=" + getPosicionX()
				+ ", getPosicionY()=" + getPosicionY() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	private int posicionX;
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}
	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	/**
	 * @return the tamanyo
	 */
	public double getTamanyo() {
		return tamanyo;
	}
	/**
	 * @param tamanyo the tamanyo to set
	 */
	public void setTamanyo(double tamanyo) {
		this.tamanyo = tamanyo;
	}
	/**
	 * @return the posicionX
	 */
	public int getPosicionX() {
		return posicionX;
	}
	/**
	 * @param posicionX the posicionX to set
	 */
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	/**
	 * @return the posicionY
	 */
	public int getPosicionY() {
		return posicionY;
	}
	/**
	 * @param posicionY the posicionY to set
	 */
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	private int posicionY;
	/**
	 * @param color
	 * @param velocidad
	 * @param tamanyo
	 * @param posicionX
	 * @param posicionY
	 * @author mari1
	 * @since oct-2024
	 */
	public ClaseCoche3(String color, int velocidad, double tamanyo, int posicionX, int posicionY) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.tamanyo = tamanyo;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
}
