<%-- 
    Document   : editDVDForNoAjax
    Created on : Oct 28, 2016, 2:24:40 PM
    Author     : josephrohwer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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
            <h1>Edit DVD Form</h1>
            <a href="displayDVDListNoAjax">DVD List (No Ajax)</a><br/>
            <hr/>
            <sf:form class="form-horizontal" role="form" modelAttribute="dvd"
                     action="editDVDNoAjax" method="POST">
                <div class="form-group">
                    <label for="add-title" class="col-md-4 control-label">Title:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-title"
                                  path="title" placeholder="Title"/>
                        <sf:errors path="title" cssclass="error"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-release-date" class="col-md-4 control-label">Release Date:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-release-date"
                                  path="releaseDate" placeholder="Release Date"/>
                        <sf:errors path="releaseDate" cssclass="error"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-rating" class="col-md-4 control-label">Rating:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-rating"
                                  path="rating" placeholder="Rating"/>
                        <sf:errors path="rating" cssclass="error"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-director" class="col-md-4 control-label">Director:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-director"
                                  path="director" placeholder="Director"/>
                        <sf:errors path="director" cssclass="error"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-studio" class="col-md-4 control-label">Studio:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-studio"
                                  path="studio" placeholder="Studio"/>
                        <sf:errors path="studio" cssclass="error"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-comment" class="col-md-4 control-label">Comment:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-comment"
                                  path="comment" placeholder="Comment"/>
                        <sf:hidden path="dvdId"/>
                        <sf:errors path="comment" cssclass="error"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit" id="add-button" class="btn btn-default">Save DVD</button>
                    </div>
                </div>
            </sf:form>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
