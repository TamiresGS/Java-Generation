package Familia28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		
		Scanner leia = new Scanner(System.in);
		
		//<String> estoque = new List<String>();
		List<String> estoque = new ArrayList<String>(); // CRIANDO OBJETO

			
		do
		{
			System.out.println("\n (1) Deseja add produtos ao estoque\n(2)Dseseja remover um produto\n(3)Atualizar\n(4)Mostrar todos produtos do estoque\n(5)Encerrar");
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\n\tDigite sua opção:");
		op = leia.nextInt();
		
		switch(op)
		{
		case 1:
			leia.nextLine();  
			
			System.out.println("Digite o produto para ADICIONAR no estoque; ");
			String produto = leia.nextLine();   //RECEBENDO A ENTRADA STRING
			estoque.add(produto);  //ADD PRODUTO AO MEU ARRAYLIST
			
			break;
			
			
		case 2:
			leia.nextLine();  
			
			System.out.println("Digite o produto para REMOVER no estoque; ");
			String produto1 = leia.nextLine();   //RECEBENDO A ENTRADA STRING
			
			if (estoque.contains(produto1)) //IDENTIFICANDO SE HÁ O PRODUTO1 NO MEU ESTOQUE
			{
				estoque.remove(produto1); //REMOVE PRODUTO AO MEU ARRAYLIST
			}
			else
			{
				System.out.println("Produto inexistencte no estoque");
			}
			System.out.println(estoque);
			break;
			
			
		case 3:
			leia.nextLine();   
			
			System.out.println("Digite o produto que deseja atualizar no estoque; ");
			String verifica = leia.nextLine();   //RECEBENDO A ENTRADA STRING
			
			System.out.println("Digite o nome do produto entrará no lugar de " + verifica + ": ");
			String novo = leia.nextLine();
			
			if (estoque.contains(verifica)) //IDENTIFICANDO SE HÁ O VERIFICA NO MEU ESTOQUE
			{
				estoque.remove(verifica); //REMOVE PRODUTO AO MEU ARRAYLIST
				estoque.add(novo); // ADD O NOVO (NOVO PRODUTO)
			}
			else
			{
				System.out.println("Produto inexistencte no estoque");
			}
			
			System.out.println(estoque);
			break;
			
			
		case 4:
			leia.nextLine();   
			
			System.out.println("Os produtos do estoque são: ");
			System.out.println(estoque); //APENAS MOSTRANDO TODOS PRODUTOS ESTOQUE
			break;
			default:
				System.out.println("Finalizou o programa...");
				
			}
		}
		while(op != 0);
	}		
}
		


