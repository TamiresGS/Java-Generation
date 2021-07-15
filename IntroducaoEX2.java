package Familia28;

import java.util.Scanner;

	public class IntroducaoEX2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int dias, meses, anos, tdias;
			
			Scanner recebe = new Scanner(System.in); 
			
			System.out.println("Informe quantos dias você já viveu até hoje: ");
			tdias= recebe.nextInt();
			
			anos= (tdias / 365);
			meses= (tdias % 365)/30;
			dias= (tdias % 365 ) % 30 ;
					
			System.out.println("Você viveu até aqui: " + anos + " anos.");
			System.out.println("E mais: " + meses + " meses.");
			System.out.println("E : " + dias + " dias.");

					
				
			
	}

}
