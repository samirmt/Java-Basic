package br.com.dxt.formacao.app;

import org.hsqldb.util.DatabaseManagerSwing;

import br.com.dxt.formacao.domain.Pessoa;
import br.com.dxt.formacao.domain.PessoaFisica;
import br.com.dxt.formacao.domain.PessoaJuridica;
import br.com.dxt.formacao.service.jpa.PessoaServiceImpl;
import br.com.dxt.formacao.service.jpa.ServiceBase;
import br.com.dxt.formacao.utils.EntityManagerFactoryWrapper;

public class CadastroPessoa {
	public static void main(String[] args) {
		PessoaServiceImpl service = new PessoaServiceImpl();
		PessoaFisica pf = new PessoaFisica();
		
		pf.nome = "Walter";
		pf.cidade = "Campinas";
		pf.cpf = "36516438161";

		PessoaJuridica pj = new PessoaJuridica();
		pj.nome = "Dextra";
		pj.cidade = "Campinas";
		pj.cnpj = "83699753565";

		EntityManagerFactoryWrapper.openTransaction();
		service.salvar(pf);
		service.salvar(pj);
		EntityManagerFactoryWrapper.commitTransaction();
		/*
		for (Pessoa pessoa : service.buscarTodos()) {
			if (pessoa instanceof PessoaJuridica)
				System.out.println((PessoaJuridica) pessoa);
			else
				System.out.println((PessoaFisica) pessoa);
		}
		*/
		System.out.println(service.buscarPorNome("Dextra"));
		
		DatabaseManagerSwing.main(new String[] {"--url", "jdbc:hsqldb:file:/tmp/meusistema"});
		
		EntityManagerFactoryWrapper.close();
	}

}
