package Variaveis;

public class TesteIR {
	public static void main(String[] args) {
		
		double salario = 5000.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
		}
		
		else if(salario >= 2900.01 && salario <= 3751.0) {
			System.out.println("o IR � de 15% e pode deduzir R$ 350");
		}
		
		else if(salario >= 3752.0 && salario <= 4667.0) {
			System.out.println("o IR � de 22.5% e pode deduzir R$ 636");
		}
		
		else if(salario > 4664.0) {
			System.out.println("Seu IR � de 27.5% e pode deduzir na declara� R$ 1.282,6" );
		}
		
		else {
			System.out.println("voc� n�o entra no regime de IR");
		}
	}
}
