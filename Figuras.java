package Familia28;

public interface Figuras {

	public String nomeInterface = "Figuras";
	
	//CRIAMOS DOIS M�TODOS ABSTRATOS 
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	//CRIANDO TR�S M�TODOS ABSTRATOS
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	
	
		
}


