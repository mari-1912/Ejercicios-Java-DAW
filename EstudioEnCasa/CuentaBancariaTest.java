package EstudioEnCasa;

public class CuentaBancariaTest {

	public static void main(String[] args) {
		
		CuentaBancaria cuentaBancaria = new CuentaBancaria("María Pilar Quintero");
		
		//System.out.println(cuentaBancaria.consultarSaldo());
		
		cuentaBancaria.ingresar(500);
		
		cuentaBancaria.retirar(200);
		
		System.out.println("El saldo actual de " + cuentaBancaria.getTitular() + " es: " + cuentaBancaria.getSaldo());

	}

}
