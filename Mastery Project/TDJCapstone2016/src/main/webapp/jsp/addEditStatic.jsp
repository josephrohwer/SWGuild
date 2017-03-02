<div class="modal fade" id="addStatic" tabindex="-1" role="dialog"
     aria-labelledby="detailsModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:900px; height:1000px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
                <h4 class="modal-title" id="addPostLabel">New Static Page</h4>
            </div>
            <div class="modal-body">
                <br>
                <form method="post" id="add-static">
                    <div class ="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="add-static-title" class="control-label">Title:</label>
                                <input type="text" class="form-control" id="add-static-title" placeholder="Title"/>
                            </div>
                        </div>
                    </div>
                    <div class ="row">
                        <div class ="form-group col-md-12">
                            <label for="add-static-body" class="col-md-4 control label">
                                Content Body:
                            </label>
                            <div id="addForm">
                                <textarea id="add-static-body" class="editThis"></textarea>
                            </div>
                        </div>
                    </div>
                    <input type="hidden" id="add-static-id"/>
                    <div class="row">
                        <div class ="col-md-6 col-md-offset-3" style="text-align:center">
                            <button type="button" data-dismiss="modal" class="btn btn-default" id="add-static-button">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="editStatic" tabindex="-1" role="dialog"
     aria-labelledby="detailsModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:900px; height:1000px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
                <h4 class="modal-title" id="addPostLabel">Edit Static Page</h4>
            </div>
            <div class="modal-body">
                <br>
                <form method="post" id="edit-static">
                    <div class ="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="edit-static-title" class="control-label">Title:</label>
                                <input type="text" class="form-control" id="edit-static-title" placeholder="Title"/>
                            </div>
                        </div>
                    </div>
                    <div class ="row">
                        <div class ="form-group col-md-12">
                            <label for="edit-static-body" class="col-md-4 control label">
                                Content Body:
                            </label>
                            <div id="editForm">
                                <textarea id="edit-static-body" class="editThis"></textarea>
                            </div>
                        </div>
                    </div>
                    <input type="hidden" id="edit-static-id"/>
                    <div class="row">
                        <div class ="col-md-6 col-md-offset-3" style="text-align:center">
                            <button type="button" data-dismiss="modal" class="btn btn-default" id="edit-static-button">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
