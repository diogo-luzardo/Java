//Gerente eh um Funcionario, gerete herda da class Funcionario
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		return super.getBonificacao() + 100;
	}
}
