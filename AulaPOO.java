package Familia28;

public class AulaPOO {
	
	//DECLARA��O DOS ATRIBUTOS DA CLASSE
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	//M�TODO CONSTRUTOR
	
	public AulaPOO (String nomeProprietario,String modelo, String placa,int ano)
	{
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		
	}
	
	public AulaPOO (String modelo)
	{
		this.modelo= modelo;
	}
	
	//DECLARA��O DOS DEMAIS M�TODOS
	public void imprimirInfo()
	{
		System.out.println(nomeProprietario + "possui um(a) "+ modelo + "com a placa" + placa + " e ano " + ano);
		
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
	
}




