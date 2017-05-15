<%-- 
    Document   : paginaerro
    Created on : 10/05/2017, 16:23:26
    Author     : 1860915
--%>

<%@page isErrorPage="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ocorreu um erro idiota</h1>
        <h2><%= exception.getMessage() %></h2>
    </body>
</html>
