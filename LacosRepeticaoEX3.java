package Familia28;

import java.util.Scanner;

public class LacosRepeticaoEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,menorIdade=0,melhorIdade=0;
		
		Scanner recebe = new Scanner(System.in); 
		
		System.out.print("Digite sua idade: ");
		idade = recebe.nextInt();
		
		
		while (idade != -99) {
			

			if (idade>=49) {
				melhorIdade++;	 
				
			}
			else if (idade<=21) {
				menorIdade++;
			}	
			System.out.print("Digite sua idade: ");
			idade = recebe.nextInt();
				
			}
			
		
			System.out.println("O n�mero de pessoas com menos de 21 anos s�o: " + menorIdade);
			System.out.println("O n�mero de pessoas com mais de 50 anos s�o: " + melhorIdade);	 
	}
}