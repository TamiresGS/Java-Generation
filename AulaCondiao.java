package Familia28;

	import java.util.Scanner;

		public class AulaCondiao {

	 		public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int num; 
				
				Scanner recebe = new Scanner(System.in); 
				
				System.out.println("Entre com um n�emro: ");
				num= recebe.nextInt();
				
				if (num>0) {
					System.out.println("O n�mero " + num + " � POSITIVO");
				}
				else if	(num<0) {
					System.out.println("O n�mero " + num + " � NEGATIVO");
				}
				else {
					System.out.println("-O n�mero � Zero e neutro");
					
				}
				
				
				
				
	}

}
