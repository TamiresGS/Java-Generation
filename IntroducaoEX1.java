package Familia28;

import java.util.Scanner;

	public class IntroducaoEX1 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int dias, meses, anos,tdias;
		 
			Scanner recebe = new Scanner(System.in); 
		
			System.out.println("\nDigite quantos DIAS voc� viveu at� agora: ");
			dias= recebe.nextInt();
		
			System.out.println("\nDigite quantos MESES voc� viveu at� agora: ");
			meses= recebe.nextInt();
		
			System.out.println("\nDigite quantos ANOS voc� viveu at� agora: ");
			anos= recebe.nextInt();
		
			anos= anos * 365;
			meses= meses * 30;
			tdias= anos + meses + dias;
			
			System.out.println("Voc� viveu at� aqui " + tdias + "; dias at� aqui!");
		
		}		
	}		
			
			
			