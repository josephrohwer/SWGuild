<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<div class="modal fade" id="addEditPost" tabindex="-1" role="dialog"
     aria-labelledby="detailsModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:900px; height:1000px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
                <h4 class="modal-title" id="addEditPostLabel">Edit Post</h4>
            </div>
            <div class="modal-body">
                <br>
                <form method="post" id="edit-post">
                    <div class ="offset-8-col-md-2" id="check-box-div">
                        <label class="control-label" for="date">Approved:</label>
                        <input type="checkbox" class="check-box" name="IsApproved" id="edit-status" value="true">
                    </div>
                    <div class ="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <div class="validationErrors" id="validate-edit-title"></div>
                                <label for="edit-post-title" class="control-label">Title:</label>
                                <input type="text" class="form-control" id="edit-post-title" placeholder="Title"/>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <label class="control-label" for="edit-exp-date">Expiration Date:</label>
                            <input class="form-control" name="date" placeholder="YYYY/MM/DD" type="text" id="edit-exp-date"/>
<!--                            <button class="btn btn-default" id="edit-exp-toggle" type="button">Add Exp. Date</button>-->
                        </div>
                    </div>
                    <div class ="row">
                        <div class ="form-group col-md-12">
                            <label for="edit-post-body" class="col-md-4 control label">
                                Post Body:
                            </label>
                            <div id="addEditForm">
                                <div class="validationErrors" id="validate-edit-postBody"></div>
                                <textarea id="edit-post-body" class="editMe"></textarea>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-md-12">
                            <label for="edit-post-tags" class="control-label">Tags:</label>
                            <input type="text" data-role="tagsinput" class="form-control tag-field" id="edit-post-tags" placeholder="Tags"/>
                        </div>
                    </div>
                    <input type="hidden" id="edit-post-id"/>
                    <input type="hidden" id="edit-post-date"/>
                    <div class="row">
                        <div class ="col-md-6 col-md-offset-3" style="text-align:center">
                            <button type="submit" class="btn btn-default" id="edit-button">Submit for Approval</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="addPost" tabindex="-1" role="dialog"
     aria-labelledby="detailsModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:900px; height:1000px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
                <h4 class="modal-title" id="addPostLabel">New Post</h4>
            </div>
            <div class="modal-body">
                <br>
                <form method="post" id="add-post">
                    <sec:authorize access="hasRole('ROLE_ADMIN')"> 
                        <div class ="offset-8-col-md-2" id="check-box-div">
                            <label class="control-label" for="date">Approved:</label>
                            <input type="checkbox" class="check-box" name="IsApproved" id="add-status" value="true">
                        </div>
                    </sec:authorize>                      
                    <div class ="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="add-post-title" class="control-label">Title:</label>
                                <div class="validationErrors" id="validate-add-title"></div>
                                <input type="text" class="form-control" id="add-post-title" placeholder="Title"/>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <label class="control-label" for="add-exp-date">Expiration Date:</label>
                            <input class="form-control" id="add-exp-date" name="date" placeholder="YYYY/MM/DD" type="text"/>
                        </div>
                    </div>
                    <div class ="row">
                        <div class ="form-group col-md-12">
                            <label for="add-post-body" class="col-md-4 control label">
                                Post Body:
                            </label>
                            <div id="addForm">
                                <div class="validationErrors" id="validate-add-postBody"></div>
                                <textarea id="add-post-body" class="editMe"></textarea>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-md-12">
                            <label for="add-post-tags" class="control-label">Tags:</label>
                            <input type="text" data-role="tagsinput" class="form-control" id="add-post-tags tag-field" placeholder="Tags"/>
                        </div>
                    </div>
                    <input type="hidden" id="add-post-id"/>
                    <input type="hidden" id="add-post-date"/>
                    <div class="row">
                        <div class ="col-md-6 col-md-offset-3" style="text-align:center">
                            <button type="submit" class="btn btn-default" id="add-button">Submit for Approval</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
