package Familia28;

import java.util.Scanner;

	public class LacosRepeticaoEX6 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			
			int valor, media=0,contador=0, soma=0, total=0;
			
			Scanner recebe = new Scanner(System.in);
			
			do {
			
				System.out.println("Digite uma n�mero no seu teclado: ");
				valor= recebe.nextInt();
				
				 if (valor % 3 == 0) {
					 
					soma= soma + valor;
					total= contador++;
				 }
			}
				while (valor != 0 );
				
				media= soma/total;
			
			System.out.println("A M�dia entre os valores digitados que s�o divis�vel por 3  : " + media);
				
			

	}
}