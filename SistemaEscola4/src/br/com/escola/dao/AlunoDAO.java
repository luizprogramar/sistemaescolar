package br.com.escola.dao;

import br.com.escola.model.Aluno;
import br.com.escola.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class AlunoDAO {

	EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
	
	public void salvar(Aluno aluno) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tran = em.getTransaction();
		
		tran.begin();
		em.persist(aluno);
		tran.commit();
		em.close();
		
		
	}
}
