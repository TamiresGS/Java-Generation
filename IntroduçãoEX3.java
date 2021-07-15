package Familia28;

	import java.util.Scanner;

	public class IntroduçãoEX3 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

			float segundo, horas, minutos, segundos;
			
			Scanner recebe = new Scanner(System.in); 
			
			System.out.println("Digite o tempo de duração em segundos: ");
			segundos= recebe.nextFloat();
			
			horas= (segundos / 3600);
			minutos= (segundos % 3600)/ 60;
			segundos= (segundos % 60)% 60;
			
			
			System.out.println("\nO evento tem duração de " + horas + " horas" );
			System.out.println("E " + minutos + " minutos" );
			System.out.println("E " + segundos + " segundos");
		
					
			

			

		
	}

}
