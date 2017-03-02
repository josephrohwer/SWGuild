<%-- 
    Document   : displaySearchResultsNoAjax
    Created on : Oct 28, 2016, 3:07:36 PM
    Author     : josephrohwer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DVD Library</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>DVD Library</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/mainAjaxPage">DVD Library (Ajax)</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/search">Search</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/stats">Stats</a>
                    </li>
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/displayDVDListNoAjax">
                            DVD Library (No Ajax)
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
        </div>
        <div class="container">
            <h1>DVD Library Search Results</h1>
            <a href="displayDVDListNoAjax">DVD Library (No Ajax)</a></br>
            <hr/>
            <c:forEach var="dvd" items="${searchList}">
                <s:url value="deleteDVDNoAjax"
                       var="deleteDVD_url">
                    <s:param name="dvdId" value="${dvd.dvdId}" />
                </s:url>
                <s:url value="displayEditDVDFormNoAjax"
                       var="editDVD_url">
                    <s:param name="dvdId" value="${dvd.dvdId}" />
                </s:url>
                ${dvd.title}, ${dvd.releaseDate}  |
                <a href="${deleteDVD_url}">Delete</a> |
                <a href="${editDVD_url}">Edit</a><br/>
                Rated ${dvd.rating}<br>
                Directed by ${dvd.director}<br>
                Produced by ${dvd.studio}<br>
                > ${dvd.comment}<br>
                <hr>
            </c:forEach>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
