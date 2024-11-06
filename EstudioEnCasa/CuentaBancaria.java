package EstudioEnCasa;

public class CuentaBancaria {
	
	private String titular;
	private double saldo;
	
	/**
	 * 
	 * @param titular
	 * @param saldo
	 */
	public CuentaBancaria(String titular, double saldo) {
		
		this.titular = titular;
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @param saldo
	 */
	public CuentaBancaria(double saldo) {
		
		this.titular = "mari";
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @param titular
	 */
	public CuentaBancaria(String titular) {
		
		this.saldo = 1000;
		this.titular = titular;
	}
	

	public String getTitular() {
		
		return this.titular;
	}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	public void setTitular(String titular) {
		
		this.titular = titular;
	}
	
	public void setSaldo(double cantidad) {
		
		this.saldo += cantidad;
	}
	
	public void ingresar(double cantidad) {
		
		if  (cantidad > 0) {
			
			this.setSaldo(cantidad);
		}
		
	}
	
	public void retirar(double cantidad) {
		
		if (cantidad > 0 && this.saldo - cantidad >= 0) {
			
			this.setSaldo(-cantidad);
		}
	}
	
	public double consultarSaldo() {
		
		return this.saldo;
	}
	


}
