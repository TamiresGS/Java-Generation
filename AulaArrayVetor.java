package Familia28;

import java.util.Scanner;

	public class AulaArrayVetor {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			float [] media= new float [4];
		//	String [] nome = new String [5];
			float somamedia=0, mediageral;
			int x;
			
			Scanner recebe = new Scanner(System.in);
			
			
			
			for(x=0;x<4;x++) {
				
			System.out.println("Digite a primeiro média ");
			media[x]= recebe.nextFloat();
			
			somamedia= somamedia + media[x];
			}
			
			mediageral = somamedia + media[x];
			System.out.printf(" A média geral : %2.2f ", mediageral);
			
			
			
	}
}
