package Variaveis;

public class TestaCondicional {
	 public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade               = 16;
		int quantidadeDePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos!");
			System.out.println("Seja bem vindo.");
		}
		else {
			if(quantidadeDePessoas >= 2) {
				System.out.println("Voc� n�o tem 18, por�m esta acompanhado ent�o pode entrar.");
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar!");
				
			}	
		}
	}
}
