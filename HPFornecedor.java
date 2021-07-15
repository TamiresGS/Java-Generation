package Familia28;

public class HPFornecedor extends HerancaPessoa {
	
		private double valorCredito;
		private double valorDivida;
	
		public HPFornecedor  (String nome, String endereço, String cpf, int telefone, int idade, double valorCredito, double valorDivida )
		{
			//MÉTODO CONSTRUTOR
	
			super (nome,endereço,cpf,telefone,idade);
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
	
		//CRIAÇÃO METODO ESPECIFICOS DA CLASSE
		public void imprimirInfo()
		{
		
		}
		
		public void imprimiInfo()
		{
			System.out.println("Nome do empregado : " + getNome());
			System.out.println("Endereço: " + getEndereço());
			System.out.println("CPF: " + getCpf()); 
			System.out.println("Telefone: " + getTelefone());
			System.out.println("Idade: " + getIdade());
			System.out.println("Valor dívida: " + valorDivida);
			System.out.println("Valor crédito: " + valorCredito);
			}
		
		 public void validarCpf()
			{
			 if (getCpf().length() != 11) //VERIFICANDO SE O CPF DIGITADO TEM 11 NÚMEROS
			 {
				 System.out.println("\n CPF INVÁLIDO!!!");
			 }
			 else
			 {
				 System.out.println("\n CPF VÁLIDO!!!");
			 }
			}
		 
			public void obetrSaldo()
			{
				double diferencacredito = valorCredito - valorDivida;
				System.out.println("\nO saldo referente ao fornecedor é igual a: " + diferencacredito);
			}
}

