package Familia28;

	import java.util.Scanner;

	public class IntroducaoEX5 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

			float nota1,nota2,nota3,m1,m2,m3,mp;

			Scanner recebe = new Scanner(System.in); 
				
			System.out.println("Digite a primeira nota do aluno : ");
			nota1= recebe.nextFloat();
			
			System.out.println("Digite a segunda nota do aluno : ");
			nota2= recebe.nextFloat();
			
			System.out.println("Digite a terceira nota do aluno : ");
			nota3= recebe.nextFloat();
		
			
			m1= (nota1 * 2)/10;
			m2=(nota2 * 3)/10;
			m3= (nota3 * 5)/10;
			mp= (m1+m2+m3);
			
			System.out.println("Em consideração que a média é ponderada e tem peso respectivamente 2,3,5");
			System.out.println("A SUA MÉDIA DE SUAS NOTAS É: "+ mp );
			
			
			
			
			


	}

}
