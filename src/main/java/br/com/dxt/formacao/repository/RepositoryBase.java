package br.com.dxt.formacao.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.dxt.formacao.utils.EntityManagerFactoryWrapper;

public class RepositoryBase<T> {

	private Class<T> clazz;

	public RepositoryBase(Class<T> clazz) {
		this.clazz = clazz;
	}

	protected EntityManager getEm() {
		return EntityManagerFactoryWrapper.getEntityManager();
	}

	public T salvar(T entity) {
		getEm().persist(entity);
		return entity;
	}
	
	public T merge(T entity) {
		return getEm().merge(entity);
	}

	public void excluir(T entity) {
		getEm().remove(entity);
	}

	public T buscaPorId(Long id) {
		return getEm().find(clazz, id);
	}

	public List<T> buscarTodos() {
		String sql = "FROM " + clazz.getSimpleName() + " t";

		TypedQuery<T> qry = getEm().createQuery(sql, clazz);

		return qry.getResultList();
	}

}
