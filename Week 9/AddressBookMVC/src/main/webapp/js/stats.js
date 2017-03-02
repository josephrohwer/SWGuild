/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    drawChart();
});
// #2: draw the bar chart
function drawChart() {
    $.get('stats/chart').success(function (data) {

        var dataTable = new google.visualization.DataTable(data); 

                var options = {
                    title: 'Addresses By State',
                    vAxis: {title: 'State', titleTextStyle: {color: 'red'}},
                    hAxis: {title: 'Num Addresses', titleTextStyle: {color: 'red'}}, 'width': 500,
                    'height': 400
                };
                var chart =
                new
                google.visualization.BarChart(document.getElementById('chart_div'));
        
        chart.draw(dataTable, options);
    });
};
