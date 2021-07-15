package Familia28;

	import java.util.Scanner; 

		public class CondicaoEscolhaCaso {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				Scanner recebe = new Scanner(System.in); 

				int mes;
				
				System.out.println("Digite com o número do mês desejado  (De 1 ao 12): ");
				mes= recebe.nextInt();
				/*
				if (mes>=1 && mes<=12)
				{
					System.out.println("")
				
				}
			    */
				switch(mes)
				{
				case 1 : 
					System.out.println("JANEIRO");
					break;
					
				case 2 : 
					System.out.println("FEVEREIRO");
					break;
					
				case 3 : 
					System.out.println("MARÇO");
					break;
					
				case 4 : 
					System.out.println("ABRIL");
					break;
					
				case 5 : 
					System.out.println("MAIO");
					break
					;
				case 6 : 
					System.out.println("JUNHO");
					break;
					
				case 7 : 
					System.out.println("JULHO");
					break;

				case 8 : 
					System.out.println("AGOSTO");
					break;

				case 9 : 
					System.out.println("SETEMBRO");
					break;

				case 10 : 
					System.out.println("OUTUBRO");
					break;

				case 11 : 
					System.out.println("NOVEMBRO");
					break;

				case 12 : 
					System.out.println("DEZEMBRO");
					break;
					
				default :
					System.out.println("Opção inválida");
				
				}
				
				
	}
}
