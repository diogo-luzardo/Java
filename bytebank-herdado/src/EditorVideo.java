//Gerente eh um Funcionario, gerete herda da class Funcionario
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Bonificacao do editor de video");
		return 150;
	}
}
