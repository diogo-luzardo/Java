package br.com.bytebank.banco.modelo;

//verdadeiro nome apartir do pacote modelo.CalculadorDeImposto => FQN
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}	
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
