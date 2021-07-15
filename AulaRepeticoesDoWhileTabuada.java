package Familia28;

import java.util.Scanner;

	public class AulaRepeticoesDoWhileTabuada {
 
		public static void main(String[] args) {
	
		int num,rest,x=1;
		
		 Scanner recebe = new Scanner(System.in); 

		System.out.println("Entre com a Tabuada escolhida : ");
		num=recebe.nextInt();
		
		do
		{
			rest= num * x;
			System.out.println(num+ " X " + x + " = " + rest );
			x++;
		}
		while (x<=10);
		
		
	}

}
