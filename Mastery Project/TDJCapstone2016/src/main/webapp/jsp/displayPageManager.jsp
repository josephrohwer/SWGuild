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
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-tagsinput.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    </head>
    <body onload="Javascript:loadStaticContent()">
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
                    <div class="col-md-8"><h2 align="left">Pages</h2></div>
                    <div class="col-md-4">
                        <button type="button" id="page-button" class="btn btn-default" data-toggle="modal" data-target="#addStatic">Add a Page</button>
                    </div>
                </div>
                <table class="table table-hover">
                    <tr>
                        <th>Page Title</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                            <tbody id="staticRows">
                    <tr>
                        <td></td>
                        <td><span class="glyphicon glyphicon-pencil" style="color:blue"></span></td>
                        <td><span class="glyphicon glyphicon-trash" style="color:red"></span></td>
                    </tr>
                </tbody>
                </table>
            </div>
            <div class='push'></div>
            <%@include file="footerFragment.jsp"%>
        </div>
        <%@include file="signInModal.jsp"%>
        <%@include file="addEditStatic.jsp"%>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/blog.js"></script>
        <script src='//cdn.tinymce.com/4/tinymce.min.js'></script>
        <script>
            tinymce.init({
                selector: 'textarea.editThis',
//                inline: true,
                width: '100%',
                plugins: 'fullscreen preview image imagetools lists link visualblocks textcolor colorpicker',
//                menubar: false,
                toolbar: "undo redo | insert | styleselect | bold italic | alignleft aligncenter alignright alignjustify \n\
                          preview image link visualblocks fullscreen forecolor backcolor",
                plugin_preview_height: 500,
                plugin_preview_width: 600
            });
        </script>
    </body>
</html>