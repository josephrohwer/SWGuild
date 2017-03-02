/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    drawChart();
});

function drawChart() {
    $.get('stats/chart').success(function (data) {
        var dataTable = new google.visualization.DataTable(data);
        var options = {
            title: 'DVDs By Studio',
            vAxis: {title: 'Studio', titleTextStyle: {color: 'red'}},
            hAxis: {title: 'Num DVDs', titleTextStyle: {color: 'red'}}, 'width': 600,
            'height': 500
        };
        var chart =
                new
                google.visualization.BarChart(document.getElementById('chart_div'));
        chart.draw(dataTable, options);
    });
}