package com.cleber.useacabeca.quebralaco;

public class Break {
	
	public static void main(String[] args) {
		
		for(int quebrar = 0; quebrar < 10; quebrar++) {
			
			if (quebrar == 5) {
				break;				
			}
			
			System.out.println(quebrar);
		}
		
	}

}

/*
 * A instrução continue interrompe uma iteração (no loop), se uma condição
 * especificada ocorrer, e continua com a próxima iteração no loop.
 * 
 * Este exemplo ignora o valor de 5.
 */


/*
 * Quando uma instrução break é encontrada dentro de um loop, o loop é
 * imediatamente encerrado e o controle do programa é retomado na próxima
 * instrução após o loop.
 * 
 * A instrução Java break é usada para interromper o loop ou alternar a
 * instrução. Ele interrompe o fluxo atual do programa na condição especificada.
 * No caso de loop interno, ele quebra apenas o loop interno.
 * 
 * Podemos usar a instrução de quebra Java em todos os tipos de loops, como loop
 * for, while loop e do-while.
 */
