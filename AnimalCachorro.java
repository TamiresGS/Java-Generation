package Familia28;

public class AnimalCachorro extends AnimalEX1 {

	private String raça;
	private String cor;
	private float peso;
	
	
	//CONSTRUTOR
	
	public AnimalCachorro (String nome, int idade,String raça, String cor, float peso)
	{
		super (nome,idade);
		this.raça = raça;
		this.cor = cor;
		this.peso = peso;
	}
	
	// MÉTODO 
	
	public String correr()
	{
		return " Correndo rápido ";
	}
	
	@Override
	public String emitirSom()
	{
		return " Au au au";
	}

	public String getRaça() {
		return raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void imprimiInfo()
	{
		System.out.println("Nome do Bichinho é : " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("É da raça: " + raça);
		System.out.println("Pelôs da cor: " + cor);
		System.out.println("Pesa : " + peso + "Kilos");
		System.out.println("Som emitido; " + emitirSom());
		System.out.println("Se movimenta: " + correr());
		}
}
