package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal -- Como string para criar o objeto não precisamos do new
		//String outro = new String("Alura"); //Funciona assim, porem é considerado ma pratica
		
		String outro = nome.replace("A", "a");
		
		String minisculo = nome.toLowerCase();
		
		System.out.println(nome);
		System.out.println(outro);
		System.out.println(minisculo);
	}

}
