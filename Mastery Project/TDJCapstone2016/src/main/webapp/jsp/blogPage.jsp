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
        <div class="container" style="margin-top: 60px">
            <h2 class="text-center">${post.title}</h2>
            <div class="row">
                <p style="text-align: center; font-weight: bold; color: #1b6d85">
                <c:forEach var="tag" items="${post.tags}" varStatus = "count">
                    <a id="${post.postId}tagNo${count.index}"><c:out value="#${tag} "/></a>
                </c:forEach></p>
                </p>
            </div>
            <hr>
            <p class="text-center">${post.postDateString}</p><hr>
            <p>${post.postBody}</p>
        </div>
        <div class="push"></div>
        <%@include file="footerFragment.jsp"%>
        <%@include file="signInModal.jsp"%>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/blog.js"></script>
    </body>
</html>
