package br.com.dxt.formacao.service;


import java.util.List;

import br.com.dxt.formacao.domain.Produto;

public interface ProdutoService {
	
	public Produto salvarProduto(Produto p);
	
	public List<Produto> buscarTodosProdutos();
	
}
