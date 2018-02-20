<%-- 
    Document   : tut5
    Created on : Oct 13, 2015, 3:36:25 PM
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
        <h3>
            <p>wekjhfgkhwevfghka<p>
            
            <%
              
                System.out.println("Forwarding to tut1.jsp");
                Thread.sleep(2000);
            %>
            <jsp:forward page = "tut1.jsp"/>
            <br>Returning from tut1:
        </h3>
    </body>
</html>
