package Familia28;

public class Publico extends Telefone {
	
	public Publico()
	{
		super("Telefone Público");
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
		if (numero.charAt(0) == '9' || numero.charAt(0) == '8') //IDENTIFICANDO SE NA POSIÇÃO 0 O NÚMEOR É 9!
		{
			System.out.println("\n Esse telefone não liga para celular ");
		}
		else
		{
			System.out.println("Discansdo" + numero);
		}
	}
}
