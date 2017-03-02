<%-- 
    Document   : contactModal
    Created on : Nov 30, 2016, 2:35:45 PM
    Author     : josephrohwer
--%>

<div class="modal fade" id="contactModal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title" align="center">Contact Information</h2>
            </div>
            <form class="form-horizontal">
                <fieldset>
                    <div class="modal-body">
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                               <div class="validationErrors" id="validate-edit-phone"></div>
                                <input type="phone"
                                       class="form-control"
                                       id="edit-phone"
                                       name="phoneNumber"
                                       placeholder="Phone Number"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                               <div class="validationErrors" id="validate-edit-email"></div>
                                <input type="email"
                                       class="form-control"
                                       id="edit-email"
                                       name="email"
                                       placeholder="Email"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                                <div class="validationErrors" id="validate-edit-twitter"></div>
                                <input type="text"
                                       class="form-control"
                                       id="edit-twitter"
                                       name="twitter"
                                       placeholder="Twitter"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-2">
                                <div class="validationErrors" id="validate-edit-facebook"></div>
                                <input type="text"
                                       class="form-control"
                                       id="edit-facebook"
                                       name="facebook"
                                       placeholder="Facebook"/>
                            </div>
                        </div>
                        <input type="hidden" id="edit-contact-id"/>
                    </div>
                    <div class="modal-footer">
                        <div class="col-md-8 col-md-offset-2">
                            <button class="btn btn-default"
                                    id="edit-contact-button"
                                    type="submit">Update</button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>
