//Gerente eh um Funcionario ou herda da class Funcionario		
public class Gerente extends Funcionario{
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Bonificacao do getente");
		return super.getBonificacao() + super.getSalario();
	}
	
}
