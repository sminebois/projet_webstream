/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDAO {
    public List<Serie> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.createQuery("SELECT s FROM Serie s").getResultList();
    }
    
    public Serie getSerieById(long id)
    {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Serie.class, id);
    }

    public void enregistrerSerie(Serie serie) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(serie);
        em.getTransaction().commit();
    }
    
     public void supprimerSerie(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Serie WHERE s.id=:idSerie").setParameter("idSerie", id).executeUpdate();
        em.getTransaction().commit();
    }
    
    public void modifierSerie(Serie s){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(s);
        
        em.getTransaction().commit();
    }
}
