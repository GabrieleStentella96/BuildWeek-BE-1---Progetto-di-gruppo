package Dao;

import java.lang.System.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.hibernate.annotations.common.util.impl.LoggerFactory;

import ClassiProgetto.Utente;

public class UtenteDao {
	
	private static final Logger log = LoggerFactory.getLogger(UtenteDao.class);
    public void save(Utente u) {
        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
    }


    public void refresh(Utente object) {
        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        try {

            em.refresh(object);

        } finally {
            em.close();
        }
    }

    public Utente getById(String codiceId) {
        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        try {

            return em.find(Utente.class, codiceId);

        } finally {
            em.close();
        }
    }

    public void delete(Utente object) {
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
