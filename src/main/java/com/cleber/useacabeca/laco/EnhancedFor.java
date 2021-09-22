package com.cleber.useacabeca.laco;


public class EnhancedFor {
	
	public static void main(String[] args) {
		
		System.out.println("Percorre esse array ai doido!!!");
		
		int [] array = {0,1,2,3,4,5,6,7,8,9};
		
		for(int oEnhancedForFoiIntroduzidoApartirDoJava5_EeUtilizadoParaRealizarAsVarredurasEmCollections : array) {
			
			System.out.println(oEnhancedForFoiIntroduzidoApartirDoJava5_EeUtilizadoParaRealizarAsVarredurasEmCollections);
			
		}
		System.out.println("percorrido mané!!!");
	}
}

/*
 * O enhanced-for foi introduzido a partir do Java 5, e é utilizado para
 * realizar as varreduras em collections. Para cada iteração do for, o elemento
 * da iteração é atribuído à variável. Utilizando o enhanced-for, você é
 * obrigado a percorrer um array por exemplo.
 */


