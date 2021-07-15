package Familia28;

import java.util.Scanner;

public class CondicaoEX4 {

	public static void main(String[] args) {

		
		double num, rest;
		
		
		Scanner recebe = new Scanner(System.in); 
	
		System.out.println("Informe o primero número: ");
		num= recebe.nextDouble();
		
		if (num % 2 == 0)
		{
			rest = Math.sqrt(num);
			System.out.println("O número " + num + "é PAR e sua raiz quadrada é : " + rest);
		}
		else 
		{
			rest = Math.pow(num,2);
			System.out.println("O número " + num + " é ÍMPAR e sua potência elevada ao quadrado " + rest );
		}
	}

}
