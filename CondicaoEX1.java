package Familia28;

import java.util.Scanner;
 
	public class CondicaoEX1 {

		public static void main(String[] args) {
	 
			float num1, num2, num3, menor=0, maior = 0;
			
			Scanner recebe = new Scanner(System.in); 
			
			System.out.println("Informe o primero n�mero: ");
			num1= recebe.nextFloat();

			System.out.println("Informe o segundo n�mero: ");
			num2= recebe.nextFloat();

			System.out.println("Informe o terceiro n�mero: ");
			num3= recebe.nextFloat();
			
			menor = num1;
					
			if (num2<num1 && num2<num3) 
			{
				menor=num2;	
			}
			else if (num3<num1 && num3<num2)
			{
				menor= num3;
				
			maior=num1;
			}
			if (num2>num1 && num2>num3)
			{
				maior= num2;
			}
			else if (num3>num1 && num3>num2)
			{
				maior=num3;
			}			
			System.out.println("O MAIOR n�mero � : " + maior);
			System.out.println("O MENOR n�mero � : " + menor);	
			
		}
	}	