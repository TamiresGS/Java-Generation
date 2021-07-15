package Familia28;

public class Celular extends Telefone {

	public Celular()
	{
		super ("Celular"); 
	}
	
	@Override     
	public void toca(int codigoToque) // METODO POLIMORFO DA CLASSE ABSTRATA
	{
		switch (codigoToque)
		{
		case 1 :
			System.out.println(" Trimm... Trim...");
			break;
			
		case 2:
			System.out.println("Bibibi...Bibibi");
			break;
			default:
				System.out.println("Tandam... Tandam");
		}
	 }
	
	@Override
	 public void disca (String numero)// METODO POLIMORFO DA CLASSE ABSTRATA
		
	 {
		  System.out.println("O número :" + numero + "é um celular");
	 }
		
		
		
}
	
	
