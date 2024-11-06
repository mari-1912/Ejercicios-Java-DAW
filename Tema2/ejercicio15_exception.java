package Tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio15_exception {

	public static void main(String[] args) {
		/*
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		try 
		{
		
			System.out.println("Itroduce un número: ");
			int num1 = sc.nextInt();
			
			System.out.println("Itroduce otro número: ");
			int num2 = sc.nextInt();
			
			int resultado = num1/num2;
			
			System.out.println("\nResultado de la división: " + resultado);
		}
		
		catch (InputMismatchException ime)
		{
			
			System.out.println("No se pueden itroducir decimales");
			//ime.getMessage();
			//ime.printStackTrace();
		}
		
		catch (ArithmeticException ae)
		{
			
			System.out.println("No se puede dividir por cero");
			ae.printStackTrace();
		}
		
		finally 
		{
			
			sc.close();
		}

	}

}
