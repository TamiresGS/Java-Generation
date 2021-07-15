package Familia28;

public abstract class AnimalEX1 {

	 //DECLARA��O DOS ATRIBUTOS DA CLASSE
		private String nome;
		private int idade; 
				
		
		//M�TODO CONSTRUTOR
		public AnimalEX1 (String nome, int idade) 
		{		
			super(); //INDICAR ATRIBUTOS DA SUPER CLASS
			this.nome =  nome;
			this.idade = idade;
		}

		//M�TODO ABSTRATO
		abstract public String emitirSom(); //PRECISAR� SER IMPLEMENTADO
		

		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}
		
}
