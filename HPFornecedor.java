package Familia28;

public class HPFornecedor extends HerancaPessoa {
	
		private double valorCredito;
		private double valorDivida;
	
		public HPFornecedor  (String nome, String endere�o, String cpf, int telefone, int idade, double valorCredito, double valorDivida )
		{
			//M�TODO CONSTRUTOR
	
			super (nome,endere�o,cpf,telefone,idade);
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}

		public double getValorCredito() {
			return valorCredito;
		}

		public void setValorCredito(double valorCredito) {
			this.valorCredito = valorCredito;
		}

		public double getValorDivida() {
			return valorDivida;
		}

		public void setValorDivida(double valorDivida) {
			this.valorDivida = valorDivida;
		}
	
		//CRIA��O METODO ESPECIFICOS DA CLASSE
		public void imprimirInfo()
		{
		
		}
		
		public void imprimiInfo()
		{
			System.out.println("Nome do empregado : " + getNome());
			System.out.println("Endere�o: " + getEndere�o());
			System.out.println("CPF: " + getCpf()); 
			System.out.println("Telefone: " + getTelefone());
			System.out.println("Idade: " + getIdade());
			System.out.println("Valor d�vida: " + valorDivida);
			System.out.println("Valor cr�dito: " + valorCredito);
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
		 
			public void obetrSaldo()
			{
				double diferencacredito = valorCredito - valorDivida;
				System.out.println("\nO saldo referente ao fornecedor � igual a: " + diferencacredito);
			}
}

