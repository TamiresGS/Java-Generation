package Familia28;

public class PooEmpregadoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PooEmpregado [] lista = new PooEmpregado [4];
		
		lista[0] = new PooEmpregado ("Rafael", 5000);
		lista[1] = new PooEmpregado ("Jooh", 7000);
		lista[2] = new PooEmpregado ("Jakers", 6000);
		lista[3] = new PooEmpregado ("Samuel", 20000);
		
		for (PooEmpregado roda:lista) //FOR EACH
		{
			roda.imprimir();
		}
		 
		System.out.println(" ********************************");
		for (PooEmpregado roda:lista) 
		{
			roda.aumentarSalario(10);
			roda.imprimir();
			
		}
	}

}
