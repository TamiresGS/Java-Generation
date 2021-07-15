package Familia28;

import java.util.Scanner;

	public class LacosRepeticaoEX5 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
			int valor,contador=0, soma=0;
		
			Scanner recebe = new Scanner(System.in);
			
			do {
			
			System.out.println("Digite uma número no seu teclado: ");
			valor= recebe.nextInt();
			
			soma= soma + valor;
					
			}
			while (valor!=0);
							
					
			System.out.println("A soma entre os números inseridos é : " + soma);

			
	}

}
