package Familia28;

public interface Figuras {

	public String nomeInterface = "Figuras";
	
	//CRIAMOS DOIS MÉTODOS ABSTRATOS 
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	//CRIANDO TRÊS MÉTODOS ABSTRATOS
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	
	
		
}


