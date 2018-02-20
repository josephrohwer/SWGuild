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
            <div class="col-md-6 col-md-offset-3">
                <h2 align="center">Contact Us!</h2>
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <div class="col-md-8 col-md-offset-2">Name
                            <input type="text"
                                   class="form-control"
                                   id="contact-name"
                                   name="name"
                                   placeholder="Enter your name"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-8 col-md-offset-2">Email
                            <input type="email"
                                   class="form-control"
                                   id="contact-email"
                                   name="email"
                                   placeholder="Enter your email address"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-8 col-md-offset-2">Phone
                            <input type="tel"
                                   class="form-control"
                                   id="contact-phone"
                                   name="phone"
                                   placeholder="Enter your phone number"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-8 col-md-offset-2">Reason for Inquiry
                            <select class ="form-control" name ="reason" id ="contact-reason">
                                <option value="2">Question</option>
                                <option value="3">Flower Request</option>
                                <option value="4">Issue</option>
                                <option value="1">Other</option>
                                <intput name ="reason"/>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-8 col-md-offset-2">Additional Information
                            <textarea class="form-control"
                                      placeholder="Enter your message"
                                      id="contact-additional-info"
                                      rows="5"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-8 col-md-offset-2">Have you ordered from here before?<br>
                            <input type="radio"
                                   id="contact-been-here"
                                   name="answer" 
                                   value="NO" checked>&ensp;No&emsp;
                            <input type="radio"
                                   id="contact-been-here"
                                   name="answer" 
                                   value="YES">&ensp;Yes&emsp;
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-8 col-md-offset-2">Best days to contact you<br>
                            <input type="checkbox" id="contact-day" name="weekday" value="M">&ensp;M&emsp;
                            <input type="checkbox" id="contact-day" name="weekday" value="T">&ensp;T&emsp;
                            <input type="checkbox" id="contact-day" name="weekday" value="W">&ensp;W&emsp;
                            <input type="checkbox" id="contact-day" name="weekday" value="TH">&ensp;Th&emsp;
                            <input type="checkbox" id="contact-day" name="weekday" value="F">&ensp;F
                        </div>
                    </div>
                </form>
                <div class="col-md-2 col-md-offset-8">
                    <button id="contact-submit"
                            class="btn btn-default" 
                            >Submit</button>
                </div>
            </div>
            <div class='push'></div>
        </div>
        <%@include file="footerFragment.jsp"%>
        <%@include file="signInModal.jsp"%>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/blog.js"></script>
    </body>
</html>