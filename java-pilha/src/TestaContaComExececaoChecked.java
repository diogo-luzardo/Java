
public class TestaContaComExececaoChecked {

	public static void main(String[] args) {

		Conta conta = new Conta();
		try {
			conta.deposita();
		} catch (MinhaExececao ex) {
			System.out.println("tratamento ....");
		}
	}

}
