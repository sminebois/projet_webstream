/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Utilisateur;
import streaming.services.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("inscription.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            //si les 2 mots de passes sont identiques, on continue
            if(req.getParameter("mdp").equals(req.getParameter("mdp2")))
            {
                Utilisateur u = new Utilisateur(req.getParameter("id"), req.getParameter("mdp"), req.getParameter("email"));
                new UtilisateurService().inscription(u);                
            }
            else{
                System.err.println("Erreur de confirmation du mot de passe lors de la création de l'utilisateur " + req.getParameter("id"));
            }
            
        }catch(Exception e){
            System.err.println("Erreur lors de la création de l'utilisateur " + req.getParameter("id"));
        }     
        
        resp.sendRedirect("connect");
    }
    
    
    
}
