package Familia28;

import java.util.Scanner;

	public class AulaArreyMatriz2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
	
			float [][] valor = new float [3][3];
			float  somaValor=0, mediaValor, somaDiagonal=0;
			int l,c;
			
			Scanner recebe = new Scanner(System.in);
		
			for (l=0;l<3;l++)
			{
				for (c=0;c<3;c++)
				{
					System.out.println("Entre com os valores:");
					valor[l][c] = recebe.nextFloat();
				
					somaValor = somaValor + valor[l][c];
					
					if (l==c)
					{
						somaDiagonal = somaDiagonal + valor[l][c];
						
					}				}
					
			}
			
			mediaValor = somaValor / 9;
			System.out.println("Somatória da diagonal principal é " + somaDiagonal);
			System.out.println("A média dos valores é " + mediaValor);
			
		}
		
	
	}


