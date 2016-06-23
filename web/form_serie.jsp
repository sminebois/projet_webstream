<%-- 
    Document   : form_serie
    Created on : 20 juin 2016, 16:04:28
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
            <h1>Enregistrement de nouvelle série</h1>
            <form method="post">
                Titre :
                <input type="text" name="titre"><br>

                Synopsis :
                <textarea name="synopsis" maxlength="500" rows="5" cols="100"></textarea>
                
                
                <p>Genre :  <select name="genre">
                        <c:forEach items="${lgenre}" var="g">
                            <option value="${g.id}">${g.nom}</option>
                        </c:forEach>
                    </select> </p>
                <p>Pays :  <select name="pays">
                        <c:forEach items="${lpays}" var="p">
                            <option>${p.nom}</option>
                        </c:forEach>
                    </select> </p>
                <input type="submit" value="Envoyer">

            </form>


        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>
