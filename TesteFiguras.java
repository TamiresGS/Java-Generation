package Familia28;

public class TesteFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Quadrado fig1 = new Quadrado(10,"Quadrado1");
		Retangulo fig2 = new Retangulo(3,4,"Retângulo1");
		
		System.out.println(fig1.getNome()+" : "+fig1.getDiagonal()); //DANDO SET TANTO DA SUPER CLASSSE QUANTO DA INTERFACE
		System.out.println(fig2.getNome()+" : "+fig2.getDiagonal());//DANDO SET TANTO DA SUPER CLASSSE QUANTO DA INTERFACE

		
	}

}

