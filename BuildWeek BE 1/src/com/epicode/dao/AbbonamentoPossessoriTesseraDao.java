package com.epicode.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.classiprogetto.AbbonamentoPossessoriTessera;
import com.epicode.classiprogetto.Utente;

public class AbbonamentoPossessoriTesseraDao {
	
	private static final Logger logger = LoggerFactory.getLogger(AbbonamentoPossessoriTesseraDao.class);
    public void save(AbbonamentoPossessoriTessera abt) {
        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(abt);
        em.getTransaction().commit();
        em.close();
    }


    public void refresh(AbbonamentoPossessoriTessera object) {
        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        try {

            em.refresh(object);

        } finally {
            em.close();
        }
    }

    public AbbonamentoPossessoriTessera getById(String codiceId) {
        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        try {

            return em.find(AbbonamentoPossessoriTessera.class, codiceId);

        } finally {
            em.close();
        }
    }

    public void delete(AbbonamentoPossessoriTessera object) {
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
