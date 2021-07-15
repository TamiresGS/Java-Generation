package Familia28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ESTOU CRIANDO COLLECTION DO TIPO LIST
		List<Integer> minhaLista = new ArrayList<Integer>(); // CRIANDO OBJETO
		
		minhaLista.add(2); //ADD SERVE PARA ADICIONAR  VALOR NAS POSIÇOES (POSIÇÃO 0)
		minhaLista.add(1); // POSIÇÃO 1
		minhaLista.add(2); // POSIÇÃO 2
		minhaLista.add(3); // POSIÇÃO 3
		minhaLista.add(1); // POSIÇÃO 4
	
		for (Integer lista: minhaLista) //FOR EACH //PERCORRENDO O ARRAY LIST
		{
			System.out.println(lista);	// IMPRIMINTO TODA A LISTA COM VALOR ADD
		}
		
		System.out.println("\nRemovendo um elelmento da lista:");
		
		minhaLista.remove(0); //REMOVE REMOVE O ELEMENTO DA LISTA POR POSIÇÃO
		
		for (Integer lista: minhaLista) //FOR EACH //PERCORRENDO O ARRAY LIST
		{
			System.out.println(lista);	// IMPRIMINTO LISTA JÁ SEM O ELEMENTO QUE FOI REMOVIDO NO REMOVE
		}
		
		int primeiroElemento= minhaLista.get(0); //GET PEGANDO O VALOR DENTRO DA POSIÇÃO 0 E PASSANDO PARA VARIAVEL primeiroElemento
		System.out.println("O primeiro elemento é : " + primeiroElemento);
		System.out.println(); //LIMPANDO CACHE DE MEMORIA DO SYSO
		
		for (int i=0; i<minhaLista.size(); i++) //SIZE MOSTRA O TAMANHO DO MEU ARRAYLIST
		{
			System.out.println("\nElemento: " + minhaLista.get(i));
		}
		
		Collections.sort(minhaLista); //METODO SORT VAI ORDENAR  EM ORDEM CRESCENTE A MINHA ARRAYLIST
		System.out.println("Depois de ordenado....."); 
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet <Integer>(); //CRIANDO O SET APARTIR DO MÉTODO HASHSET
		
		meuSet.add(2); //ADD ELEMENTOS PARA MEU HASHSET
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(4);
		meuSet.add(3);

		Iterator<Integer> iMeuSet = meuSet.iterator(); //CRIANDO UMA NOVA INTERFACE CHAMADA ITERATOR
		
		while(iMeuSet.hasNext())  // hasNext() PERCORRE TODO MEU COLLECTION DA POSIÇÃO 0 ATÉ A ÚLTIMA
		{
			System.out.println(iMeuSet.next()); // IMPRIMINDO CADA POSIÇÃO INDICANDO A PRÓXIMA POSIÇÃO ATRÁVES DO NEXT, ATÉ FINALIZAR TODAS AS POSIÇÕES	
		}
		
		
		
	}

}
