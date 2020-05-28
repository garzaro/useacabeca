package com.cleber.useacabeca.quebralaco;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			if (i == 3) {
				continue;
			}

			System.out.println(i);
		}

	}

}

/*
 * A instrução continue interrompe uma iteração (no loop), se uma condição
 * especificada ocorrer, e continua com a próxima iteração no loop.
 * Nesse caso irá pular o numero que estiver em if e continuar contando.
 */

