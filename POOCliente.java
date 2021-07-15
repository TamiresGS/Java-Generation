package Familia28;

public class POOCliente {

	//DECLARA��O DOS ATRIBUTOS DA CLASSE
	
		private String nomeCliente;
		private int idade;
		private String signo ;
		private String profissao;
		
	
		//M�TODO CONSTRUTOR
		
		public POOCliente (String nomeCliente,int idade, String signolaca,String profissao)
		{
			this.nomeCliente = nomeCliente;
			this.idade = idade;
			this.signo = signo;
			this.profissao = profissao;	
		}
		public POOCliente (String signo)
		{
			this.signo= signo;
		}
		
		public POOCliente (String nomeCliente, int idade)
		{
			this.nomeCliente= nomeCliente;
			this.idade = idade;
		}
		
		//DECLARA��O DOS DEMAIS M�TODOS
		public void imprimirInfo()
		{
			System.out.println(nomeCliente + " tem " + idade + " anos de idade e � do signo de " + signo + " e sua profiss�o �  " + profissao);
			
		}
		public String getNomeCliente() {
			return nomeCliente;
		}
		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getSigno() {
			return signo;
		}
		public void setSigno(String signo) {
			this.signo = signo;
		}
		public String getProfissao() {
			return profissao;
		}
		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
		
}
