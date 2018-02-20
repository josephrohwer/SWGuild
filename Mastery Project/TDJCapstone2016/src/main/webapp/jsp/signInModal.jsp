<%-- 
    Document   : login
    Created on : Nov 29, 2016, 3:18:47 PM
    Author     : josephrohwer
--%>

<div class="modal fade" id="signInModal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title" align="center">Sign In to Your Account</h2>
            </div>
            <div class="modal-body">
            <form class="form-horizontal" method="POST" class="signin" action="${pageContext.request.contextPath}/j_spring_security_check">
                <fieldset>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                               <div class="validationErrors" id="validate-username"></div>
                                <input type="text"
                                       class="form-control"
                                       id="username_or_email"
                                       name="j_username"
                                       placeholder="Username"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                               <div class="validationErrors" id="validate-password"></div>
                                <input type="password"
                                       class="form-control"
                                       id="password"
                                       name="j_password"
                                       placeholder="Password"/>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div class="col-md-8 col-md-offset-2">
                            <button class="btn btn-default"
                                    id="sign-in-button"
                                    type="submit"
                                    value="Sign In">Sign In</button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>