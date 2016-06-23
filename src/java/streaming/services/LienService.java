/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.services;

import java.util.List;
import streaming.dao.LienDAO;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public class LienService {
    public void supprimerLien(long id){
        new LienDAO().supprimerLien(id);
    }
    
    public void enregistrerLien(Lien l){
        new LienDAO().enregistrerLien(l);
    }
    
    public List<Lien> lister(){
        return new LienDAO().lister();
    }
    
    public Lien getLienById(long id){
        return new LienDAO().getLienById(id);
    }
    
    public void modifierLien(Lien l){
        new LienDAO().modifierLien(l);
    }
}
