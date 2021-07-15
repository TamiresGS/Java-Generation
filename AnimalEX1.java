package Familia28;

public abstract class AnimalEX1 {

	 //DECLARAÇÃO DOS ATRIBUTOS DA CLASSE
		private String nome;
		private int idade; 
				
		
		//MÉTODO CONSTRUTOR
		public AnimalEX1 (String nome, int idade) 
		{		
			super(); //INDICAR ATRIBUTOS DA SUPER CLASS
			this.nome =  nome;
			this.idade = idade;
		}

		//MÉTODO ABSTRATO
		abstract public String emitirSom(); //PRECISARÁ SER IMPLEMENTADO
		

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
