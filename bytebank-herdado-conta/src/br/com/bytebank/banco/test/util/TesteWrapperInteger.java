package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; //armazenando numero primitivo.
		
		//Não podemos guardar primitivos em listas para ajudar o java criou o integer
		//Isso é chamado de AUTOBOXING
		
	
		//Integer idadeRef = new Integer(29);
		
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();//Unboxing
		
		System.out.println(idadeRef.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		
		String s = args[0];//Interpreta como string "10"
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);//AutoBoxing
		
		
	}

} 
