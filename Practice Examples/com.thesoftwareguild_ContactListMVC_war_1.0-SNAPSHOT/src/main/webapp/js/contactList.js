/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Document ready function
$(document).ready(function () {
    loadContacts();
    $('#add-button').click(function (event) {
// we don’t want the button to actually submit
// we'll handle data submission via ajax
        event.preventDefault();
        // Make an Ajax call to the server. HTTP verb = POST, URL = contact
        $.ajax({
            type: 'POST',
            url: 'contact',
            // Build a JSON object from the data in the form
            data: JSON.stringify({
                firstName: $('#add-first-name').val(),
                lastName: $('#add-last-name').val(),
                company: $('#add-company').val(),
                phone: $('#add-phone').val(),
                email: $('#add-email').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
// If the call succeeds, clear the form and reload the summary table
            $('#add-first-name').val('');
            $('#add-last-name').val('');
            $('#add-company').val('');
            $('#add-phone').val('');
            $('#add-email').val('');
            loadContacts();
            //return false;
        });
    });

    $('#edit-button').click(function (event) {
        // prevent the button press from submitting the whole page
        event.preventDefault();

        // Ajax call -
        // Method - PUT
        // URL - contact/{id}
        // Just reload all of the Contacts upon success
        $.ajax({
            type: 'PUT',
            url: 'contact/' + $('#edit-contact-id').val(),
            data: JSON.stringify({
                contactId: $('#edit-contact-id').val(),
                firstName: $('#edit-first-name').val(),
                lastName: $('#edit-last-name').val(),
                company: $('#edit-company').val(),
                phone: $('#edit-phone').val(),
                email: $('#edit-email').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function () {
            loadContacts();
        });
    });
});
//==========
// FUNCTIONS
//==========
// Load contacts into the summary table
function loadContacts() {
    // Clear the previous list
    clearContactTable();
    // Grab the tbody element that will hold the new list of contacts
    var cTable = $('#content-rows');
    // Iterate through each of the JSON objects in the test contact data
    // and render to the summary table

    $.ajax({
        url: "contacts"
    }).success(function (data, status) {
        $.each(data, function (index, contact) {
            cTable.append($('<tr>')
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-contact-id': contact.contactId,
                                        'data-toggle': 'modal',
                                        'data-target': '#details-modal'
                                    })
                                    .text(contact.firstName + ' ' + contact.lastName)
                                    )
                            )
                    .append($('<td>').text(contact.company))
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-contact-id': contact.contactId,
                                        'data-toggle': 'modal',
                                        'data-target': '#edit-modal'
                                    })
                                    .text('Edit')
                                    ) // ends the <a> tag
                            ) // ends the <td> tag for Edit
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'onClick': 'deleteContact(' + contact.contactId + ')'
                                    })
                                    .text('Delete')
                                    ) // ends the <a> tag
                            )
                    );
        });
    });
}
// Clear all content rows from the summary table
function clearContactTable() {
    $('#content-rows').empty();
}

function deleteContact(id) {
    var answer = confirm("Do you really want to delete this contact?");
    if (answer === true) {
        $.ajax({
            type: 'DELETE',
            url: 'contact/' + id
        }).success(function () {
            loadContacts();
        });
    }
}



// This code runs in response to the show.bs.modal event - it gets the correct
// contact data and renders it to the dialog
$('#details-modal').on('show.bs.modal', function (event) {
// Get the element that triggered this event - in our case it is a contact
// name link in the summary table. This link has an attribute that contains
// the contactId for the given contact. We'll use that to retrieve the
// contact's details.
    var element = $(event.relatedTarget);
    // grab the contact id
    var contactId = element.data('contact-id');
    // PLACEHOLDER: Eventually we'll make an ajax call to the server to get the
    // details for this contact but for now we'll load the dummy
    // data
    var modal = $(this);

    $.ajax({
        type: 'GET',
        url: 'contact/' + contactId
    }).success(function (contact) {
        modal.find('#contact-id').text(contact.contactId);
        modal.find('#contact-firstName').text(contact.firstName);
        modal.find('#contact-lastName').text(contact.lastName);
        modal.find('#contact-company').text(contact.company);
        modal.find('#contact-phone').text(contact.phone);
        modal.find('#contact-email').text(contact.email);
    });
});




// This code runs in response to the show.bs.modal event - it gets the correct
// contact data and renders it to the dialog
$('#edit-modal').on('show.bs.modal', function (event) {
// Get the element that triggered this event - in our case it is a contact
// name link in the summary table. This link has an attribute that contains
// the contactId for the given contact. We'll use that to retrieve the
// contact's details.
    var element = $(event.relatedTarget);
    // Grab the contact id
    var contactId = element.data('contact-id');
    // PLACEHOLDER: Eventually we'll make an ajax call to the server to get the
    // details for this contact but for now we'll load the dummy
    // data
    var modal = $(this);

    $.ajax({
        type: 'GET',
        url: 'contact/' + contactId
    }).success(function (contact) {
        modal.find('#contact-id').text(contact.contactId);
        modal.find('#edit-first-name').val(contact.firstName);
        modal.find('#edit-last-name').val(contact.lastName);
        modal.find('#edit-company').val(contact.company);
        modal.find('#edit-phone').val(contact.phone);
        modal.find('#edit-email').val(contact.email);
        modal.find('#edit-contact-id').val(contact.contactId);
    });
});
// TEST DATA
var testContactData = [
    {
        contactId: 1,
        firstName: "Susan",
        lastName: "Williams",
        company: "IBM",
        email: "swilliams@ibm.com",
        phone: "555-1212"},
    {
        contactId: 2,
        firstName: "George",
        lastName: "Smith",
        company: "EMC",
        email: "smith@emc.com",
        phone: "555-1234"},
    {
        contactId: 3,
        firstName: "Chuck",
        lastName: "Blockhead",
        company: "3M",
        email: "chuck@3m.com",
        phone: "555-5656"}
];
var dummyDetailsContact =
        {
            contactId: 42,
            firstName: "Kent",
            lastName: "Hrbek",
            company: "3M",
            email: "kent@3m.com",
            phone: "444-6798"
        };
var dummyEditContact =
        {
            contactId: 52,
            firstName: "Kirby",
            lastName: "Puckett",
            company: "Sun",
            email: "kirby@sun.com",
            phone: "123-5599"
        };