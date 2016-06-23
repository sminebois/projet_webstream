/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.services.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerFilmServlet", urlPatterns = {"/film_liste"})
public class ListerFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Film> lfilm = new FilmService().lister();
        
        req.setAttribute("films", lfilm);
        
        req.getRequestDispatcher("film_liste.jsp").forward(req, resp);
    }

    
    
    
}
