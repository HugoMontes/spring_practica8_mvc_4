<%-- 
    Document   : nuevo
    Created on : 04-may-2018, 19:52:47
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DATOS DE PERSONA</h1>
        <spring:url value="/persona/mostrar" var="url_mostrar"/>
        <form:form action="${url_mostrar}" method="POST">
            <form:label path="ci">Cedula de Identidad:</form:label>
            <form:input path="ci"/>
            <br/>
            <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre"/>
            <br/>
            <form:label path="edad">Edad:</form:label>
            <form:input path="edad"/>
            <br/>
            <form:button>Enviar</form:button>
        </form:form>
    </body>
</html>
