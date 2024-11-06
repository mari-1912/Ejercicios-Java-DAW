package EstudioEnCasa;

import java.util.Scanner;

public class calculadora_for {

	public static void main(String[] args) {
		// pedir numero por pantalla entero y  posisitivo y escribir su tabla de multiplicar hasta el 10
		
		Scanner sc = new Scanner(System.in);
		int num, i=1;
		boolean acabar = true;
		
		while (acabar==true) 
		{
			System.out.println("Ingresa un número positivo: ");
			num = sc.nextInt();
			
			if (num>0)
			{
				while (i <= 10) 
				{
					System.out.println(num +" por " + i + " es igual a: " + num*i);
					i++;
				}
				/*for (int i = 1; i <= 10; i++) 
				{
					System.out.println(num +" por " + i + " es igual a: " + num*i);
				}*/
			
				acabar=false;
			}
			
			else 
			{
				System.out.println("Número incorrecto, vuelve a introducir un número: ");
			}
			
		}
	}

}
