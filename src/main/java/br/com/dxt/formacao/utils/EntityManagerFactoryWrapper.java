package br.com.dxt.formacao.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryWrapper {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	static {
		emf = Persistence.createEntityManagerFactory("hsql");
	}

	public static EntityManager getEntityManager() {
		if (em == null) {
			em = emf.createEntityManager();
		}
		return em;
	}
	
	public static EntityManager createEntityManager(){
		return emf.createEntityManager();
	}

	public static void openTransaction(){
		getEntityManager().getTransaction().begin();
	}
	
	public static void commitTransaction(){
		getEntityManager().getTransaction().commit();
	}
	
	
	public static void close() {
		emf.close();
	}

}
