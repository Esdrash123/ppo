<%-- 
    Document   : Pagina2
    Created on : 10/05/2017, 16:34:33
    Author     : 1860915
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Informação Importante!</h1>
        
        <%-- um comentário com um senha --%>
        <!-- um comentário com um senha html-->
        
        <%!
            int a = 0;
            int b = 1;
            int c = a+b;
            int metodo(){
            c=c*2;
            return c;
            };
            
            int d = metodo();
        %>
        
        <% 
            int f = 2;
            a = f*c+d;
            
            if(false){
        %>
        <h2>a é maior que f</h2>
        <% }
            for(int i =0;i<1000;i++){ %>
        <h2><%= (i+1)%>° va se ferrar</h2>
        <% } %>
    </body>
</html>
