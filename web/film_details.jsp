<%-- 
    Document   : film_details
    Created on : 17 juin 2016, 15:27:47
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h1>Détails du film ${film.titre}</h1>
            <h2>Description</h2>
            ${film.synopsis}
            <br>
                
            <h2>Détails</h2>
            Genre: ${film.genre.nom}<br>
            Année : ${film.annee}<br>            
            Duréé : ${film.duree} minutes<br>
            Pays : 
            <c:forEach items="${film.pays}" var="pa">
                ${pa.nom}
            </c:forEach>
            
            <h2>Réalisation</h2>
            <c:forEach items="${film.realisateurs}" var="r">
                ${r.prenom} ${r.nom}
                <br>                
            </c:forEach>
            
            <h2>Acteurs</h2>
            <c:forEach items="${film.acteurs}" var="a">
                ${a.prenom} ${a.nom}
                <br>                
            </c:forEach>
                
            
            <h2>Liens :</h2>
            <c:forEach items="${film.liens}" var="l">
                <a href='${l.url}'>${l.url}</a>
                <br>                
            </c:forEach>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>