/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurDAO {
    public Utilisateur rechercheParLoginEtMdp(Utilisateur u){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        

        return (Utilisateur) em.createQuery("SELECT u FROM Utilisateur u WHERE u.nom='" + u.getNom() + "' AND u.mdp='" + u.getMdp() + "'").getSingleResult();       
    }

    public List<Utilisateur> rechercherParLogin(String nom) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.nom=:login").setParameter("login", nom).getResultList();
    }
    
    public List<Utilisateur> rechercherParMail(String mail) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.email=:umail").setParameter("umail", mail).getResultList();
    }
    
    public void enregistrerUtilisateur(Utilisateur u){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }
    
    public void modifierUtilisateur(Utilisateur u){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(u);
        em.getTransaction().commit();
    }
    
    public void supprimerUtilisateur(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.createQuery("DELETE FROM Utilisateur u WHERE u.id=:uid").setParameter("uid", id).executeUpdate();
    }
    
}
