package Familia28;

public class AnimalPreguiça extends AnimalEX1 {
	
	
	private String sono;
	private String regiaoMata;
	private float peso;
	  
	
	//MÉTODO CONSTRUTOR
	
	public AnimalPreguiça (String nome,int idade,String sono, String regiaoMata, float peso)
	{
		super (nome,idade);
		this.sono = sono;
		this.regiaoMata = regiaoMata;
	}

	public String subirArvore()
	{
		return " Subindo lentamente ";
	}
	
	
	@Override
	public String emitirSom()
	{
		return " Aiiiii que sonooooo";
	}

	
	public String getSono() {
		return sono;
	}


	public void setSono(String sono) {
		this.sono = sono;
	}


	public String getRegiaoMata() {
		return regiaoMata;
	}


	public void setRegiaoMata(String regiaoMata) {
		this.regiaoMata = regiaoMata;
	}

	public void imprimiInfo()
	{
		
	System.out.println("Nome:" + getNome());
	System.out.println("Idade: " + getIdade());
	System.out.println("Dorme em média :" + sono);
	System.out.println("Localização da mata: " + regiaoMata);
	System.out.println("Som emitido; " + emitirSom());
	System.out.println("Se movimenta: " + subirArvore());
	
}	
}
