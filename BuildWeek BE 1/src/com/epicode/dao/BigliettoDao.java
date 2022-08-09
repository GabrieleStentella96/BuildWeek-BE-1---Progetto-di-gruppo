package com.epicode.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.classiprogetto.Biglietto;



public class BigliettoDao {
		
		private static final Logger logger = LoggerFactory.getLogger(BigliettoDao.class);
	    public void save(BigliettoDao bd) {
	        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
	        em.getTransaction().begin();
	        em.persist(bd);
	        em.getTransaction().commit();
	        em.close();
	    }


	    public void refresh(BigliettoDao object) {
	        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
	        try {

	            em.refresh(object);

	        } finally {
	            em.close();
	        }
	    }

	    public Biglietto getById(String codiceId) {
	        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
	        try {

	            return em.find(Biglietto.class, codiceId);

	        } finally {
	            em.close();
	        }
	    }

	    public void delete(BigliettoDao object) {
	        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
	        try {

	            EntityTransaction transaction = em.getTransaction();
	            transaction.begin();

	            em.remove(object);

	            transaction.commit();
	        } catch (Exception ex) {
	            em.getTransaction().rollback();
	            logger.error("Error deleting object: " + object.getClass().getSimpleName(), ex);
	            throw ex;

	        } finally {
	            em.close();
	        }

	    }

}
