
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conmta.numero = 1337;
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222-22");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		System.out.println(paulo);
	}

}
