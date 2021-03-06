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
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Serie;
import streaming.services.FilmService;
import streaming.services.GenreService;
import streaming.services.PaysService;
import streaming.services.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "FormSerieServlet", urlPatterns = {"/form_serie"})
public class FormSerieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Genre> lgenre = new GenreService().lister();
        req.setAttribute("lgenre", lgenre);
        
        List<Pays> lpays = new PaysService().lister();
        req.setAttribute("lpays", lpays);
        
        req.getRequestDispatcher("form_serie.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        String titre = req.getParameter("titre");
        Long genre =Long.parseLong( req.getParameter("genre"));
                
        //List<Pays> pays = req.getParameter("pays");
        String sin = req.getParameter("synopsis");        
        
        new SerieService().enregistrerSerie(new Serie(titre, sin, em.find(Genre.class, genre)));      
        resp.sendRedirect("serie_liste");
    }
    
    

   
}
