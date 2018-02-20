/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    drawChart();
});

function drawChart() {
    // #3: dummy data - will be replaced with Ajax call
    var data = google.visualization.arrayToDataTable([
        ['DVD', 'Revenue in millions'],
        ['Interstellar', 675.1],
        ['Donnie Darko', 7.3],
        ['The Martian', 630.2],
        ['Terminator', 519.8],
        ['The Lord of the Rings: The Two Towers', 926]
    ]);
    // #4: this sets up the size of the chart, the main title, and the axis titles
    var options = {
        title: 'DVD Revenue',
        vAxis: {title: 'Movie', titleTextStyle: {color: 'red'}},
        hAxis: {title: 'Box Office ($USm) ', titleTextStyle: {color: 'red'}},
        'width': 600,
        'height': 500
    };
    // #5: create a new BarChart object, handing it the div into which we want it to render
    var chart = new google.visualization.BarChart(document.getElementById('chart_div'));
    // #6: tell the chart to draw itself
    chart.draw(data, options);
}
;