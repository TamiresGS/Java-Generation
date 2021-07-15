package Familia28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excepcao2 {

	//DEMOSTRA O LANÇAMENTO DE UMA EXCECAÇÃO QUANDO OCORRE UMA DIVISÃO POR 0
	
	public static int quociente (int numerador, int denominador) throws ArithmeticException
	{
		return numerador / denominador;
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		boolean continueLoop = true; //DETERMINA SE MAIS ENTRADAS SÃO NECESSÁRIAS
		
		do
		{
			try //LÊ DOIS NUMEROS E FARÁ A INDENTIFICAÇÃO
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
			System.err.printf("Exception: %s\n",inputMismatchException);	// err É PARA NOTIFICAÇÃO DO ERRO EM VERMELHO
			leia.nextLine(); 
			
			System.out.println("\nVocê deve entrar com um valor do tipo Inteiro. Tente novamente");
			
			}
			catch(ArithmeticException arithmeticException)
			{
				System.err.printf("Exception: %s\n", arithmeticException);
				System.out.println("\nO é um denominador inválido! Tente novamente...");
			}
			
		}
		while(continueLoop);
		
		
	}

}
