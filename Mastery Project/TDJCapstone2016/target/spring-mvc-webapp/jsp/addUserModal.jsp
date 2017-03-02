<%-- 
    Document   : addUserForm
    Created on : Dec 5, 2016, 9:35:32 AM
    Author     : josephrohwer
--%>

<div class="modal fade" id="addUserModal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title" align="center">New User</h2>
            </div>
            <form class="form-horizontal" method="POST" action="addUser">
                <fieldset>
                    <div class="modal-body">
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                                <input type="text"
                                       class="form-control"
                                       id="add-username"
                                       name="username"
                                       placeholder="Username"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                                <input type="password"
                                       class="form-control"
                                       id="add-password"
                                       name="password"
                                       placeholder="Password"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2"><p align="right">Admin User
                                <input type="checkbox"
                                       id="is-admin"
                                       name="isAdmin"
                                       value="yes"
                                       /></p>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div class="col-md-8 col-md-offset-2">
                            <button name="commit"
                                    class="btn btn-default" 
                                    type="submit"
                                    value="Add User">Add</button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>