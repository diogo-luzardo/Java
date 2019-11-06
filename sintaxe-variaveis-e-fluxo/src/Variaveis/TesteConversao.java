package Variaveis;

public class TesteConversao {

	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor      = (int)salario;
		//Vamos usar o casting para encaixar o int no double
		
		System.out.println(valor);
		
		//double valor = 3;
		//Inteiro para double tudo bem.
		
		long numeroGrande = 3412343213425l;
		//usar o l no final para avisar o compilador que estamos trabalhando com o long
		
		short valorPequeno = 213;
		
		byte muitoPequeno = 127;
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}

}
