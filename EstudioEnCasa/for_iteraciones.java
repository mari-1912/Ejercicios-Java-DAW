package EstudioEnCasa;

public class for_iteraciones {

	public static void main(String[] args) {
		
		/*int a = 1;
		int b = 3;
		
		for (int i=a; i<=a+b; i++) {
			for (int j=a+b; j>=0; j--) {
				System.out.println("***");
			}
		}*/
		
		int numero=7;
		int contador;
		int resultado=0;
		
		contador=1;
		
		while (++contador<=10) {
			resultado=contador*numero;
			System.out.println(numero + "x" + contador + "=" + resultado);
			contador++;
		}
		
		/*int variable1=0;
		float variable2=0;
		
		if (variable1>variable2)
			variable1=(int)(variable2);
		*/
		
		for (int i=1;i<=5;i++) {
			System.out.println("hola");
		}
		
		int i=1;
		
		while (i<=5) {
			System.out.println("hola");
			i++;
		}
		
		do {
			System.out.println("hola");
			i++;
		} while (i<=5);
		

	}

}
