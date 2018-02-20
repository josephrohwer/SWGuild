$(document).ready(function () {
    loadContactTables();
    loadDropdown();
            
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
            $('.validationErrors').empty();
            $('#add-post-title').val('');
            tinymce.get('add-post-body').setContent('');
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

    $('#edit-button').click(function (event) {
        if ($('#edit-status').prop('checked') === false) {
            $('#edit-status').val(false);
        } else
            $('#edit-status').val(true);
        $('.validationErrors').empty();
        event.preventDefault();
        $.ajax({
            type: 'PUT',
            url: 'post/' + $('#edit-post-id').val(),
            data: JSON.stringify({
                title: $('#edit-post-title').val(),
                postBody: tinymce.get('edit-post-body').getContent(),
                postDateJSON: $('#edit-post-date').val(),
                expDateJSON: $('#edit-exp-date').val(),
                tagsJSON: $('#edit-post-tags').val(),
                status: $('#edit-status').val(),
                postId: $('#edit-post-id').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#addEditPost').modal("hide");
            $('.validationErrors').empty();
            $('#edit-post-title').val('');
            tinymce.get('edit-post-body').setContent('');
            $('#edit-post-date').val('');
            $('#edit-exp-date').val('');
            $('#edit-post-tags').tagsinput('removeAll');
            $('#edit-status').val('');
            loadActivePosts();
            loadQueuedPosts();
        }).error(function (data, status) {
            $.each(data.responseJSON.fieldErrors, function (index, validationError) {
                var errorDiv = '#validate-edit-' + validationError.fieldName;
                $(errorDiv).append(validationError.message).append($('<br>'));
            });
        });
    });

    $('#search-month').datepicker({
        autoclose: true,
        minViewMode: 1,
        format: 'yyyy-mm'
    }).on('changeDate', function (selected) {
        startDate = new Date(selected.date.valueOf());
        startDate.setDate(startDate.getDate(new Date(selected.date.valueOf())));
        $('.to').datepicker('setStartDate', startDate);
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

    $('#add-static-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'static',
            data: JSON.stringify({
                title: $('#add-static-title').val(),
                staticBody: tinymce.get('add-static-body').getContent(),
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-static-title').val('');
            $('#add-static-body').val('');
            loadStaticContent();
        });
    });

    $('#edit-static-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'PUT',
            url: 'updateStatic',
            data: JSON.stringify({
                title: $('#edit-static-title').val(),
                staticBody: tinymce.get('edit-static-body').getContent(),
                staticId: $('#edit-static-id').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#edit-static-title').val('');
            $('#edit-static-body').val('');
            loadStaticContent();
        });
    });

    $('#edit-contact-button').click(function (event) {
        $('.validationErrors').empty();
        event.preventDefault();
        $.ajax({
            type: 'PUT',
            url: 'updateContact',
            data: JSON.stringify({
                phone: $('#edit-phone').val(),
                email: $('#edit-email').val(),
                twitter: $('#edit-twitter').val(),
                facebook: $('#edit-facebook').val(),
                contactId: $('#edit-contact-id').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function () {
            loadContactTables();
        }).error(function (data, status) {
            $.each(data.responseJSON.fieldErrors, function (index, validationError) {
                var errorDiv = '#validate-edit-' + validationError.fieldName;
                $(errorDiv).append(validationError.message).append($('<br>'));
            });
        });
    });
});

function approvePost(id) {
    event.preventDefault();
    $.ajax({
        type: 'GET',
        url: 'approvedpost/' + id
    }).success(function () {
        $('#queued_row_' + id).fadeOut(200);
        setTimeout(function () {
            loadQueuedPosts();
        }, 500);
    });
}

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
                            .append($('<a>')
                                    .attr({
                                        'data-post-id': post.postId,
                                        'data-toggle': 'modal',
                                        'data-target': '#addEditPost'
                                    })
                                    .append($('<span>')
                                            .attr({
                                                'class': 'glyphicon glyphicon-pencil'
                                            })
                                            )
                                    )
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .append($('<span>')
                                            .attr({
                                                'onClick': 'deleteActivePost(' + post.postId + ')',
                                                'class': 'glyphicon glyphicon-trash'
                                            })
                                            )
                                    )
                            )
                    );
        });
    }).error(function (data, status) {
        console.log(data, status);
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
                        .append($('<a>')
                                .attr({
                                    'data-post-id': post.postId,
                                    'data-toggle': 'modal',
                                    'data-target': '#addEditPost'
                                })
                                .append($('<span>')
                                        .attr({
                                            'class': 'glyphicon glyphicon-pencil'
                                        })
                                        )
                                )
                        )
                .append($('<td>')
                        .append($('<a>')
                                .append($('<span>')
                                        .attr({
                                            'onClick': 'deleteActivePost(' + post.postId + ')',
                                            'class': 'glyphicon glyphicon-trash'
                                        })
                                        )
                                )
                        )
                );
    });
}


function loadQueuedPosts() {
    clearAdminTable();
    var adminTable = $('#contentRowsAdmin');
    $.ajax({
        url: "queuedposts"
    }).success(function (data, status) {
        $.each(data, function (index, post) {
            adminTable.append($('<tr>')
                    .attr({
                        'id': 'queued_row_' + post.postId
                    })
                    .append($('<td>')
                            .append($('<a href=adminPage/' + post.postId + '>')
                                    .text(post.title)
                                    )
                            )
                    .append($('<td>').text(post.postDateString))
                    .append($('<td>')
                            .append($('<a>')
                                    .append($('<span>')
                                            .attr({
                                                'onClick': 'approvePost(' + post.postId + ')',
                                                'id': '#approve-button',
                                                'class': 'glyphicon glyphicon-ok'
                                            })
                                            )
                                    )
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-post-id': post.postId
                                    })
                                    .append($('<span>')
                                            .attr({
                                                'data-post-id': post.postId,
                                                'data-toggle': 'modal',
                                                'data-target': '#addEditPost',
                                                'class': 'glyphicon glyphicon-pencil'
                                            })
                                            )
                                    )
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .append($('<span>')
                                            .attr({
                                                'onClick': 'deleteQueuedPost(' + post.postId + ')',
                                                'class': 'glyphicon glyphicon-trash'
                                            })
                                            )
                                    )
                            )
                    );
        });
    }).error(function (data, status) {
        console.log(data, status);
    });
}


function loadRecentPosts() {
    clearRecentTable();
    var rDiv = $('#contentRowsRecent');
    $.ajax({
        url: "recentposts"
    }).success(function (data, status) {
        $.each(data, function (index, post) {
            rDiv.append($('<div>').attr({
                'id': 'contentRowsRecent' + post.postId,
                'class': 'previewDiv',
                'onClick': 'togglePreview(' + post.postId + ');'
            }));
            ($('#contentRowsRecent' + post.postId)).append($('<h2 class="text-center">')
                    .append($('<a href=blogPage/' + post.postId + '>')
                            .text(post.title)
                            )
                    .append($('</h2>')));
            ($('#contentRowsRecent' + post.postId))
                    .append($('<p class="text-center my-2">').text(post.postDateString)
                            .append('</p>')
                            .append($('<p class="my-2">').html(post.postBody))
                            .attr({'style': 'margin-left:2%; margin-right:2%'})
                            )
                    .append($('<br>'));
            ($('#contentRowsRecent' + post.postId + " img").remove());
        });
    }).error(function (data, status) {
        console.log(data, status);
    });
}

function deleteActivePost(id) {
    var answer = confirm("Do you really want to delete this post?");
    if (answer === true) {
        $.ajax({
            type: 'DELETE',
            url: 'post/' + id
        }).success(function () {
            $('#active_row_' + id).fadeOut(200);
            setTimeout(function () {
                loadActivePosts();
            }, 500);
        });
    }
}

function deleteQueuedPost(id) {
    var answer = confirm("Do you really want to delete this post?");
    if (answer === true) {
        $.ajax({
            type: 'DELETE',
            url: 'post/' + id
        }).success(function () {
            $('#queued_row_' + id).fadeOut(200);
            setTimeout(function () {
                loadQueuedPosts();
            }, 500);
        });
    }
}

function clearActiveTable() {
    $('#contentRows').empty();
}

function clearAdminTable() {
    $('#contentRowsAdmin').empty();
}

function clearRecentTable() {
    $('#contentRowsRecent').empty();
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
;

$('#contactModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var contactId = element.data('contact-id');
    var modal = $(this);
    $.ajax({
        type: 'GET',
        url: "contact"
    }).success(function (contact) {
        modal.find('#edit-phone').val(contact.phone);
        modal.find('#edit-email').val(contact.email);
        modal.find('#edit-twitter').val(contact.twitter);
        modal.find('#edit-facebook').val(contact.facebook);
        modal.find('#edit-contact-id').val(contact.contactId);
    });
});

//$('#blogViewModal').on('show.bs.modal', function (event) {
//    var element = $(event.relatedTarget);
//    var postId = element.data('post-id');
//    var modal = $(this);
//    $.ajax({
//        type: 'GET',
//        url: 'post/' + postId
//    }).success(function (post) {
//        modal.find('#post-id').text(post.postId);
//        modal.find('#post-title').text(post.title);
//        modal.find('#post-body').text(post.postBody);
//        modal.find('#post-date').text(post.postDate.toString());
//        modal.find('#post-exp-date').text(post.expDate);
//        var tagsUl = modal.find('#tagsUl');
//        tagsUl.empty();
//        $.each(post.tags, function (index, tags) {
//            tagsUl.append($('<li>').html(tags));
//        });
//    });
//});


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



$('#addEditPost').on('show.bs.modal', function (event) {
//    $('#edit-exp-date').hide();
//    $('#edit-exp-toggle').click(function () {
//        $('#edit-exp-toggle').prop('disabled', true).hide();
//        $('#edit-exp-date').show();
//    });
    var element = $(event.relatedTarget);
    var postId = element.data('post-id');
    var modal = $(this);
    var date_input = $('input[name="date"]');
    var options = {
        format: 'yyyy-mm-dd',
        todayHighlight: true,
        autoclose: true
    };
    date_input.datepicker(options);
    var tagInput = $('#edit-post-tags');
    var tagString = "";

    $.ajax({
        type: 'GET',
        url: 'post/' + postId
    }).success(function (post) {
        if (post.status === true) {
            $('#edit-status').prop('checked', true);
        }
        modal.find('#edit-post-title').val(post.title);
        tinyMCE.get('edit-post-body').setContent(post.postBody);
        modal.find('#edit-post-date').val(post.postDateString);
        modal.find('#edit-exp-date').datepicker('setDate', post.expDateString);
        $.each(post.tags, function (index, tag) {
            tagString += tag + ",";
            tagInput.tagsinput('add', tag);
        });
        modal.find('#edit-post-id').val(post.postId);
    });
});

function togglePreview(id) {
    if ($('#contentRowsRecent' + id).css('height') == '300px') {
        $('#contentRowsRecent' + id).animate({height: "100%"}, 500);
    } else if ($('#contentRowsRecent' + id).css('height') != '300px') {
        $('#contentRowsRecent' + id).animate({height: "300px"}, 300);
    }
}

$('#editStatic').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var staticId = element.data('static-id');
    var modal = $(this);
    $.ajax({
        type: 'GET',
        url: 'static/' + staticId
    }).success(function (staticContent) {
        modal.find('#edit-static-title').val(staticContent.title);
        console.log(staticContent.staticBody);
        tinyMCE.get('edit-static-body').setContent(staticContent.staticBody);
        modal.find('#edit-static-id').val(staticContent.staticId);
    });
});

$('#addStatic').on('show.bs.modal', function (event) {
    //This actually gets used, don't delete.
});

$('#addEditPost').on('hidden.bs.modal', function () {
    $('#edit-post-tags').tagsinput('removeAll');
});

$('#addPost').on('hidden.bs.modal', function () {
    $('#add-post-tags').tagsinput('removeAll');
});

$(document).on('focusin', function (e) {
    if ($(e.target).closest(".mce-window").length) {
        e.stopImmediatePropagation();
    }

});

function clearStaticTable() {
    $('#staticRows').empty();
}

function loadStaticContent() {
    clearStaticTable();
    var staticTable = $('#staticRows');
    $.ajax({
        url: "staticContent"
    }).success(function (data, status) {
        $.each(data, function (index, staticContent) {
            staticTable.append($('<tr>')
                    .attr({
                        'id': 'staticContent_row_' + staticContent.staticId
                    })
                    .append($('<td>')
                            .append($('<a href=staticPage/' + staticContent.staticId + '>')
                                    .text(staticContent.title)
                                    )
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'data-static-id': staticContent.staticId
                                    })
                                    .append($('<span>')
                                            .attr({
                                                'data-static-id': staticContent.staticId,
                                                'data-toggle': 'modal',
                                                'data-target': '#editStatic',
                                                'class': 'glyphicon glyphicon-pencil'
                                            })
                                            )
                                    )
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .append($('<span>')
                                            .attr({
                                                'onClick': 'deleteStaticContent(' + staticContent.staticId + ')',
                                                'class': 'glyphicon glyphicon-trash'
                                            })
                                            )
                                    )
                            )
                    );
        });
    }).error(function (data, status) {
        console.log(data, status);
    });
}

function deleteStaticContent(id) {
    var answer = confirm("Do you really want to delete this page?");
    if (answer === true) {
        $.ajax({
            type: 'DELETE',
            url: 'static/' + id
        }).success(function () {
            $('#staticContent_row_' + id).fadeOut(200);
            setTimeout(function () {
                loadStaticContent();
            }, 500);
        });
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

