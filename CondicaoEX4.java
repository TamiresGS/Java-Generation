package Familia28;

import java.util.Scanner;

public class CondicaoEX4 {

	public static void main(String[] args) {

		
		double num, rest;
		
		
		Scanner recebe = new Scanner(System.in); 
	
		System.out.println("Informe o primero n�mero: ");
		num= recebe.nextDouble();
		
		if (num % 2 == 0)
		{
			rest = Math.sqrt(num);
			System.out.println("O n�mero " + num + "� PAR e sua raiz quadrada � : " + rest);
		}
		else 
		{
			rest = Math.pow(num,2);
			System.out.println("O n�mero " + num + " � �MPAR e sua pot�ncia elevada ao quadrado " + rest );
		}
	}

}
