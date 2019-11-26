package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal -- Como string para criar o objeto não precisamos do new
		//String outro = new String("Alura"); //Funciona assim, porem é considerado ma pratica
		
		String outro = nome.replace("A", "a");
		
		String minisculo = nome.toLowerCase();
		
		char c = 'A';
		char d = 'b';
		String character = nome.replace(c, d);
		
		System.out.println(nome);
		System.out.println(outro);
		System.out.println(minisculo);
		System.out.println(character);
		
		char e = nome.charAt(2);
		System.out.println(e);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i ++) {
			System.out.println(nome.charAt(i));
			
		}
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		String tirarEspaco = "               alura                   ";
		String semEspaco = tirarEspaco.trim();
		System.out.println(semEspaco);
	}

}
