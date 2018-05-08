<%-- 
    Document   : index
    Created on : 03-may-2018, 19:52:39
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MENU PRINCIPAL</h1>
        <spring:url value="/spring" var="url_spring"/>
        <a href="${url_spring}">1. Hola Mundo Spring</a>
        <br/>
        <spring:url value="/practica/" var="url_practica_saludo_1"/>
        <a href="${url_practica_saludo_1}">2. Mi Hola Mundo 1</a>
        <br/>
        <spring:url value="/practica/saludo" var="url_practica_saludo_2"/>
        <a href="${url_practica_saludo_2}">3. Mi Hola Mundo 2</a>
        <br/>
        <spring:url value="/practica/saludo/nombre" var="url_practica_saludo_nombre"/>
        <a href="${url_practica_saludo_nombre}">4. Saludo nombre</a>
        <br/>
        <spring:url value="/practica/parametro1?nom=Alex" var="url_practica_param1"/>
        <a href="${url_practica_param1}">5. Paso parametros 1</a>
    </body>
</html>
