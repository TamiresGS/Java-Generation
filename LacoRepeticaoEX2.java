package Familia28;

import java.util.Scanner;

public class LacoRepeticaoEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int valor,par=0,impar=0, x;
		
		 Scanner recebe = new Scanner(System.in); 
		
		 for (x=1; x<=10; x++) {
			
			 System.out.println("Entre com um número inteiro : ");
			 valor=recebe.nextInt();

			 if (valor % 2 == 0) {
				 
				 par++;
			 }
			 else {
				 impar++;
			 }
		 }
		System.out.println("Dos valores inseridos "+ par + " são PAR");
		System.out.println("Dos valores inserido "+ impar + " são ÍMPAR");
		 
	}

}
