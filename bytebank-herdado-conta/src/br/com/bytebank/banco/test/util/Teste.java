package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; //armazenando numero primitivo.
		
		//N�o podemos guardar primitivos em listas para ajudar o java criou o integer
		//Isso � chamado de AUTOBOXING
		Integer idadeRef = new Integer(29);
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);//AutoBoxing
		
		
	}

}
