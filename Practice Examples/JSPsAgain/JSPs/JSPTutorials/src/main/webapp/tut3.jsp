<%-- 
    Document   : tut3
    Created on : Oct 13, 2015, 3:02:41 PM
    Author     : mgaffney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP2 Page</title>
    </head>
    <body>
        <% int n = 10; %>
        <h3>
            <TABLE BORDER=2>
                <%
                    for (int i = 0; i < n; i++) {
                %>
                <TR>
                    <TD>Number</TD>
                    <TD><%= i + 1%></TD>
                </TR>
                <%
                    }
                %>
            </TABLE>
            <%@include file = "tut1.jsp"%>
        </h3>
        Hi there!
    </body>
</html>
