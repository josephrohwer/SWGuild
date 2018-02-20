/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    loadDVDS();

    $('#add-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'dvd',
            data: JSON.stringify({
                title: $('#add-title').val(),
                releaseDate: $('#add-release-date').val(),
                rating: $('#add-rating').val(),
                director: $('#add-director').val(),
                studio: $('#add-studio').val(),
                comment: $('#add-comment').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-title').val('');
            $('#add-release-date').val('');
            $('#add-rating').val('');
            $('#add-director').val('');
            $('#add-studio').val('');
            $('#add-comment').val('');
            $('#validationErrors').empty();
            loadDVDS();
        }).error(function (data, status) {
            $.each(data.responseJSON.fieldErrors, function (index, validationError) {
                var errorDiv = $('#validationErrors');
                errorDiv.append(validationError.message).append($('<br>'));
            });
        });
    });
    $('#edit-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'PUT',
            url: 'dvd/' + $('#edit-dvd-id').val(),
            data: JSON.stringify({
                dvdId: $('#edit-dvd-id').val(),
                title: $('#edit-title').val(),
                releaseDate: $('#edit-release-date').val(),
                rating: $('#edit-rating').val(),
                director: $('#edit-director').val(),
                studio: $('#edit-studio').val(),
                comment: $('#edit-comment').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function () {
            loadDVDS();
        });
    });

    $('#search-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'search/dvds',
            data: JSON.stringify({
                title: $('#search-title').val(),
                releaseDate: $('#search-release-date').val(),
                rating: $('#search-rating').val(),
                director: $('#search-director').val(),
                studio: $('#search-studio').val(),
                comment: $('#search-comment').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#search-title').val('');
            $('#search-release-date').val('');
            $('#search-rating').val('');
            $('#search-director').val('');
            $('#search-studio').val('');
            $('#search-comment').val('');
            fillDVDTable(data, status);
        });
    });
});

function loadDVDS() {
    $.ajax({
        url: "dvds"
    }).success(function (data, status) {
        fillDVDTable(data, status);
    });
}

function fillDVDTable(dvdList, status) {
    clearDVDTable();
    var cTable = $('#contentRows');

    $.each(dvdList, function (index, dvd) {
        cTable.append($('<tr>')
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-dvd-id': dvd.dvdId,
                                    'data-toggle': 'modal',
                                    'data-target': '#detailsModal'
                                })
                                .text(dvd.title + ' (' + dvd.releaseDate + ')')
                                )
                        )
                .append($('<td>').text(dvd.rating))
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-dvd-id': dvd.dvdId,
                                    'data-toggle': 'modal',
                                    'data-target': '#editModal'
                                })
                                .text('Edit')
                                )
                        )
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'onClick': 'deleteDVD(' + dvd.dvdId + ')'
                                })
                                .text('Delete')
                                )
                        )
                );
    });
}

function deleteDVD(id) {
    var answer = confirm("Do you really want to delete this DVD?");
    if (answer === true) {
        $.ajax({
            type: 'DELETE',
            url: 'dvd/' + id
        }).success(function () {
            loadDVDS();
        });
    }
}

function clearDVDTable() {
    $('#contentRows').empty();
}

$('#detailsModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);
    $.ajax({
        type: 'GET',
        url: 'dvd/' + dvdId
    }).success(function (DVD) {
        modal.find('#dvd-id').text(DVD.dvdId);
        modal.find('#dvd-title').text(DVD.title);
        modal.find('#dvd-releaseDate').text(DVD.releaseDate);
        modal.find('#dvd-rating').text(DVD.rating);
        modal.find('#dvd-director').text(DVD.director);
        modal.find('#dvd-studio').text(DVD.studio);
        modal.find('#dvd-comment').text(DVD.comment);

    });
});

$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);
    $.ajax({
        type: 'GET',
        url: 'dvd/' + dvdId
    }).success(function (DVD) {
        modal.find('#dvd-id').text(DVD.dvdId);
        modal.find('#edit-dvd-id').val(DVD.dvdId);
        modal.find('#edit-title').val(DVD.title);
        modal.find('#edit-release-date').val(DVD.releaseDate);
        modal.find('#edit-rating').val(DVD.rating);
        modal.find('#edit-director').val(DVD.director);
        modal.find('#edit-studio').val(DVD.studio);
        modal.find('#edit-comment').val(DVD.comment);
    });
});