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
    });
}

function displaySearchPosts(data, status) {
    clearActiveTable();
    var pTable = $('#contentRows');
    $.each(data, function (index, post) {
        pTable.append($('<tr>')
                .attr({
                    'id': 'active_row_' + post.postId,
                    'onClick': 'togglePreviewNewsfeed(' + post.postId + ');'
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
                            'style': 'float:right'
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