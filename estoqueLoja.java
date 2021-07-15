package Familia28;


	import java.util.ArrayList;
	import java.util.List;
    import java.util.Scanner;

	public class estoqueLoja {
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
				
		Scanner recebe = new Scanner(System.in);
				
		List<String> estoqueLoja = new ArrayList<String>(); // CRIANDO OBJETO

					
		do
		{
		System.out.println("\n(1) Deseja adicionar produtos ao estoque");
		System.out.println("\n(2)Dseseja remover um produto");
		System.out.println("\n(3)Atualizar estoque");
		System.out.println("\n(4)Mostrar todos produtos do estoque");
		System.out.println("\n(5)Encerrar");
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\n\tDigite sua opção: ");
		op = recebe.nextInt();
		
		switch(op)
		{
		case 1:
			recebe.nextLine();  
			
			System.out.println("Digite o produto para ADICIONAR no estoque; ");
			String produto = recebe.nextLine();   //RECEBENDO A ENTRADA STRING
			estoqueLoja.add(produto);  //ADD PRODUTO AO MEU ARRAYLIST
			
			break;
			
			
		case 2:
			recebe.nextLine();  
			
			System.out.println("Digite o produto para REMOVER no estoque; ");
			String produto1 = recebe.nextLine();   //RECEBENDO A ENTRADA STRING
			
			if (estoqueLoja.contains(produto1)) //IDENTIFICANDO SE HÁ O PRODUTO1 NO MEU ESTOQUE
			{
				estoqueLoja.remove(produto1); //REMOVE PRODUTO AO MEU ARRAYLIST
			}
			else
			{
				System.out.println("Produto inexistencte no estoque");
			}
			System.out.println(estoqueLoja);
			break;
			
			
		case 3:
			recebe.nextLine();   
			
			System.out.println("Digite o produto que deseja atualizar no estoque; ");
			String identificar = recebe.nextLine();   //RECEBENDO A ENTRADA STRING
			
			System.out.println("Digite o nome do produto entrará no lugar de " + identificar + ": ");
			String novo = recebe.nextLine();
			
			if (estoqueLoja.contains(identificar)) //IDENTIFICANDO SE HÁ O VERIFICA NO MEU ESTOQUE
			{
				estoqueLoja.remove(identificar); //REMOVE PRODUTO AO MEU ARRAYLIST
				estoqueLoja.add(novo); // ADD O NOVO (NOVO PRODUTO)
			}
			else
			{
				System.out.println("Produto inexistencte no estoque");
			}
			
			System.out.println(estoqueLoja);
			break;
			
			
		case 4:
			recebe.nextLine();   
			
			System.out.println("Os produtos do estoque são: ");
			System.out.println(estoqueLoja); //APENAS MOSTRANDO TODOS PRODUTOS ESTOQUE
			break;
			default:
				System.out.println("Finalizou o programa...");
				
			}
		}
		while(op != 0);

		
		
		
	
		
		
		
		
	}
		
}
	
