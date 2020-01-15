package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteBuscaConta {
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = em.find(Conta.class, 1);
		
		conta.setTitular("Diogo Faria");
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getBanco());
		System.out.println(conta.getTitular());
		
		em.getTransaction().commit();
		
		
		
	}
}
