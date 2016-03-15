package br.com.dxt.formacao.app;

import br.com.dxt.formacao.domain.Produto;
import br.com.dxt.formacao.service.jpa.ProdutoServiceImpl;
import br.com.dxt.formacao.utils.EntityManagerFactoryWrapper;

public class CadastroProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		
		p1.codigo = "00001";
		p1.nome = "Coca-Cola";
		p1.descricao = "Garrafa Pet 2L";
		p1.preco = 4.50;
		
		p2.codigo = "00002";
		p2.nome = "Coca-Cola";
		p2.descricao = "Garrafa 600ml";
		p2.preco = 2.50;
		
		
		EntityManagerFactoryWrapper.openTransaction();
		ProdutoServiceImpl service = new ProdutoServiceImpl();
		p1 = service.salvar(p1);
		p2 = service.salvar(p2);
		EntityManagerFactoryWrapper.commitTransaction();
		
		/*		
		Produto porId = service.buscarProdutoPorId(p2.id);
		porId.descricao = "Garrafa 2L";
		System.out.println("Update");
		EntityManagerFactoryWrapper.openTransaction();
		service.salvarProduto(porId);
		EntityManagerFactoryWrapper.commitTransaction();
		*/
		
		System.out.println(service.buscarPorId(1l));
		System.out.println("MÉDIA DOS PREÇOS: " + service.buscarMedia());
		
		EntityManagerFactoryWrapper.close();

	}

}
