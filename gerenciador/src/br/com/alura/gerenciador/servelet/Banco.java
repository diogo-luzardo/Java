package br.com.alura.gerenciador.servelet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);
		
	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		System.out.println("Cadastrando a " + empresa.getNome() + " como nova empresa");
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
}
