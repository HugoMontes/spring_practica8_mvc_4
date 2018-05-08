<%-- 
    Document   : index
    Created on : 04-may-2018, 20:55:18
    Author     : alumno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTA DE ESTUDIANTE</h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>NOMBRE</th>
                <th>EDAD</th>
            </tr>
            <c:forEach var="est" items="${estudiantes}">
                <tr>
                    <td>${est.id}</td>
                    <td>${est.nombre}</td>
                    <td>${est.edad}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
