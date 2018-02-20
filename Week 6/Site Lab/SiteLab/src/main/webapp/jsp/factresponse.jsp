<%-- 
    Document   : factresponse
    Created on : Oct 26, 2016, 10:21:50 PM
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
            <h1>Factorizor</h1>
            <hr/>
        </div>
        <div class="container">
            <h2>Results</h2>
            <a href="factorizor.jsp">Factor Another Number</a><br/>
            <hr/>
            <form class="form-horizontal"
                  role="form"
                  method="POST"> 
                <table class ="table">
                    <thead>
                        <tr>
                            <th>Number to Factor</th>
                            <th>Factors</th>
                            <th>Perfect?</th>
                            <th>Prime?</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>${FactorizorDTO.value}</td>
                            <td><c:forEach var="factor" items="${FactorizorDTO.factors}">
                                    <p>${factor}</p>
                                </c:forEach>
                                <p>${FactorizorDTO.value}</p>
                            </td>
                            <td>${FactorizorDTO.value}${FactorizorDTO.isPerfect}</td>
                            <td>${FactorizorDTO.value}${FactorizorDTO.isPrime}</td>
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
