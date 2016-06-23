/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.services;

import streaming.dao.UtilisateurDAO;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {
    public Utilisateur rechercheParLoginEtMdp(Utilisateur u){
        return new UtilisateurDAO().rechercheParLoginEtMdp(u);        
    }
    
    public void inscription(Utilisateur u){
        // exception si login existe
        UtilisateurDAO dao = new UtilisateurDAO();
        if(dao.rechercherParLogin(u.getNom()).size() > 0){
            throw new RuntimeException("Login deja existant");
        }        
        if(dao.rechercherParMail(u.getEmail()).size() > 0){
            throw new RuntimeException("Email deja existant");
        }
        
        u.setValide(Utilisateur.Valide.NON_VALIDE);
        dao.enregistrerUtilisateur(u);
        
        new MailService().envoiMail(u.getEmail(), "Validation du compte", "Cliquez ici pour valider votre compte " + u.getNom());
    }
    
    public boolean connexion(Utilisateur u){
        boolean res;        
        if(u.getValide() == Utilisateur.Valide.VALIDE){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
}
