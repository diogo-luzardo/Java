package Variaveis;

public class TesteIR {
	public static void main(String[] args) {
		
		double salario = 5000.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		}
		
		else if(salario >= 2900.01 && salario <= 3751.0) {
			System.out.println("o IR é de 15% e pode deduzir R$ 350");
		}
		
		else if(salario >= 3752.0 && salario <= 4667.0) {
			System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
		}
		
		else if(salario > 4664.0) {
			System.out.println("Seu IR é de 27.5% e pode deduzir na declaraç R$ 1.282,6" );
		}
		
		else {
			System.out.println("você não entra no regime de IR");
		}
	}
}
