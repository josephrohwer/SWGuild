<%-- 
    Document   : interestcalc
    Created on : Oct 25, 2016, 3:20:44 PM
    Author     : josephrohwer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/luckyseven.jsp">Lucky Sevens</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/factorizor.jsp">Factorizor</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/jsp/interestcalc.jsp">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/flooringcalc.jsp">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/tipcalc.jsp">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/converter.jsp">Unit Converter</a></li>
                </ul>    
            </div>
        </div>
        <div class="container">
            <h2>Calculate Interest</h2>
            <hr>
            <form class="form-horizontal" role="form"
                  action="interestCalcStart" method="POST">
                <div class="form-group">
                    <label for ="startingamount"class="col-md-2 control-label">Starting Amount</label>
                    <div class="col-md-8">
                        <input type="number"
                               class="form-control"
                               id="starting-amount"
                               name="amount"
                               placeholder="Amount"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for ="startingrate"class="col-md-2 control-label">Interest Rate</label>
                    <div class="col-md-8">
                        <input type="number"
                               class="form-control"
                               id="starting-rate"
                               name="rate"
                               placeholder="Rate"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for ="startingyears"class="col-md-2 control-label">Number of Years</label>
                    <div class="col-md-8">
                        <input type="number"
                               class="form-control"
                               id="starting-years"
                               name="years"
                               placeholder="Years"/>
                    </div>
                </div>
                <div>
                    <center>
                        <button type="submit" id="calculate-button" class="btn btn-default">Calculate</button>
                    </center>
                </div>
            </form>
            <hr>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
