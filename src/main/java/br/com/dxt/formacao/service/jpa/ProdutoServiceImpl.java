package br.com.dxt.formacao.service.jpa;

import br.com.dxt.formacao.domain.Produto;
import br.com.dxt.formacao.repository.ProdutoRepository;

public class ProdutoServiceImpl extends ServiceBase<Produto>{
	ProdutoRepository repository = new ProdutoRepository();
	
	public ProdutoServiceImpl() {
		super(Produto.class);
	}

	public Double buscarMedia(){
		return repository.buscarMedia();
		
	}
}
