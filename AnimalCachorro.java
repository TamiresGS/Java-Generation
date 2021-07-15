package Familia28;

public class AnimalCachorro extends AnimalEX1 {

	private String ra�a;
	private String cor;
	private float peso;
	
	
	//CONSTRUTOR
	
	public AnimalCachorro (String nome, int idade,String ra�a, String cor, float peso)
	{
		super (nome,idade);
		this.ra�a = ra�a;
		this.cor = cor;
		this.peso = peso;
	}
	
	// M�TODO 
	
	public String correr()
	{
		return " Correndo r�pido ";
	}
	
	@Override
	public String emitirSom()
	{
		return " Au au au";
	}

	public String getRa�a() {
		return ra�a;
	}


	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
		System.out.println("Nome do Bichinho � : " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("� da ra�a: " + ra�a);
		System.out.println("Pel�s da cor: " + cor);
		System.out.println("Pesa : " + peso + "Kilos");
		System.out.println("Som emitido; " + emitirSom());
		System.out.println("Se movimenta: " + correr());
		}
}
