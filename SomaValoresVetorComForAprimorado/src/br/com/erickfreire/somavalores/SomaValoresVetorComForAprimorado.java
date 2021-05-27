package br.com.erickfreire.somavalores;

/**
 * Programa em Java que soma os valores dentro de um vetor com for aprimorado
 * @author Erick Freire
 * @version 1 - Criado em 27-05-2021 as 14:25
 */

public class SomaValoresVetorComForAprimorado {

	public static void main(String[] args) {
		
		int[] vetor = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		for(int numero : vetor)
			total += numero;
		
		System.out.printf("A soma total dos valores do vetor é de: %d%n", total);

	}

}
