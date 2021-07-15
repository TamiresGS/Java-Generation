package Familia28;

import java.util.Scanner;

		public class ArrayMatrizEX4 {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				float [][] matrizA = new float [2][2];
				float [][] matrizB = new float [2][2];
				float [][] resultado = new float [2][2];

				int l,c, valor,opcao;
				
				Scanner recebe = new Scanner(System.in);
				
			
				for (l=0;l<2;l++)  
				{
					for (c=0;c<2;c++)
					{
						System.out.println("Entre com os valores da Matriz: "); //VALOR MATRIZ A
						matrizA[l][c] = recebe.nextFloat();
						System.out.println("Entre com os valores da Matriz: "); //VALOR MATRIZ A
						matrizB[l][c] = recebe.nextFloat();
					}
			
				}		
				System.out.println("ESCOLHA A AÇÃO");
				System.out.println("[1] PARA SOMAR AS DUAS MATRIZES");
				System.out.println("[2] PARA SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA");
				System.out.println("[3] PARA UMA CONSTANTE DE AMBAS MATRIZES");
				System.out.println("[4] PARA IMPRIMIR AMBAS MATRIZES");
				System.out.println("ESCOLHA A AÇÃO: ");
				opcao = recebe.nextInt();
				
				
						switch (opcao)
						{
						case 1:
							for (l=0;l<2;l++)
							{
								for (c=0;c<2;c++)
								{

							resultado[l][c] = matrizA[l][c] + matrizB[l][c];
							System.out.println("A soma das duas Matrizes é " + resultado[l][c]);
								}
							}
 							
						break;
						
						case 2:
							for (l=0;l<2;l++) 
							{
								for (c=0;c<2;c++)
								{

							resultado[l][c] = matrizA[l][c] - matrizB[l][c];
							System.out.println("A subtração entre a Matriz A e B é " + resultado);
								}
							}
						break;
						
						case 3:
							System.out.println("Entre com o valor da constante: ");
							valor = recebe.nextInt();
							for (l=0;l<2;l++) 
							{
								for (c=0;c<2;c++)
								{
									matrizA[l][c]= matrizA[l][c] + valor;
									System.out.println("Constante somada Matriz A : " + matrizA[l][c]);
									
									matrizB[l][c]= matrizB[l][c] + valor;
									System.out.println("Constante somada Matriz B : " + matrizB[l][c]);
									
								}
							}
						break;
						
						case 4:
							System.out.println("Matriz A: " + matrizA);
							System.out.println("Matriz A: " + matrizB);
							
							
						break;
						
						}
						
		}
}
		