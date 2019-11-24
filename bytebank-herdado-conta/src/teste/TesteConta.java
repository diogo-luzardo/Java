package teste;


public class TesteConta {

	public static void main(String[] args) throws modelo.SaldoInsuficienteException {
		//full qualified name FQN
		modelo.ContaCorrente contaCorrente = new modelo.ContaCorrente(111, 111);
		contaCorrente.deposita(100.0);
		
		modelo.ContaPoupanca contaPoupanca = new modelo.ContaPoupanca(222, 222);
		contaPoupanca.deposita(200.0);
		
		contaCorrente.transfere(10.0, contaPoupanca);
		
		System.out.println("Conta Corrente " + contaCorrente.getSaldo());
		System.out.println("Conta Poupança " + contaPoupanca.getSaldo());

	}

}
