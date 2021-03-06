package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando colecoes ", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 3467233);
		Aluno a2 = new Aluno("Diogo Faria", 1234234);
		Aluno a3 = new Aluno("Aline Vidal", 41423423);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(alunos -> {
		System.out.println(alunos);
			
		System.out.println("O aluno" + a1 + "est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 3467233);
		System.out.println("Turini est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 � equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		System.out.println(a1.hashCode() == turini.hashCode());
		});
		
	}

}
