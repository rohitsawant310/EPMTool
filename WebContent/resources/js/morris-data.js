$(function() {

    function getDatForBarChart() {
    	console.log("getDatForChart");
        $
                .ajax({
                    contentType : "application/json",
                    url : "totalTasksDayWise",
                    dataType : 'JSON',
                    type : 'GET',
                    //timeout : 10000,
                    success : function(response){
                        var taskPerDay=[];
                        for (var key in response) {
                            if (response.hasOwnProperty(key)) {
                            	taskPerDay.push({"Day":key,"Count":response[key]});
                            }
                        }
                        Morris.Bar({
                            element: 'morris-bar-chart',
                            data: taskPerDay,
                            xkey: 'Day',
                            ykeys: ['Count'],
                            labels: ['Task Count'],
                            resize: true
                        });  
                        
                        Morris.Line({
                            element: 'morris-line-chart',
                            data: taskPerDay,
                            xkey: 'Day',
                            ykeys: ['Count'],
                            labels: ['Task Count'],
                            lineColors: ['#E65A26','#373651'],
                            resize: true
                        });
                    },
                    error : function() {
                        alert('Error');
                    }
                });
    };
    
    function getDatForDonutChart() {
        $
                .ajax({
                    contentType : "application/json",
                    url : "totalTaskTypeWiseWork",
                    dataType : 'JSON',
                    type : 'GET',
                    //timeout : 10000,
                    success : function(response){
                        var taskType=[];
                        for (var key in response) {
                            if (response.hasOwnProperty(key)) {
                            	taskType.push({"label":key,"value":response[key]});
                            }
                        } 
                        Morris.Donut({
                            element: 'morris-donut-chart',
                            data: taskType,
                            labelColor: "#9CC4E4",
                            colors: ['#E53935', 'rgb(0, 188, 212)', 'rgb(255, 152, 0)', 'rgb(0, 150, 136)'],
                            resize: true
                        });
                    },
                    error : function() {
                        alert('Error');
                    }
                });
    };
    getDatForBarChart();
    getDatForDonutChart();
});
