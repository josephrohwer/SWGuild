<%-- 
    Document   : SaveName
    Created on : Oct 13, 2015, 3:56:32 PM
    Author     : mgaffney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   String name = request.getParameter( "username" );
   session.setAttribute( "theName", name);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <A HREF="NextPage9.jsp">Continue</A>
    </body>
</html>
