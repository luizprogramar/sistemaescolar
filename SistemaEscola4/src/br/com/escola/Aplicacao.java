package br.com.escola;

import br.com.escola.dao.AlunoDAO;
import br.com.escola.dao.ProfessorDao;
import br.com.escola.model.Aluno;
import br.com.escola.model.Professor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Aplicacao {
	
	//private static  EntityManagerFactory emf = Persistence.createEntityManagerFactory("programador");
	//private static  EntityManager em = emf.createEntityManager();
	 
	public static void main(String[] args) {
		
		// EntityManagerFactory emf = Persistence.createEntityManagerFactory("programador");
		//  EntityManager em = emf.createEntityManager();
	 /* Aluno aluno = new Aluno();
	  em.find(Aluno.class, 3);
	  System.out.println("nome do aluno: " + aluno.getNome());*/
		
		Aluno aluno = new Aluno();
		aluno.setCodigo(0);
		aluno.setNome("lui henrique");
		aluno.setNomeCurso("java");
		
		Aluno aluno1 = new Aluno();
		aluno1.setCodigo(0);
		aluno1.setNome("jose alisson");
		aluno1.setNomeCurso("geografia");
		
		Aluno aluno2 = new Aluno();
		aluno2.setCodigo(0);
		aluno2.setNome("ariel henrique");
		aluno2.setNomeCurso("português");
		
		
		AlunoDAO alun = new AlunoDAO();
		alun.salvar(aluno);
		alun.salvar(aluno1);
		alun.salvar(aluno2);
		
		Professor pro = new Professor();
		pro.setCodigo(0);
		pro.setNome("olavio bilac");
		pro.setMateria("fisica");
		
		ProfessorDao prof = new ProfessorDao();
		prof.salvar(pro);
		
	 
	
	  
	  
              //  System.out.println("conectado");
	}

}
