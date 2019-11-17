//Gerente eh um Funcionario ou herda da class Funcionario		
public class Gerente extends FuncionarioAutenticavel {
	
	public double getBonificacao() {
		System.out.println("Bonificacao do getente");
		return super.getSalario();
	}
	
}
