<%-- 
    Document   : displayChange
    Created on : Oct 31, 2016, 2:31:15 PM
    Author     : josephrohwer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vending Machine</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
              rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>Vending Machine</h1>
            <hr/>
            <h1>Thank you!</h1>
            <h4>Here is your change...</h4>
            <hr/>
            <table class ="table">
                <thead>
                    <tr>
                        <th>Quarters</th>
                        <th>Dimes</th>
                        <th>Nickels</th>
                        <th>Pennies</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>${dto.quarterTotal}</td>
                        <td>${dto.dimeTotal}</td>
                        <td>${dto.nickelTotal}</td>
                        <td>${dto.pennyTotal}</td>
                    </tr>
                </tbody>
            </table>
            <form action="displayVendingMachineNoAjax">
                <center>
                    <button type="submit" id="return-button" class="btn btn-default">Menu</button>
                </center>
            </form>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
