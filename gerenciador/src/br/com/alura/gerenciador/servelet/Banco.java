package br.com.alura.gerenciador.servelet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);
		
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
		System.out.println("Cadastrando a " + empresa.getNome() + " como nova empresa");
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
	}
	
}
