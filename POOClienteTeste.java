package Familia28;

public class POOClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//INSTANCIANDO UM OBJETO DA AULAPOO
		
				POOCliente cliente1 = new POOCliente ("\n Tamires Guimar�es ", 29 , " Leonina ", "Desenvolvedora Jr ");
				
				//TROCA DE MENSAGEM (CHAMADA AO M�TODO IMPRIMIR INFO)
				cliente1.imprimirInfo();
				System.out.println("\n============================PR�XIMA CLIENTE=====================================");
				cliente1.setNomeCliente("\n Eliane Guimar�es ");
				cliente1.setIdade(51);
				cliente1.setSigno(" Leonina" );
				cliente1.setProfissao(" Funcio�ria Publica" );
				cliente1.imprimirInfo();

	}

}
