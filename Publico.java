package Familia28;

public class Publico extends Telefone {
	
	public Publico()
	{
		super("Telefone P�blico");
	}

	@Override
	public void  toca(int numToques)
	{
		for (int i=0; i <numToques; i ++)
		{
			System.out.println("Toque... Toque... Toque...");
		}
	}
	
	@Override
	public void disca (String numero)
	{
		if (numero.charAt(0) == '9' || numero.charAt(0) == '8') //IDENTIFICANDO SE NA POSI��O 0 O N�MEOR � 9!
		{
			System.out.println("\n Esse telefone n�o liga para celular ");
		}
		else
		{
			System.out.println("Discansdo" + numero);
		}
	}
}
