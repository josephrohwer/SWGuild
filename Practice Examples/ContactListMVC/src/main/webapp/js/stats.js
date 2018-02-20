/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// #1: document ready
$(document).ready(function () {
    drawChart();
});
// #2: draw the bar chart
function drawChart() {
    $.get('stats/chart').success(function (data) {
        var dataTable = new google.visualization.DataTable(data);
   
    var options = {
        title: 'Contacts By Company',
        vAxis: {title: 'Company', titleTextStyle: {color: 'red'}},
        hAxis: {title: 'Num Contacts', titleTextStyle: {color: 'red'}},
        'width': 500,
        'height': 400
    };
    
    // #5: create a new BarChart object, handing it the div into which we want it to render
    var chart = new google.visualization.BarChart(document.getElementById('chart_div'));
    // #6: tell the chart to draw itself
    chart.draw(dataTable, options);
    });
};
