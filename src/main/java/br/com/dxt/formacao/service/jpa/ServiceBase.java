package br.com.dxt.formacao.service.jpa;

import java.util.List;

import br.com.dxt.formacao.repository.RepositoryBase;

public class ServiceBase<T> {
	
	private RepositoryBase<T> repository;
	
	public ServiceBase(Class<T> clazz) {
		repository = new RepositoryBase<T>(clazz);
	}
	
	protected RepositoryBase<T> getRepositoryBase() {
		return repository;
	}

	public T salvar(T entity) {
		return getRepositoryBase().salvar(entity);
		
	}
	public T buscarPorId(Long id){
		return getRepositoryBase().buscaPorId(id);
	}
	
	public List<T> buscarTodos() {
		return getRepositoryBase().buscarTodos();
	}
	
	public void excluir(T entity) {
		getRepositoryBase().excluir(entity);
	}
	

}
