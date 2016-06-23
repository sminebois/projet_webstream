<%-- 
    Document   : serie_liste
    Created on : 17 juin 2016, 11:42:36
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
             <h2>Liste des séries</h2>
            <table border='1'>
                <tr>
                    <th>Série</th>
                    <th>Genre</th>
                    <th>Pays</th>
                </tr>
                <c:forEach items="${series}" var="s">
                    <tr>
                        <td><a href='serie_details?id=${s.id}'>${s.titre}</a></td>
                        <td>${s.genre.nom}</td>
                        <td><c:forEach items="${s.pays}" var="p">${p.nom}</c:forEach></td>
                    </tr>
                </c:forEach>
            </table>
            
            
            
            
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>