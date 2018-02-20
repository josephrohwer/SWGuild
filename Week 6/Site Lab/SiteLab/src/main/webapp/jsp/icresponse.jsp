<%-- 
    Document   : icresponse
    Created on : Oct 27, 2016, 6:49:50 PM
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
            <h1>Interest Calculator</h1>
            <hr/>
        </div>
        <div class="container">
            <h2>Results</h2>
            <a href="interestcalc.jsp">New Calculation</a><br/>
            <hr/>
            <form class="form-horizontal"
                  role="form"
                  method="POST"> 
                <table class ="table">
                    <thead>
                        <tr>
                            <th>Year Number</th>
                            <th>Current Balance</th>
                            <th>Yearly Interest</th>
                            <th>Yearly End Principal</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><c:forEach var="info" items="${InterestCalcDTO.results}">
                                    <p>${info.yearNumber}</p>
                                </c:forEach>
                            </td>
                            <td><c:forEach var="info" items="${InterestCalcDTO.results}">
                                    <p>$${info.currentBalance}</p>
                                </c:forEach>
                            </td>
                            <td><c:forEach var="info" items="${InterestCalcDTO.results}">
                                    <p>$${info.yearlyInterest}</p>
                                </c:forEach>
                            </td>
                            <td><c:forEach var="info" items="${InterestCalcDTO.results}">
                                    <p>$${info.yearlyEndPrincipal}</p>
                                </c:forEach>
                            </td>
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
