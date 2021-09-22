package com.cleber.useacabeca.laco;

public class While {

	static int idade = 15;
	static String nome = "Cleber";
	static int jovem = idade;
	static boolean sorveteIsOn = true;
	static int loop = 1;

	public static void main(String[] args) {

		while (idade < 18) {

			System.out.println(nome + " Voce tem " + idade + " anos, entrada proibida.");
			// idade = idade + 1;
			idade++;

		}
		System.out.println("-----------------------------------");

		if (jovem < 18) {
			System.out.println("Ouwh criança vai tomar sorvete!!!");

		} else {
			System.out.println("Nadegas a declarar!!!");
		}

		while (sorveteIsOn)
			sorveteIsOn = false; // hãnnnnn????
		System.out.println("Come sorvete");
		
		System.out.println("------------------------------------");
		
		System.out.println("Antes do loop");
		
		while(loop < 50000) {
			System.out.println("Dentro de loop");
			
			System.out.println("O valor de loop é " + loop);
			
			loop++;
		}
		
		System.out.println("Aqui termina o loop");

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
