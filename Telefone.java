package Familia28;

public abstract class Telefone { //� UMA CLASSE ABSTRATA

	private String tipo; // ATRIBUTO
	
	abstract public void disca(String numero); // M�TODOS ABSTRATOS
	abstract public void toca(int numToques); // M�TODOS ABSTRATOS
	

	public Telefone(String tipo)
	{
		this.tipo = tipo;
	}

	public String getTipo() 
	{
		return tipo;
	}
	
	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	
	//CONSTRUTOR


	
	
	
}
