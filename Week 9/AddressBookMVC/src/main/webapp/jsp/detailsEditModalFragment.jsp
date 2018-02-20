<%-- 
    Document   : detailsEditModalFragment
    Created on : Nov 1, 2016, 2:44:02 PM
    Author     : apprentice
--%>
<div class="modal fade" id="details-modal" tabindex="-1" role="dialog"
     aria-labelledby="detailsModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
                <h4 class="modal-title" id="detailsModalLabel">Address Details</h4>
            </div>
            <div class="modal-body">
                <h3 id="address-id"></h3>
                <table class="table table-bordered">
                    <tr>
                        <th>First Name:</th>
                        <td id="address-firstName"></td>
                    </tr>
                    <tr>
                        <th>Last Name:</th>
                        <td id="address-lastName"></td>
                    </tr>
                    <tr>
                        <th>Address:</th>
                        <td id="address-address"></td>
                    </tr>
                    <tr>
                        <th>City:</th>
                        <td id="address-city"></td>
                    </tr>
                    <tr>
                        <th>State:</th>
                        <td id="address-state"></td>
                    </tr>
                    <tr>
                        <th>Zip:</th>
                        <td id="address-zip"></td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">
                    Close
                </button>
            </div>
        </div>
    </div>
</div>
<!-- Edit Modal -->
<div class="modal fade" id="edit-modal" tabindex="-1" role="dialog"
     aria-labelledby="detailsModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="detailsModalLabel">Edit Address</h4>
            </div>
            <div class="modal-body">
                <h3 id="address-id"></h3>
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label for="edit-first-name" class="col-md-4 control-label">
                            First Name:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-first-name"
                                   placeholder="First Name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-last-name" class="col-md-4 control-label">
                            Last Name:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-last-name"
                                   placeholder="Last Name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-address" class="col-md-4 control-label">
                            Address:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-address"
                                   placeholder="Address">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-city" class="col-md-4 control-label">
                            City:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-city"
                                   placeholder="City">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-state" class="col-md-4 control-label">
                            State:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-state"
                                   placeholder="State">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-zip" class="col-md-4 control-label">
                            Zip:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-zip"
                                   placeholder="Zip Code">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" id="edit-button" class="btn btn-default"
                                    data-dismiss="modal">
                                Edit Address
                            </button>
                            <button type="button" class="btn btn-default"
                                    data-dismiss="modal">
                                Cancel
                            </button>
                            <input type="hidden" id="edit-address-id">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>