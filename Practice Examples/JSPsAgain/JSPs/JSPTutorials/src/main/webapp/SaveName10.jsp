<%-- 
    Document   : SaveName10
    Created on : Oct 14, 2015, 9:00:50 AM
    Author     : mgaffney
--%>
<%@page import="com.mycompany.jsptutorials.UserData" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="user" class="com.mycompany.jsptutorials.UserData" scope="session"/>
<jsp:setProperty name="user" property="*"/>

<HTML>
    <BODY>
        <A HREF="NextPage10.jsp">Continue</A>
    </BODY>
</HTML>
