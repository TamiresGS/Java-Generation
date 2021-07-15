package Familia28;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		 
		double n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("Digite a primeira nota: ");
		n1= leia.nextFloat();
		 
		System.out.println("Digite a segunda nota: ");
		n2= leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3= leia.nextFloat();
		
		media= (n1+n2+n3)/3;
		
		System.out.println("Sua média é :"+ media);
		System.out.printf("Sua média é  %2.2f:"+ media); //printf é para formatar as casas decimais 

		n1= Math.sqrt(n2);
		n2 = Math.pow(n3, 3);
		n3= n1 % 2;
		
	}

}
