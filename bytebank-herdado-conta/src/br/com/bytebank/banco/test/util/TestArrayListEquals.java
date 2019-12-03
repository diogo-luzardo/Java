package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayListEquals {

	public static void main(String[] args) {
		
		//Generics
		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 33);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 33);
		//lista.add(cc3);
		
		boolean existe = lista.contains(cc2);
		
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("Ja tenho essa conta!");
			}
		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
