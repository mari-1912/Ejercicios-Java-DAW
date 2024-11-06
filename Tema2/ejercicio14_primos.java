package Tema2;

public class ejercicio14_primos {

	public static void main(String[] args) {
		/*
		 * Muestra los 20 primeros numeros primos
		 */
		int contador = 0; //cuantas veces se imprimen los numeros primos
		int num = 2;
		
		// bucle para pintar los 20 numeros
		while (contador < 20) 
		{
			boolean esPrimo = true; // para determinar si es primo o no
			int i = 2; //divisores
			//mientras tenga que seguir calculando y sea primo ejecutar codigo
			
			while (i <= (num/2) && esPrimo) //el num/2 es porque nunca va a ser divisible un numero a mas de su mitad (6/2)
			{								// tampoco si es mayor que su raiz cuadrada (i<match.num)
				if (num % i == 0) 
				{
					esPrimo = false;
				}
				
				i++;
				
			} // fin del 2while 
			
			if (esPrimo) 
			{
				System.out.println(num + " ");
				contador++;
			}
			
			num++;
			
		} // fin del 1while

	} //fin main

}
