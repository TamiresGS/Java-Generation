package Familia28;

	import java.util.Scanner;
 
		public class CondicaoEX3 {

				public static void main(String[] args) {
					
					int idade;
  
					Scanner recebe = new Scanner(System.in); 
					 
					System.out.println("Vamos saber a qual categoria voc� percente!");

					System.out.println("Digite a sua idade : ");
					idade=recebe.nextInt();
					
					if (idade<10)
					{
						System.out.println("Voc� ainda n�o poder� participar");
					}
					else if (idade>= 10 && idade<=14 )
					{
						System.out.println("Voc� pertence a categoria INFANTIL!");
					}
					else if (idade>14 && idade<=17)
					{
						System.out.println("Voc� pertence a categoria JUVENIL");
					}
					else if (idade>17 && idade<=25)
					{
						System.out.println("Voc� pertence a categoria ADULTO");
					}
					else 
					{
						System.out.println("Voc� n�o se encaixa mais nas nossas categorias");
					}

					
	}

}
