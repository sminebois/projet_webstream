/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.services;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Saison;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
    public List<Serie> lister()
    {
        SerieDAO dao = new SerieDAO();
        return dao.listerTous();
    }    
    
    public Serie getSerieById(long id)
    {
        return new SerieDAO().getSerieById(id);
    }

    public void enregistrerSerie(Serie serie) {
        new SerieDAO().enregistrerSerie(serie);
    }
    
    public void modifierSerie(Serie s){
        new SerieDAO().modifierSerie(s);
    }
    
    public void supprimerSerie(long id){
        new SerieDAO().supprimerSerie(id);
    }
}
