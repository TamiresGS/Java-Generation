package Familia28;

public class excepcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = null, novaFrase=null;
		
		try 	
		{
			novaFrase = frase.toUpperCase(); //COLOCANDO TODA FRASE EM MAIUSCULA
		}
		catch (NullPointerException e ) //CAPTURA AS POSSIVEL EXCESSÃO
		{
			System.out.println("A frase inicial está nula, para solucionar, foi atribuido um valor default");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
		
	}

}
