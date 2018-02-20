<%-- 
    Document   : userModal
    Created on : Dec 2, 2016, 3:38:38 PM
    Author     : josephrohwer
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Fontaine's Flowers</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-header">
                <a class="navbar-brand" href="${pageContext.request.contextPath}/home">Fontaine's Flowers</a>
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mobileNav">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>                        
                </button>
            </div>
            <div class="collapse navbar-collapse" id="mobileNav">
                <ul class="nav navbar-nav">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/viewSearchPosts">Blog Feed</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/contactUs">Contact Us</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Additional Info <span class="caret"></span></a>
                        <ul class="dropdown-menu" id="dropdownMenu">
                        </ul>
                    </li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')"> 
                        <li role="presentation"><a href="${pageContext.request.contextPath}/adminPage">Admin</a></li>
                    </sec:authorize>                </ul>
                <ul class="nav navbar-nav navbar-right" style="padding-right: 20px">
                    <li>
                        <sec:authorize access="isAnonymous()"> 
                            <a data-toggle="modal" href="#signInModal"><span class="glyphicon glyphicon-log-in"></span> Sign In</a>
                        </sec:authorize>
                        <sec:authorize access="hasAnyRole('ROLE_ADMIN, ROLE_MARKETER')"> 
                            <a href="${pageContext.request.contextPath}/j_spring_security_logout">
                                <span class="glyphicon glyphicon-log-in"></span> Sign Out</a>
                            </sec:authorize>
                            <c:if test="${param.login_error == 1}">
                            <script>window.alert("Wrong username or password!");</script>
                        </c:if>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container" style="margin-top: 60px;">
            <div class="col-md-12" align="center">
                <div class="row">
                    <div class="col-md-8"><h2 align="left">Users</h2></div>
                    <div class="col-md-4">
                        <button type="button" id="update-password-button" class="btn btn-default" data-toggle="modal" data-target="#newPasswordModal">Change Password</button>
                        <button type="button" id="add-user-button" class="btn btn-default" data-toggle="modal" data-target="#addUserModal">Add a User</button>
                    </div>
                </div>
                <table class="table table-hover">
                    <tr>
                        <th>Username</th>
                        <th>Delete</th>
                    </tr>
                    <c:forEach var="user" items="${users}">
                        <tr>
                            <td style="width: 40%"><c:out value="${user.username}"/></td>
                            <td style="width: 15%">
                                <c:if test='${user.username != "admin"}'>
                                    <a href="deleteUser?username=${user.username}"><i class="glyphicon glyphicon-trash"></i></a>
                                    </c:if>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div class='push'></div>
            <%@include file="footerFragment.jsp"%>
        </div>
        <%@include file="signInModal.jsp"%>
        <%@include file="newPasswordModal.jsp"%>
        <%@include file="addUserModal.jsp"%>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/blog.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
    </body>
</html>
