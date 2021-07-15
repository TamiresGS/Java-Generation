package Familia28;

import java.util.Scanner;

	public class ArrayMatrizEX3 {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				int [][] valor = new int [3][3];
				int l,c, maior10=0;
				Scanner recebe = new Scanner(System.in);
				
				for (l=0;l<3;l++)
				{
					for (c=0;c<3;c++)
					{
						System.out.println("Entre com os valores da matriz:");
						valor[l][c] = recebe.nextInt();
					
						if (valor[l][c]> 10)
						{
						   maior10++;
							
						}
						
					}
				}
	
				System.out.println("Dos números digitados " + maior10 + " são maiores que 10!");
				
   }

}