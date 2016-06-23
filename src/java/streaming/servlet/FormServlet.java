/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.services.FilmService;
import streaming.services.GenreService;
import streaming.services.PaysService;

/**
 *
 * @author admin
 */
@WebServlet(name = "FormServlet", urlPatterns = {"/form"})
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Genre> lgenre = new GenreService().lister();
        req.setAttribute("lgenre", lgenre);
        
        List<Pays> lpays = new PaysService().lister();
        req.setAttribute("lpays", lpays);
        
        
       //renvoi vers form.jsp
       req.getRequestDispatcher("form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        int annee = Integer.parseInt(req.getParameter("anneeprod"));
        String titre = req.getParameter("titre");
        Long genre =Long.parseLong( req.getParameter("genre"));
                
        //List<Pays> pays = req.getParameter("pays");
        String sin = req.getParameter("synopsis");
        int duree = Integer.parseInt(req.getParameter("duree"));
        
        new FilmService().enregistrerFilm(new Film(titre, sin, annee, duree, em.find(Genre.class, genre)));      
        resp.sendRedirect("film_liste");
    }
    

    
    
}
