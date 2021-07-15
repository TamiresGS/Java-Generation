package Familia28;

public class Fixo extends Telefone {

	public Fixo() 
	{
		super("Telefone fixo");
	}
	
	@Override   //SOBRESCRITA DO MÉTODO ABSTRATO DA CLASSE TELEFONE
	public void toca (int numToques)
	{
		for (int i=0; i <numToques; i ++)
		{
			System.out.println("Plinplinplin...");
		}
	}

	@Override //SOBRESCRITA DO MÉTODO ABSTRATO DA CLASSE TELEFONE

	public void disca (String numero)
	{
		System.out.println("\nDiscando....");
	}
	
}

