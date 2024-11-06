package Tema3;

public class CuentaBancariaStaticTest {

	public static void main(String[] args) {
		
		CuentaBancariaStatic cb1 = new CuentaBancariaStatic("Pilar",1000.0);
		System.out.println("El total de cuentas creadas es: " + cb1.getCuentasCreadas());

		CuentaBancariaStatic cb2 = new CuentaBancariaStatic("Pedro",2000.0);
		System.out.println("El total de cuentas creadas es: " + cb1.getCuentasCreadas());

		CuentaBancariaStatic cb3 = new CuentaBancariaStatic("Rocío",1500.0);
		System.out.println("El total de cuentas creadas es: " + cb1.getCuentasCreadas());

	}

} 
