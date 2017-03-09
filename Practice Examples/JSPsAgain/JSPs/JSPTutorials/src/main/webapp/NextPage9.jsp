<%-- 
    Document   : NextPage
    Created on : Oct 13, 2015, 3:56:44 PM
    Author     : mgaffney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Hello, <%= session.getAttribute( "theName" ) %>
    </body>
</html>
