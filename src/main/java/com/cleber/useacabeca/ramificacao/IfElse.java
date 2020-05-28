package com.cleber.useacabeca.ramificacao;

public class IfElse {
	
	public static void main(String[] args) {
		
		int x = 10;
		String nome = "Clebe";
		
		if (x == 10) {
			System.out.println("O valor de x deve ser " + x);			
		} else {
			System.out.println("O valor de x não igual a 10");
		}if (x != 10) {
			System.out.println("Foi declarado o valor " + x);			
			
		}
		System.out.println("-----------------------------");
		
		if (nome == "Cleber") {
			System.out.println("O nome deve ser " + nome);			
		} else {
			System.out.println("O nome não é igual a Cleber");
		}if (nome!= "Cleber") {
			System.out.println("Voce declarou o nome " + nome);			
			
		}
		if ((x == 10) & (nome.equals("Cleber"))) {
			System.out.println(nome + " voce é gente fina!!!");
		}else if(x > 10){
			System.out.println(nome + " estrapolou na contagem");
		}else {
			System.out.println(nome + " seu id não e " + x);
		}
		
		System.out.println("");
		System.out.println("funciono independente de qualquer coisa!!!");
	}

}
