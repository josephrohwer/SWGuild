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
        <link rel="stylesheet" type="text/css" href='${pageContext.request.contextPath}/css/bootstrap-datepicker3.min.css'></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-tagsinput.css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body onload="Javascript:loadActivePosts()">
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
        <div class="row">
            <div class="col-md-8">
                <div class="row">
                    <div class="col-md-8"><h2>Newsfeed</h2></div>
                    <sec:authorize access="hasAnyRole('ROLE_ADMIN, ROLE_MARKETER')"> 
                        <div class="col-md-4">
                            <button type="button" id="new-post-button" class="btn btn-default" data-toggle="modal" data-target="#addPost">
                                <span class="glyphicon glyphicon-plus"></span>
                            </button> 
                        </div>
                    </sec:authorize>
                </div>
                <table id="newsFeedTable" class="table table-hover">
                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                        <tr>
                            <th width="40%">Title</th>
                            <th width="30%">Date</th>
                            <th width="15%"></th>
                            <th width="15%"></th>  
                        </tr>
                    </sec:authorize>
                    <sec:authorize access="isAnonymous()"> 
                        <tr>
                            <th width="60%">Title</th>
                            <th width="20%">Date</th>
                            <th width="20%"></th>
                        </tr>
                    </sec:authorize>
                    <sec:authorize access="hasRole('ROLE_MARKETER')">
                        <tr>
                            <th width="60%">Title</th>
                            <th width="20%">Date</th>
                            <th width="20%"></th>
                        </tr>
                    </sec:authorize>
                    <tbody id="contentRows" style="width: 100%"></tbody>
                </table>
            </div> 
            <div class="col-md-4">
                <h2 align="center">Search The Archives</h2>
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <input type="text"
                               class="form-control"
                               id="search-title"
                               placeholder="Search by Title"/>
                    </div>
                    <div class="form-group">
                        <input type="text"
                               class="form-control"
                               id="search-tags"
                               placeholder="Search by Tags"/>
                    </div>
                    <div class="form-group">
                        <input type="text"
                               class="form-control"
                               id="search-month"
                               data-provide= "datepicker"
                               placeholder="Search by Year and Month"/>
                    </div>
                    <div class="form-group" align="center">
                        <button type="submit"
                                id="search-button"
                                class="btn btn-default">
                            Search
                        </button>
                    </div>
                </form>
                <div id="validationErrors" style="color: red"/></div>
        </div>
    </div>
    <div class='push'></div>
    <%@include file="footerFragment.jsp"%>
    </div>
<%@include file="addEditPost.jsp"%>
<%@include file="signInModal.jsp"%>
<script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<sec:authorize access="hasRole('ROLE_ADMIN')"> 
    <script src="${pageContext.request.contextPath}/js/blog.js"></script>
</sec:authorize>
<sec:authorize access="isAnonymous()"> 
    <script src="${pageContext.request.contextPath}/js/userBlog.js"></script>
</sec:authorize>
<sec:authorize access="hasRole('ROLE_MARKETER')"> 
    <script src="${pageContext.request.contextPath}/js/MPBlog.js"></script>
</sec:authorize>
<script src='${pageContext.request.contextPath}/js/bootstrap-tagsinput.min.js'></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<script src='//cdn.tinymce.com/4/tinymce.min.js'></script>
<script>
                            tinymce.init({
                                selector: 'textarea.editMe',
                                //                inline: true,
                                width: '100%',
                                height: '500px',
                                plugins: 'preview image imagetools link visualblocks',
                                //                menubar: false,
                                toolbar: "undo redo | insert | styleselect | bold italic | alignleft aligncenter alignright alignjustify \n\
                  preview image link visualblocks",
                                plugin_preview_height: 500,
                                plugin_preview_width: 600
                            });
</script>
</body>
</html>