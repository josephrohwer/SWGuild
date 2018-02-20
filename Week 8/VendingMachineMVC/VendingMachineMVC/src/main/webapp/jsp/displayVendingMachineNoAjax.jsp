<%-- 
    Document   : displayVendingMachineNoAjax
    Created on : Oct 30, 2016, 1:33:42 AM
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
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/displayVendingMachineNoAjax">Vending Machine (No Ajax)</a>
                    </li>
                </ul>
            </div>
            <h1>Items</h1>
            <hr/>

            <table class ="table">
                <thead>
                    <tr>
                        <th>Product</th>
                        <th>Cost</th>
                        <th>Quantity</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><c:forEach var="vending" items="${vendingMachine}">
                                <p>${vending.name}</p>
                            </c:forEach>
                        </td>
                        <td><c:forEach var="vending" items="${vendingMachine}">
                                <p>$${vending.cost}</p>
                            </c:forEach>
                        </td>
                        <td><c:forEach var="vending" items="${vendingMachine}">
                                <p>${vending.inventory}</p>
                            </c:forEach>
                        </td>
                    </tr>
                </tbody>
            </table>
            <hr>

            <form class="form-horizontal" role="form"
                  action="getInput" method="POST">
                <div class="form-group">
                    <label for ="amount" class="col-md-2 control-label">Put in Money</label>
                    <div class="col-md-8">
                        <input type="text"
                               class="form-control"
                               id="starting-amount"
                               name="amount"
                               placeholder="Amount"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for ="choice" class="col-md-2 control-label">Make Selection</label>
                    <div class="col-md-8">
                        <select class ="form-control" name ="choice" id ="choice">
                            <option value="1">Rockstar</option>
                            <option value="2">Chips Ahoy</option>
                            <option value="3">Red Bull</option>
                            <option value="4">Munchies Snack Mix</option>
                            <intput name ="choice"/>
                        </select>
                    </div>
                </div>
                <div>
                    <center>
                        <button type="submit" id="calculate-button" class="btn btn-default">Vend</button>
                    </center>
                </div>
            </form>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
