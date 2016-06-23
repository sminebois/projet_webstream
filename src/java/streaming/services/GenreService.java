/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.services;

import java.util.List;
import streaming.dao.GenreDAO;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreService {
    public List<Genre> lister(){
        return new GenreDAO().listerGenre();
    }
    
    public Genre getGenreByID(long id){
        return new GenreDAO().getGenreById(id);
    }
    
    public void enregistrerGenre(Genre g){
        new GenreDAO().enregistrerGenre(g);
    }
    
    public void supprimerGenre(long id){
        new GenreDAO().supprimerGenre(id);
    }
    
    public void modifierGenre(Genre g){
        new GenreDAO().modifierSerie(g);
    }
}
