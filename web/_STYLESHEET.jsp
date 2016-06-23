<%-- 
    Document   : _STYLESHEET
    Created on : 17 juin 2016, 10:51:19
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="css/css_hmnord.css" rel="stylesheet" type="text/css"/>
<link href="css/css_hmsud.css" rel="stylesheet" type="text/css"/>
<link href='https://fonts.googleapis.com/css?family=Pirata+One' rel='stylesheet' type='text/css'>

<style>    
body {    
    
    font-family: 'Pirata One', cursive;
    color: #858A87;
    font-size: 1.2em;
    background-repeat:no-repeat;
    background-size: 100%;
    background-attachment: fixed;    
}

<c:choose>
    
    <c:when test="${cookie.rotation.getValue()=='0'}">
        <c:import url="/css/css_hmnord.css"/> 
    </c:when>
    <c:when test="${cookie.rotation.getValue()=='180'}">
        <c:import url="/css/css_hmsud.css"/> 
    </c:when>
    <c:otherwise>
        <c:import url="/css/css_hmnord.css"/>
    </c:otherwise>
</c:choose>

a:link
{
color:#ffff80;
}
a:visited {
    color: #4d4d00;
}

table{
    width:50%;
    border: 1px solid #858A87;
    margin: 5px;
    padding: 2px;
}
th, td{
    text-align: center;
    padding: 5px;
    padding-bottom: 20px;
    padding-top: 20px;
}

.liensmenu{
    margin: 5px;
}

</style>

