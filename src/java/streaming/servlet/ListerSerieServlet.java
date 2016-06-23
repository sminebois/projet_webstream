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
import streaming.entity.Serie;
import streaming.services.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerSerieServlet", urlPatterns = {"/serie_liste"})
public class ListerSerieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Serie> lserie = new SerieService().lister();
        //int tabSaisons[lserie.size()]; 

        req.setAttribute("series", lserie);
        //req.setAttribute("nbsaison", new SerieService().nbSaisons(s));

        req.getRequestDispatcher("serie_liste.jsp").forward(req, resp);
    }
}
