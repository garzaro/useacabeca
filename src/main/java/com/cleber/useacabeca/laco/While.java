package com.cleber.useacabeca.laco;

public class While {

	public static void main(String[] args) {

		int idade = 15;

		while (idade < 18) {
			
			System.out.println("Voce tem " + idade + " anos, entrada proibida.");
			idade = idade + 1;

		}
	}

}

/*
 * O laço while e o laço for são apenas formas diferentes de uma mesma estrutura
 * básica de repetição.
 * 
 * 
 * As estruturas de repetição também são conhecidas como laços (loops) e são
 * utilizados para executar, repetidamente, uma instrução ou bloco de instrução
 * enquanto determinada condição estiver sendo satisfeita.
 * 
 * Qualquer que seja a estrutura de repetição, ela contém quatro elementos
 * fundamentais: inicialização, condição, corpo e iteração.
 * 
 * A inicialização compõe-se de todo código que determina a condição inicial da
 * repetição. A condição é uma expressão booleana avaliada após cada leitura do
 * corpo e determina se uma nova leitura deve ser feita ou se a estrutura de
 * repetição deve ser encerrada. O corpo compõe-se de todas as instruções que
 * são executadas repetidamente. A iteração é a instrução que deve ser executada
 * depois do corpo e antes de uma nova repetição.
 */
