package Familia28;

public class AnimalPregui�a extends AnimalEX1 {
	
	
	private String sono;
	private String regiaoMata;
	private float peso;
	  
	
	//M�TODO CONSTRUTOR
	
	public AnimalPregui�a (String nome,int idade,String sono, String regiaoMata, float peso)
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
	System.out.println("Dorme em m�dia :" + sono);
	System.out.println("Localiza��o da mata: " + regiaoMata);
	System.out.println("Som emitido; " + emitirSom());
	System.out.println("Se movimenta: " + subirArvore());
	
}	
}
