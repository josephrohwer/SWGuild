<%-- 
    Document   : lsresponse
    Created on : Oct 25, 2016, 10:11:06 PM
    Author     : josephrohwer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Site Lab</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>Lucky Sevens</h1>
            <hr/>
        </div>
        <div class="container">
            <h2>Results</h2>
            <a href="luckyseven.jsp">Play Again</a><br/>
            <hr/>
            <form class="form-horizontal"
                  role="form"
                  method="POST">   
                <table class ="table">
                    <thead>
                        <tr>
                            <th>Starting Value</th>
                            <th>Total Rolls</th>
                            <th>Highest Amount</th>
                            <th>Roll Count at Highest Amount Won</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>$${LuckySevenDTO.startingValue}</td>
                            <td>${LuckySevenDTO.totalRolls}</td>
                            <td>$${LuckySevenDTO.maxValue}</td>
                            <td>${LuckySevenDTO.rollCount}</td>
                        </tr>
                    </tbody>
                </table><br>
                <hr>
            </form>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
