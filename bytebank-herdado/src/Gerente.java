//Gerente eh um Funcionario ou herda da class Funcionario		
public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Bonificacao do getente");
		return super.getSalario();
	}
	
}
