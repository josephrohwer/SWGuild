<%-- 
    Document   : newPasswordModal
    Created on : Dec 7, 2016, 9:44:22 AM
    Author     : josephrohwer
--%>

<div class="modal fade" id="newPasswordModal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title" align="center">Change Password</h2>
            </div>
            <form class="form-horizontal" method="POST" action="updatePassword">
                <fieldset>
                    <div class="modal-body">
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                                <input type="text"
                                       class="form-control"
                                       id="addusername"
                                       name="edit-username"
                                       placeholder="Username"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                                <input type="password"
                                       class="form-control"
                                       id="addpassword"
                                       name="edit-password"
                                       placeholder="Password"/>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div class="col-md-8 col-md-offset-2">
                            <button name="commit"
                                    class="btn btn-default" 
                                    type="submit"
                                    value="Edit Password">Save</button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>