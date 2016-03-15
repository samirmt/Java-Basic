package br.com.dxt.formacao.repository;

import javax.persistence.EntityManager;
import br.com.dxt.formacao.domain.Produto;

public class ProdutoRepository extends RepositoryBase<Produto>{
		
	public ProdutoRepository() {
		super(Produto.class);
	}
	
	
	
	public Double buscarMedia(){
		EntityManager em = getEm();
		
		String sql = "SELECT AVG(p.preco) FROM Produto p";
		
		return em.createQuery(sql, Double.class).getSingleResult();
		
	}
}
