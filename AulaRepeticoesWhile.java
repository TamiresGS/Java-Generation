package Familia28;

import java.util.Scanner;
 
public class AulaRepeticoesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int idade;
		 
		 Scanner recebe = new Scanner(System.in); 
		 
		 System.out.print("Digite uma idade: ");
		 idade = recebe.nextInt();
		 
		 while(idade>=1)
		 {
			 if (idade>= 18)
			 {
			 System.out.println("Voc� tem " + idade + "  anos j� � maior de idade.");
			 }
			 else
			 {
				 System.out.println("Voc� tem " + idade + " anos ainda n�o � maior de idade.");
			 }
			 System.out.print("Digite sua idade: ");
			 idade = recebe.nextInt();
			 
			 System.out.print("Digite sua idade: ");
			 idade = recebe.nextInt();
			 
			 
		 }
	}

}
