<%-- 
    Document   : displaySearchDVDFormNoAjax
    Created on : Oct 28, 2016, 3:07:20 PM
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
        </div>
        <div class="container">
            <h1>Search DVD</h1>
            <a href="displayDVDListNoAjax">DVD List (No Ajax)</a><br/>
            <hr/>
            <form class="form-horizontal"
                  role="form"
                  action="searchDVDNoAjax"
                  method="POST">
                <div class="form-group">
                    <label for="search-title"
                           class="col-md-4 control-label">Title:</label>
                    <div class="col-md-8">
                        <input type="text"
                               class="form-control"
                               id="search-title"
                               name="title"
                               placeholder="Title"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="search-release-date" class="col-md-4 control-label">Release Date:</label>
                    <div class="col-md-8">
                        <input type="text"
                               class="form-control"
                               id="search-release-date"
                               name="releaseDate"
                               placeholder="releaseDate"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="search-rating"
                           class="col-md-4 control-label">Rating:</label>
                    <div class="col-md-8">
                        <input type="text"
                               class="form-control"
                               id="search-rating"
                               name="rating"
                               placeholder="Rating"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="search-director" class="col-md-4 control-label">Director:</label>
                    <div class="col-md-8">
                        <input type="text"
                               class="form-control"
                               id="search-director"
                               name="director"
                               placeholder="Director"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="search-studio" class="col-md-4 control-label">Studio:</label>
                    <div class="col-md-8">
                        <input type="text"
                               class="form-control"
                               id="search-studio"
                               name="studio"
                               placeholder="Studio"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="search-comment" class="col-md-4 control-label">Comment:</label>
                    <div class="col-md-8">
                        <input type="text"
                               class="form-control"
                               id="search-zip"
                               name="comment"
                               placeholder="Comment"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit"
                                id="add-button"
                                class="btn btn-default">Search for DVD</button>
                    </div>
                </div>
            </form>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
