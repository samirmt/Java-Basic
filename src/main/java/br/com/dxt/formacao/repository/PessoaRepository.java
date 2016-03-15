package br.com.dxt.formacao.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.dxt.formacao.domain.Pessoa;
import br.com.dxt.formacao.domain.Produto;
import br.com.dxt.formacao.utils.EntityManagerFactoryWrapper;

public class PessoaRepository extends RepositoryBase<Pessoa> {
	
	public PessoaRepository() {
		super(Pessoa.class);
		// TODO Auto-generated constructor stub
	}


	EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
	
	public List<Pessoa> buscarPorNome(String nome){
		EntityManager em = getEm();
		
		String sql = "FROM " + Pessoa.class.getSimpleName() + " p WHERE p.nome LIKE :pNome";
		
		TypedQuery<Pessoa> qry = 
				em.createQuery(sql, Pessoa.class);
		
		qry.setParameter("pNome", nome);
		
		return qry.getResultList();
	}
	
	
	
	
	
}
