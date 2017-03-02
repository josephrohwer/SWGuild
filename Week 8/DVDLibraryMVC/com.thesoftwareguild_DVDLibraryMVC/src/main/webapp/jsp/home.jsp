<%-- 
    Document   : home
    Created on : Oct 28, 2016, 11:23:40 AM
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
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
              rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>DVD Library</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/search">Search</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/stats">Stats</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/displayDVDListNoAjax">
                            DVD List (No Ajax)
                        </a>
                    </li>
                </ul>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <h2>DVDs</h2>
                    <%@include file="DVDSummaryTableFragment.jsp"%>
                </div> 
                <div class="col-md-6">
                    <h2>Add New DVD</h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="add-title" class="col-md-4 control-label">
                                Title:
                            </label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-title"
                                       placeholder="Title"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-release-date" class="col-md-4 control-label">
                                Release Date:
                            </label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-release-date"
                                       placeholder="Release Date"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-rating" class="col-md-4 control-label">
                                Rating:
                            </label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-rating"
                                       placeholder="Rating"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-director" class="col-md-4 control-label">
                                Director:
                            </label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-director"
                                       placeholder="Director"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-studio" class="col-md-4 control-label">
                                Studio:
                            </label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-studio"
                                       placeholder="Studio"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-comment" class="col-md-4 control-label">
                                Comment:
                            </label>
                            <div class="col-md-8">
                                <input type="text"
                                       class="form-control"
                                       id="add-comment"
                                       placeholder="Comment"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit"
                                        id="add-button"
                                        class="btn btn-default">
                                    Add
                                </button>
                            </div>
                        </div>
                    </form>
                    <div id="validationErrors" style="color: red"/>
                </div>
            </div>
        </div>
        <%@include file="detailsEditModalFragment.jsp"%>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/dvdList.js"></script>
    </body>
</html>
