package Familia28;

import java.text.NumberFormat;

public class PooEmpregado {
	
	private String nome;  
	private double salario;
	
	public PooEmpregado(String n, double s) //CONSTRUTOR
	{
		this.setNome(n); //INICIALIZA��O ATRIBUTO NOME
		this.setSalario(s); // INICIALIZA��O ATRIBUTO S�LARIO
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
  
	
	
	public void aumentarSalario(double percentual) //AJUSTE DE S�LARIO
	{
	salario *= 1 + percentual/100; // SALARIO = SALARIO * (1 + percentual/100)
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //PEGA MOEDA LOCAL DO IDIOMA
		nf.setMaximumFractionDigits(2); //FORMATANDO CASAS DEC�MAS (DEPOIS DA VIRGULA)
		 
		String formatoMoeda = nf.format(salario); //FORMATA A SA�DA 
		return formatoMoeda; //RETORNA O SAL�RIO J� FORMATADO
	}
	
	public void imprimir()
	{
		System.out.println(nome + "\t\t" + this.formatarMoeda());
		
	}
	
	
}