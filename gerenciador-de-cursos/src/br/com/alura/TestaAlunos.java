package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Diogo Faria");
		alunos.add("Aline Vidal");
		alunos.add("Arthur Vidal");
		alunos.add("Leticia Vidal");
		alunos.add("Ericka Vidal");
		alunos.add("Julio Bonfim");
		alunos.add("Maria Luiza");
		alunos.add("Elon Oliveira");
		
		boolean diogoEALuno = alunos.contains("Diogo Faria");
		alunos.remove("Maria Luiza");
		System.out.println(diogoEALuno);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
	}

}
