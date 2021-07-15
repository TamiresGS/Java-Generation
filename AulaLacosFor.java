package Familia28;

import java.util.Scanner;

	public class AulaLacosFor {

		public static void main(String[] args) {
		// TODO Auto-generated method stub 

			float valor, soma=0;
			int x;
					
			Scanner recebe = new Scanner(System.in); 
			
			for (x=1; x<=5; x++)
			{

			System.out.println("Digite o o valor: ");
			valor=recebe.nextFloat();
			
			soma= soma + valor;
			}
			
		System.out.println("A soma dos valor é : " + soma);
			
	}

}
