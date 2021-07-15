package Familia28;

public class HerancaPessoa { //SERÁ SUPERCLASSE 
		
    //DECLARAÇÃO DOS ATRIBUTOS DA CLASSE
	private String nome;
	private String endereço;
	private String cpf;
	private int telefone;
	private int idade; 
	
	
	//MÉTODO CONSTRUTOR
	public HerancaPessoa (String nome, String endereço, String cpf, int telefone, int idade) 
	{		
		super(); //INDICAR ATRIBUTOS DA SUPER CLASS
		this.nome =  nome;
		this.endereço =  endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
	 if (getCpf().length() != 11) //VERIFICANDO SE O CPF DIGITADO TEM 11 NÚMEROS
	 {
		 System.out.println("\n CPF INVÁLIDO!!!");
	 }
	 else
	 {
		 System.out.println("\n CPF VÁLIDO!!!");
	 }
	 
	 
	 
	}


}

