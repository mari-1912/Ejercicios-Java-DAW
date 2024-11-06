package Tema3;

public class CuentaBancaria {

	//DECLARACION ATRIBUTOS
	
	private String sTitular;
	private double dSaldo;
	
	
	/**
	 * @param titular
	 * @param saldo
	 */
	public CuentaBancaria(String titular, double saldo) {
		super();
		this.sTitular = titular;
		this.dSaldo = saldo;
	}
	
	
	/**
	 * @return the titular
	 */
	public String getTitular() {
		return sTitular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.sTitular = titular;
	}

	/**
	 * @return the saldo
	 */
	
	public double getSaldo() {
		return dSaldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.dSaldo = saldo;
	}
	
	//METODOS
	/*
	 * ingresar: Incrementa el saldo en la cantidad especificada si la cantidad es positiva.
		
	 */
	
	/**
	 * 
	 * @param ingresar
	 */
	public void ingresar(double cantidad) {
		
		if (cantidad > 0) {
			
			dSaldo += cantidad;
			System.out.println(cantidad + this.dSaldo);
		} else {
			
			//no se puede dinero negativo
		}
		
	}
	
	/**
	 * 
	 * @param retirar
	 * retirar: Decrementa el saldo en la cantidad especificada si la cantidad es positiva y hay suficientes fondos.
	 */
	public void retirar(double cantidad) {
		
	}
	
	//consultarSaldo: Devuelve el saldo actual de la cuenta.
	//getTitular: Devuelve el nombre del titular de la cuenta.

	
}
