package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteConta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		//full qualified name FQN
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.deposita(200.0);
		
		contaCorrente.transfere(10.0, contaPoupanca);
		
		System.out.println("Conta Corrente " + contaCorrente.getSaldo());
		System.out.println("Conta Poupança " + contaPoupanca.getSaldo());

	}

}
