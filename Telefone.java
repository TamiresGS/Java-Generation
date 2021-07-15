package Familia28;

public abstract class Telefone { //É UMA CLASSE ABSTRATA

	private String tipo; // ATRIBUTO
	
	abstract public void disca(String numero); // MÉTODOS ABSTRATOS
	abstract public void toca(int numToques); // MÉTODOS ABSTRATOS
	

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
