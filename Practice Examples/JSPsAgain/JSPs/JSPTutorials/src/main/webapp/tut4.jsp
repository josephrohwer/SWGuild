<%-- 
    Document   : tut4
    Created on : Oct 13, 2015, 3:19:56 PM
    Author     : mgaffney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%!
            //<%! is needed for methods, which aren't placed inthe servlet inline
            
            Date getDate() {
                System.out.println("In getDate() method");
                return theDate;
            }
            
            void computeDate() {
                theDate = new Date();
            }
            Date theDate = new Date();
            %>
    </head>
    <body>
        <h3>

            
            <%computeDate();%>
            Hello!  The time is now <%= getDate()%>
        </h3>
    </body>
</html>
