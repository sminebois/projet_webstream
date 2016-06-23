<%-- 
    Document   : preferences
    Created on : 22 juin 2016, 16:10:25
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
            <h3>Préferences</h3>
            <form method="post">
                Image de fond 
                <select name="rot">                
                    <option value="0">Hemisphère Nord</option>
                    <option value="180">Hemisphère Sud</option>
                </select>
                <input type="submit" value="Sauvegarder">
            </form>
            
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>
