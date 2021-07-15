package Familia28;
 
	import java.util.Scanner;

		public class CondiçãoEX2 {


			public static void main(String[] args) {
			
			float num1, num2, num3, menor=0, maior = 0, meio=0;
			
			Scanner recebe = new Scanner(System.in); 
			
			System.out.println("Informe o primero número: ");
			num1= recebe.nextFloat();

			System.out.println("Informe o segundo número: ");
			num2= recebe.nextFloat();

			System.out.println("Informe o terceiro número: ");
			num3= recebe.nextFloat();
			 
		
			if (num2<num1 && num2<num3) 
			{
				menor=num2;	
			}
			else if (num3<num1 && num3<num2)
			{
				menor= num3;
			}	
			
			else menor=num1;
						
			
			
			if (num2>num1 && num2>num3)
			{
				maior= num2;
			}
			else if (num3>num1 && num3>num2)
			{
				maior=num3;
			}			
			else maior=num1;
			
			
			if (num2>menor && num2<maior)
			{
				meio= num2;
			}
			else if (num3>menor && num3<maior )
			{
				meio=num3;
			}
			else meio=num1;
		
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);

		
			
		
		
	}

}
