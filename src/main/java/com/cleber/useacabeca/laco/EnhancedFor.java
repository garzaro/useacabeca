package com.cleber.useacabeca.laco;

public class EnhancedFor {
	
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5};
		
		for (int i : array)  {
			
			System.out.println(i);
		}
	}

}

/*
 * O enhanced-for foi introduzido a partir do Java 5, e é utilizado para
 * realizar as varreduras em collections. Para cada iteração do for, o elemento
 * da iteração é atribuído à variável. Utilizando o enhanced-for, você é
 * obrigado a percorrer um array por exemplo.
 */


