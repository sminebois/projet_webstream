/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Utilisateur;
import streaming.services.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ConnectServlet", urlPatterns = {"/connect"})
public class ConnectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("connect.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Utilisateur u = new Utilisateur(req.getParameter("id"), req.getParameter("mdp"));
        u = new UtilisateurService().rechercheParLoginEtMdp(u);
        
        if(new UtilisateurService().connexion(u))
        {
            
            req.getSession().setAttribute("utilconnecte", u);
            
            resp.sendRedirect("film_liste");
        }else{
            resp.sendRedirect("connect");
        }
        
    }
    
    
    
}
