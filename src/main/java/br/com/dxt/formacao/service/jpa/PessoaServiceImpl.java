package br.com.dxt.formacao.service.jpa;

import java.util.List;

import br.com.dxt.formacao.domain.Pessoa;
import br.com.dxt.formacao.repository.PessoaRepository;
import br.com.dxt.formacao.service.PessoaService;

public class PessoaServiceImpl extends ServiceBase<Pessoa> {
	
	public PessoaServiceImpl() {
		super(Pessoa.class);
		// TODO Auto-generated constructor stub
	}

	PessoaRepository repository = new PessoaRepository();
	
		
	public List<Pessoa> buscarPorNome(String nome){
		return repository.buscarPorNome(nome);
	}

}
