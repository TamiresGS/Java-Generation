package Familia28;
public class Quadrado extends BaseFigura implements Figuras { 	//ESTOU HERDANDO DE BASEFIGURA E IMPLEMENTANDO DE FIGURAS
																// ISSO SE CONFIGURA NUMA M�LTIPLA HERAN�A

	public Quadrado(double lado,String nome)
	{
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
	}
	
	@Override
	public double getDiagonal()
	{
		return Math.sqrt(2)*lado1;
	}

}