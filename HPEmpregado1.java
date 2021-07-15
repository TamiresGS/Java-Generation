package Familia28;

public class HPEmpregado1 extends HerancaPessoa { //extends CRIANDO HERAN�A DA CLASSE Heran�aPessoa
		
	//DECLARA��O DOS ATRIBUTOS DA CLASSE // ESSES ATRIBUTOS S�O APENAS NO HPEmprego1
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	  
	
	//M�TODO CONSTRUTOR
	public HPEmpregado1 (String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto)
	{
		super (nome,endereco,cpf,telefone,idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto; 	
	}
	
	//CRIANDO GET E SET 

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void imprimiInfo()
	{
		System.out.println("Nome do empregado : " + getNome());
		System.out.println("Endere�o: " + getEndere�o());
		System.out.println("CPF: " + getCpf());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Idade: " + getIdade());
		System.out.println("C�digo Setor: " + codigoSetor);
		System.out.println("Sal�rio: " + salarioBase);
		System.out.println("Imposto: " + imposto);
		}
	
	public void calcularSalario()
	{
		double salarioTotal = salarioBase - (salarioBase *(imposto/100));
		System.out.println("Sal�rio recebido �: " + salarioTotal);
	}
	
	
}
