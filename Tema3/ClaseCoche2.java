package Tema3;

public class ClaseCoche2 {
	
	private String color;
	private int velocidad;
	private double tamanyo;
	private int posicionX;
	private int posicionY;
	
	public ClaseCoche2(String coche, int velocidad, double tamanyo, int posicionX, int posicionY) {
		super();
		this.color = coche;
		this.velocidad = velocidad;
		this.tamanyo = tamanyo;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public String getCoche() {
		return color;
	}

	public void setCoche(String coche) {
		this.color = coche;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public double getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(double tamanyo) {
		this.tamanyo = tamanyo;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	
	
	

}
