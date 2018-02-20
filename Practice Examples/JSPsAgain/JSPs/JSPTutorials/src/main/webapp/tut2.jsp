<%-- 
    Document   : tut2
    Created on : Oct 13, 2015, 2:38:56 PM
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
            <%
                // This is a scriptlet.  Notice that the "date"
                // variable we declare here is available in the
                // embedded expression later on.
                System.out.println("Evaluating date now");
                java.util.Date date = new java.util.Date();
            %>
            Hello!  The time is now <% out.print(String.valueOf(date));%>
            
                <%
                    //out.println(date);
                    out.print("<BR>Your machine's address is ");
                    out.print(request.getRemoteHost());
                %>
            
        </h3>
    </body>
</html>
