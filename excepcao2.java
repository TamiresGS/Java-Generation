package Familia28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excepcao2 {

	//DEMOSTRA O LAN�AMENTO DE UMA EXCECA��O QUANDO OCORRE UMA DIVIS�O POR 0
	
	public static int quociente (int numerador, int denominador) throws ArithmeticException
	{
		return numerador / denominador;
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		boolean continueLoop = true; //DETERMINA SE MAIS ENTRADAS S�O NECESS�RIAS
		
		do
		{
			try //L� DOIS NUMEROS E FAR� A INDENTIFICA��O
			{
				System.out.println("Entre com o numerador: "); 
				int numerador = leia.nextInt();
				System.out.println("Entre com o denominador: ");
				int denominador = leia.nextInt();
				
				int resultado = quociente (numerador,denominador);
			    System.out.printf("O resultado %d / %d = %d " , numerador,denominador, resultado);
			    continueLoop = false;
			
			}
			catch (InputMismatchException inputMismatchException) //VERIFICAR POSSIVEIS ERROS
			{
			System.err.printf("Exception: %s\n",inputMismatchException);	// err � PARA NOTIFICA��O DO ERRO EM VERMELHO
			leia.nextLine(); 
			
			System.out.println("\nVoc� deve entrar com um valor do tipo Inteiro. Tente novamente");
			
			}
			catch(ArithmeticException arithmeticException)
			{
				System.err.printf("Exception: %s\n", arithmeticException);
				System.out.println("\nO � um denominador inv�lido! Tente novamente...");
			}
			
		}
		while(continueLoop);
		
		
	}

}
