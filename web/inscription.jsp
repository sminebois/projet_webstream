<%-- 
    Document   : inscription
    Created on : 22 juin 2016, 11:11:41
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RARE PIRATES DANKEST STREAMZ ARRRRR</title>
        <c:import url="_STYLESHEET.jsp"/>               
    </head>
    <body>
        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        <div class="contenu">     
            <h1>Inscription</h1>
            <form method="post">
                Identifiant : <input type ="text" name="id"><br>
                Mot de passe : <input type="password" name="mdp"><br>
                Confirmer mot de passe : <input type="password" name="mdp2"><br>
                Email : <input type="text" name="email"><br>
                <input type="submit" value="Inscription">
            </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>
