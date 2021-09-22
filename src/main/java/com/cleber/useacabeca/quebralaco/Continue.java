package com.cleber.useacabeca.quebralaco;

public class Continue {

	public static void main(String[] args) {

		for (int continuar = 0; continuar < 5; continuar++) {

			if (continuar == 5) {
				continue;
			}

			System.out.println(continuar);
		}

	}

}

/*
 * A instrução continue interrompe uma iteração (no loop), se uma condição
 * especificada ocorrer, e continua com a próxima iteração no loop.
 * Nesse caso irá pular o numero que estiver em if e continuar contando...
 */

