package Familia28;

public class TesteAulaPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INSTANCIANDO UM OBJETO DA AULAPOO
		
		AulaPOO auto1 = new AulaPOO (" Tamires Guimar�es ", " Toro "," TAMI013 ", 2021);
		
		//TROCA DE MENSAGEM (CHAMADA AO M�TODO IMPRIMIR INFO)
		auto1.imprimirInfo();
		System.out.println("********TRANSFER�NCIA DE PROPRIET�RIO*******");
		auto1.setNomeProprietario(" Thiago Pedroso ");
		auto1.imprimirInfo();
		
		AulaPOO auto2 = new AulaPOO(" Barbara Amaral ", " Ferrari 458 "," Bab2003 ", 2020);
		auto2.imprimirInfo();
		auto2.setPlaca(" BA0A567 ");
		auto2.imprimirInfo();
		
		
		
	
	
		
	}

}
