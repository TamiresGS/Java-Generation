package Familia28;

import java.util.Scanner;

public class AulaArreyMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numero = new int [2][3];
		int linha, coluna;
		
		Scanner recebe = new Scanner(System.in);
		
		for (linha=0;linha<2;linha++)  //PERCORRENDO A MATRIZ LINHA
		{
			for(coluna=0;coluna<3;coluna++) // PERCORRENDO A MATRIZ COLUNA
			{
				System.out.println("Entre com um número: "); //ENTRANDO COM VALORES DA MATRIZ
				numero[linha][coluna] = recebe.nextInt();
			}
		}
		for (linha=0;linha<2;linha++) //PERCORRENDO A MATRIZ LINHA
		{
			for(coluna=0;coluna<3;coluna++) //PERCORRENDO A MATRIZ COLUNA
			{
				if (numero[linha][coluna] % 2 == 0 ) // VERIFICANDO SE É PAR
				{
					System.out.println(numero [linha][coluna] + " é PAR");
				}
				else 
				{
					System.out.println(numero [linha][coluna] + " é ÍMPAR");

				}
			}
		}
			
	}

}
