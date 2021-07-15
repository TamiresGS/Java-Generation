package Familia28;

import java.util.Scanner;

public class LacosRepeticaoEX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int idade,identgenero,fpsic,x=1;
		int contpc=0, contmn=0, contha=0,contoc=0,contpn40=0,contpc18=0;
		
		 Scanner recebe = new Scanner(System.in); 
		 
		 while (x<=5) {
			 System.out.println("Digite sua idade: ");
			 idade = recebe.nextInt();
			 
			 System.out.println("Digite sua identidade de gênero  (1)Feminino (2)Masculino (3)Outros: ");
			 identgenero = recebe.nextInt();
			 
			 System.out.println("Digite o fator psicológico (1)Calmo (2)Nervosa (3)Agressiva: ");
			 fpsic = recebe.nextInt();
			 
			 if (fpsic ==1) //Pessoas Calmas
			 {
				 contpc++;
			 }
			 if (identgenero == 1 && fpsic == 2)
			 {
				 contmn++;
			 }
			 if (identgenero == 2 && fpsic == 3) {
				 contha++;
			 }
			 if (identgenero == 3 && fpsic == 1) {
				 contoc++; 
			 }
			 if (fpsic == 2 && idade >40 ) {
				contpn40++;
			 }
			 if (fpsic == 1 && idade<18) {
				 contpc18++;
			 }
			 
			 x++;
			 
		 }	
		 System.out.println("Pessoas calmas: " + contpc  );
		 System.out.println("Mulheres nervosas: " +  contmn );
		 System.out.println("Homens agressivo"  + contha );
		 System.out.println("Pessoas outros calmos: " + contoc );
		 System.out.println("Pessoas nersosa com mais de 40 anos: " + contpn40 );
		 System.out.println("Pessoas calmas com menos de 18 anos: " + contpc18 );
		 
		 
		 
		 
		
	}

}
