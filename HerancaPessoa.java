package Familia28;

public class HerancaPessoa { //SER� SUPERCLASSE 
		
    //DECLARA��O DOS ATRIBUTOS DA CLASSE
	private String nome;
	private String endere�o;
	private String cpf;
	private int telefone;
	private int idade; 
	
	
	//M�TODO CONSTRUTOR
	public HerancaPessoa (String nome, String endere�o, String cpf, int telefone, int idade) 
	{		
		super(); //INDICAR ATRIBUTOS DA SUPER CLASS
		this.nome =  nome;
		this.endere�o =  endere�o;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}

	
	// CRIANDO GET E SET
	 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() { 
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	// CRIANDO OS METODOS ESPECIFICOS DA CLASSE
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

