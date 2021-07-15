package Familia28;

public class AnimalCavalo extends AnimalEX1 {
	
	
	private String porte;
	private String altura;
	private float peso;
	  
	
	//MÉTODO CONSTRUTOR
	
	public AnimalCavalo (String nome, int idade, String porte, String altura, float peso)
	{
		super (nome,idade);
		this.porte = porte;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String correr()
	{
		return " Correndo veloz ";
	}

	@Override
	public String emitirSom()
	{
		return " Relinchandoooooo";
	}
	
	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}


	public String getAltura() {
		return altura;
	}


	public void setAltura(String altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void imprimiInfo()
	{
	System.out.println("Nome do Cavalo é : " + getNome());
	System.out.println("Idade: " + getIdade());
	System.out.println("Porte: " + porte);
	System.out.println("Altura: " + altura);
	System.out.println("Pesa : " + peso + "Kilos");
	System.out.println("Som emitido; " + emitirSom());
	System.out.println("Se movimenta: " + correr());
}
}