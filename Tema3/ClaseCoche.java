package Tema3;

public class ClaseCoche {

	/*
	 * atributos que tiene la clase ClaseCoche (1,n)
	 */
	private String sColor;
	private int iVelocidad;
	private double tamanyo;
	private int iPosicionX;
	private int iPosicionY;

	/*
	 * constructor de la clase, permite crear objetos de la ClaseCoche (1,n)
	 */
	public ClaseCoche(String campoColor, int campoVelocidad, double campoTamanyo) {

		this.sColor = campoColor;
		this.iVelocidad = campoVelocidad;
		this.tamanyo = campoTamanyo;
		this.iPosicionX = 0;
		this.iPosicionY = 0;
	}

	public ClaseCoche(String campoColor, int campoVelocidad, double campoTamanyo, int campoPosX, int campoPosY) {

		this.sColor = campoColor;
		this.iVelocidad = campoVelocidad;
		this.tamanyo = campoTamanyo;
		this.iPosicionX = campoPosX;
		this.iPosicionY = campoPosY;
	}

	/*
	 * métodos que actúan sobre los objetos de la ClaseCoche (1,n)
	 */
	public void avanzar() {

		this.iPosicionX += 1;
		this.iPosicionY += 1;
	};

	public void parar() {

		this.iPosicionX = 0;
		this.iPosicionY = 0;
	};

	public void girarIzquierda() {

		this.iPosicionX += 1;
	};

	public void girarDerecha() {

		this.iPosicionY += 1;
	};

	public void imprimirDatosCoche() {

		System.out.println("El color es: " + this.sColor);
		System.out.println("La velocidad es: " + this.iVelocidad);
		System.out.println("El tamaño es: " + this.tamanyo);
		System.out.println("La posición X es: " + this.iPosicionX);
		System.out.println("La posición Y  es: " + this.iPosicionY);

	}

	public String getColor() {
		return this.sColor;
	}

	public int getVelocidad() {
		return this.iVelocidad;
	}

	public double getTamanyo() {
		return this.tamanyo;
	}


}
