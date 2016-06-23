/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.services;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class FilmService {
    public List<Film> lister()
    {
        FilmDAO dao = new FilmDAO();
        return dao.listerTous();
    }
    
    public Film getFilmById(long id)
    {
        return new FilmDAO().getFilmById(id);
    }
    
    public void enregistrerFilm(Film a){
        
        new FilmDAO().enregistrerFilm(a);
    } 
    
    public void supprimerFilm(long id){
        new FilmDAO().supprimerFilm(id);
    }
    
    public void modifierFilm(Film f){
        new FilmDAO().modifierSerie(f);
    }


}
