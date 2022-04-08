package br.com.escola.dao;

import br.com.escola.model.Professor;
import br.com.escola.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class ProfessorDao {

	EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
	
	public void salvar(Professor professor) {
		
		EntityManager em = emf.createEntityManager();
		 EntityTransaction tran = em.getTransaction();
		 
		 tran.begin();
		 em.persist(professor);
		 tran.commit();
		 em.close();
	}
}
