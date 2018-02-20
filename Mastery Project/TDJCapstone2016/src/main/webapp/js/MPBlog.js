$(document).ready(function () {
    loadContactTables();
    loadDropdown();
    $('#search-month').datepicker({
        autoclose: true,
        minViewMode: 1,
        format: 'yyyy-mm'
    }).on('changeDate', function (selected) {
        startDate = new Date(selected.date.valueOf());
        startDate.setDate(startDate.getDate(new Date(selected.date.valueOf())));
        $('.to').datepicker('setStartDate', startDate);
    });

    $('#add-button').click(function (event) {
        if ($('#add-status').prop('checked') === false) {
            $('#add-status').val(false);
        }
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'post',
            data: JSON.stringify({
                title: $('#add-post-title').val(),
                postBody: tinymce.get('add-post-body').getContent(),
                expDateJSON: $('#add-exp-date').val(),
                tagsJSON: $('#add-post-tags').val(),
                status: $('#add-status').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#addPost').modal("hide");
            console.log('#add-exp-date');
            $('#add-post-title').val('');
            $('#add-post-body').val('');
            $('#add-date').val('');
            $('#add-exp-date').val('');
            $('#add-post-tags').tagsinput('removeAll');
            $('#add-status').val();
            $('#validationErrors').empty();
            loadActivePosts();
            loadQueuedPosts();
        }).error(function (data, status) {
            $.each(data.responseJSON.fieldErrors, function (index, validationError) {
                var errorDiv = '#validate-add-' + validationError.fieldName;
                $(errorDiv).append(validationError.message).append($('<br>'));
            });
        });
    });

    $('#search-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'search/posts',
            data: JSON.stringify({
                title: $('#search-title').val(),
                tagsSearch: $('#search-tags').val(),
                postDateJSON: $('#search-month').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#search-title').val('');
            $('#search-tags').val('');
            $('#search-month').val('');
            displaySearchPosts(data, status);
        });
    });

});

function loadActivePosts() {
    clearActiveTable();
    var pTable = $('#contentRows');
    $.ajax({
        url: "posts"
    }).success(function (data, status) {
        $.each(data, function (index, post) {
            pTable.append($('<tr>')
                    .attr({
                        'id': 'active_row_' + post.postId
                    })
                    .append($('<td>')
                            .append($('<a href=blogPage/' + post.postId + '>')
                                    .text(post.title)
                                    )
                            )
                    .append($('<td>').text(post.postDateString))
                    .append($('<td>')
                            .append($('<btn>')
                                    .attr({
                                        'class': 'btn btn-default btn-sm',
                                        'id': 'button' + post.postId,
                                        'style': 'float:right',
                                        'onClick': 'togglePreviewNewsfeed(' + post.postId + ');'
                                    }).html('View more')))
                    ).append($('<tr>').attr({
                'style': 'height: 0px;'
            })).append($('<td>')
                    .attr({'colspan': '3'})
                    .append($('<div>').attr({
                        'style': 'overflow:hidden; height:0px;',
                        'id': 'contentRowsUser' + post.postId,
                        'class': 'newsfeedDiv'
                    })
                            .append($('<div>')
                                    .html(post.postBody))
                            ));

        });
    });
}

function displaySearchPosts(data, status) {
    clearActiveTable();

    var pTable = $('#contentRows');
    $.each(data, function (index, post) {
        pTable.append($('<tr>')
                .attr({
                    'id': 'active_row_' + post.postId
                })
                .append($('<td>')
                        .append($('<a href=blogPage/' + post.postId + '>')
                                .text(post.title)
                                )
                        )
                .append($('<td>').text(post.postDateString))
                .append($('<td>')
                        .append($('<btn>').attr({
                            'class': 'btn btn-default btn-sm',
                            'id': 'button' + post.postId,
                            'style': 'float:right',
                            'onClick': 'togglePreviewNewsfeed(' + post.postId + ');'
                        })
                                .html('View more')
                                )
                        )
                ).append($('<tr>')
                .attr({
                    'style': 'height: 0px;'
                })
                ).append($('<td>')
                .attr({'colspan': '3'})
                .append($('<div>')
                        .attr({
                            'style': 'overflow:hidden; height:0px;',
                            'id': 'contentRowsUser' + post.postId,
                            'class': 'newsfeedDiv'
                        })
                        .append($('<div>')
                                .html(post.postBody))
                        ));
    });
}

function clearContactTables() {
    $('#footer-phone').empty();
    $('#footer-email').empty();
    $('#footer-twitter').empty();
    $('#footer-facebook').empty();
}

function loadContactTables() {
    clearContactTables();
    var pTable = $('#footer-phone');
    var eTable = $('#footer-email');
    var tTable = $('#footer-twitter');
    var fTable = $('#footer-facebook');
    $.ajax({
        url: "/TDJCapstone2016/contact"
    }).success(function (contact) {
        pTable.append($('<tr>')
                .append($('<td>')
                        .append($('<i>')
                                .attr({
                                    'class': 'fa fa-phone',
                                    'id': 'icon'
                                })
                                )
                        )
                .append($('<td>').text(contact.phone))
                );
        eTable.append($('<tr>')
                .append($('<td>')
                        .append($('<i>')
                                .attr({
                                    'class': 'fa fa-envelope',
                                    'id': 'icon'
                                })
                                )
                        )
                .append($('<td>').text(contact.email))
                );
        tTable.append($('<tr>')
                .append($('<td>')
                        .append($('<i>')
                                .attr({
                                    'class': 'fa fa-twitter',
                                    'id': 'icon'
                                })
                                )
                        )
                .append($('<td>').text(contact.twitter))
                );
        fTable.append($('<tr>')
                .append($('<td>')
                        .append($('<i>')
                                .attr({
                                    'class': 'fa fa-facebook',
                                    'id': 'icon'
                                })
                                )
                        )
                .append($('<td>').text(contact.facebook))
                );
    }).error(function (data, status) {
        console.log(data, status);
    });
}

$('#addPost').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var postId = element.data('post-id');
    var modal = $(this);
    var date_input = $('input[name="date"]');
    var options = {
        format: 'yyyy/mm/dd',
        todayHighlight: true,
        autoclose: true
    };
    date_input.datepicker(options);
});

$('#addPost').on('hidden.bs.modal', function () {
    $('#add-post-tags').tagsinput('removeAll');
});

function clearActiveTable() {
    $('#contentRows').empty();
}

function togglePreviewNewsfeed(id) {
    if ($('#contentRowsUser' + id).css('height') === '0px') {
        $('#contentRowsUser' + id).animate({height: "100%"}, 300);
        $('#button' + id).html('View less');
    } else if ($('#contentRowsUser' + id).css('height') !== '0px') {
        $('#contentRowsUser' + id).animate({height: "0px"}, 300);
        $('#button' + id).html('View more');
    }
}

function clearDropdown() {
    $('#dropdownMenu').empty();
}

function loadDropdown() {
    clearDropdown();
    var rUl = $('#dropdownMenu');
    $.ajax({
        url: "/TDJCapstone2016/dropdown"
    }).success(function (data, status) {
        $.each(data, function (index, staticContent) {
            rUl.append($('<li>')
                    .append($('<a href=staticPage/' + staticContent.staticId + '>').text(staticContent.title)));
        });

    }).error(function (data, status) {
        console.log(data, status);
    });
}