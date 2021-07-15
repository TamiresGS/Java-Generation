package Familia28;

import java.text.NumberFormat;

public class HPOperario extends HerancaPessoa { 
	
	//DECLARA��O DOS ATRIBUTOS DA CLASSE

	private double valorProducao;
	private double comissao;
	
		public HPOperario (String nome, String endere�o, String cpf, int telefone, int idade, double valorProducao, double comissao )
		{ 
			//M�TODO CONSTRUTOR
	
			super (nome,endere�o,cpf,telefone,idade);
			this.valorProducao = valorProducao;
			this.comissao = comissao;
		}
	
		public double getValorProducao() { 
			return valorProducao;
		}
	
		public void setValorProducao(double valorProducao) {
			this.valorProducao = valorProducao;
		}
	
		public double getComissao() {
			return comissao;
		}
	
		public void setComissao(double comissao) {
			this.comissao = comissao;
		}

		public void imprimiInfo()
		{
			System.out.println("Nome do empregado : " + getNome());
			System.out.println("Endere�o: " + getEndere�o());
			System.out.println("CPF: " + getCpf());
			System.out.println("Telefone: " + getTelefone());
			System.out.println("Idade: " + getIdade());
			System.out.println("Valor produ��o:" + valorProducao);
			System.out.println("Valor comiss�o: " + comissao);
			}
		
		
		public void calcularSalario()
		{
			double valorTotal = valorProducao + (valorProducao * (comissao/100));
			System.out.println("O valor total a ser recebido pelo oper�rio: " + valorTotal);

		}
		
	
	

		public void validarCpf()
		{
		 if (getCpf().length() != 11) //VERIFICANDO SE O CPF DIGITADO TEM 11 N�MEROS
		 {
			 System.out.println("\n CPF INV�LIDO!!!");
		 }
		 else
		 {
			 System.out.println("\n CPF V�LIDO!!!");
		 }
		
		
		}
		
}
