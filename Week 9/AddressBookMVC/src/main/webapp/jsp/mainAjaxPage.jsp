<%-- 
    Document   : Home
    Created on : Oct 24, 2016, 1:46:18 PM
    Author     : josephrohwer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Address Book</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
              rel="stylesheet">
        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>Address Book</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/mainAjaxPage">Address Book(Ajax)</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/search">Search</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/stats">Stats</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/displayAddressBookNoAjax">
                            Address Book(No Ajax)
                        </a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/displayUserList">User List</a>
                    </li> 
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/j_spring_security_logout">Log Out</a>
                    </li> 
                </ul>
            </div>
            <div class="row">
                <!--
                #2: Add a col to hold the summary table - have it take up half the row
                -->
                <div class="col-md-6">
                    <h2>My Addresses</h2>
                    <%@include file="addressSummaryTableFragment.jsp"%>
                </div> <!-- End col div -->
                <!--
                #4: Add col to hold the new address form - have it take up the other
                half of the row
                -->
                <div class="col-md-6">
                    <h2>Add New Address</h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="add-first-name" class="col-md-4 control-label">
                                First Name:
                            </label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-first-name"
                                       placeholder="First Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-last-name" class="col-md-4 control-label">
                                Last Name:
                            </label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-last-name"
                                       placeholder="Last Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-address" class="col-md-4 control-label">
                                Address:
                            </label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-address"
                                       placeholder="Address"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-city" class="col-md-4 control-label">City</label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-city"
                                       placeholder="City"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-state" class="col-md-4 control-label">State:</label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-state"
                                       placeholder="State"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-zip" class="col-md-4 control-label">Zip:</label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-zip"
                                       placeholder="Zip"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit"
                                        id="add-button"
                                        class="btn btn-default">
                                    Create Address
                                </button>
                            </div>
                        </div>
                    </form>
                    <div id="validationErrors" style="color: red"/>
                </div> <!-- End col div -->
            </div> <!-- End row div -->
        </div>
    </div>
    <%@include file="detailsEditModalFragment.jsp"%>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/addressBook.js"></script>
</body>
</html>
