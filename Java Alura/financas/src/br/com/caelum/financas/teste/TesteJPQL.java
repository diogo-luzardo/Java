package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.util.JPAUtil;

public class TesteJPQL {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		String query = "select m from Movimentacao m where m.conta.id = 1";
		
		em.getTransaction().commit();
		em.close();
	}

}
