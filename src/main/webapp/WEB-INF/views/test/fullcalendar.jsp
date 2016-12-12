<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/include.jsp"%>
<html>
<head>
    <title>fullcalendar页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${ctx}/resources/plugins/fullcalendar/fullcalendar.css">
    <link rel="stylesheet" href="${ctx}/resources/plugins/fullcalendar/fullcalendar.print.css" media="print">
</head>
<body>
<div class="col-md-9">
    <div class="box box-primary">
        <div class="box-body no-padding">
            <div id="calendar"></div>
        </div>
    </div>
</div>
</body>
<script src="${ctx}/resources/plugins/moment/moment.min.js"></script>
<script src="${ctx}/resources/plugins/fullcalendar/fullcalendar.js"></script>
<script>

    var date = new Date();
    var d = date.getDate(),
            m = date.getMonth(),
            y = date.getFullYear();

    $('#calendar').fullCalendar({
        header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay'
        },
        buttonText: {
            today: 'today',
            month: 'month',
            week: 'week',
            day: 'day'
        },
        events: [
            {
                title: 'All Day Event',
                start: new Date(y, m, 1),
                backgroundColor: "#f56954", //red
                borderColor: "#f56954" //red
            },
            {
                title: 'Long Event',
                start: new Date(y, m, d - 5),
                end: new Date(y, m, d - 2),
                backgroundColor: "#f39c12", //yellow
                borderColor: "#f39c12" //yellow
            },
            {
                title: 'Meeting',
                start: new Date(y, m, d, 10, 30),
                allDay: false,
                backgroundColor: "#0073b7", //Blue
                borderColor: "#0073b7" //Blue
            },
            {
                title: 'Lunch',
                start: new Date(y, m, d, 12, 0),
                end: new Date(y, m, d, 14, 0),
                allDay: false,
                backgroundColor: "#00c0ef", //Info (aqua)
                borderColor: "#00c0ef" //Info (aqua)
            },
            {
                title: 'Birthday Party',
                start: new Date(y, m, d + 1, 19, 0),
                end: new Date(y, m, d + 1, 22, 30),
                allDay: false,
                backgroundColor: "#00a65a", //Success (green)
                borderColor: "#00a65a" //Success (green)
            },
            {
                title: 'Click for Google',
                start: new Date(y, m, 28),
                end: new Date(y, m, 29),
                url: 'http://google.com/',
                backgroundColor: "#3c8dbc", //Primary (light-blue)
                borderColor: "#3c8dbc" //Primary (light-blue)
            }
        ],
        editable: true,
        droppable: true, // this allows things to be dropped onto the calendar !!!
        drop: function (date, allDay) { // this function is called when something is dropped

            var originalEventObject = $(this).data('eventObject');

            var copiedEventObject = $.extend({}, originalEventObject);

            copiedEventObject.start = date;
            copiedEventObject.allDay = allDay;
            copiedEventObject.backgroundColor = $(this).css("background-color");
            copiedEventObject.borderColor = $(this).css("border-color");

            $('#calendar').fullCalendar('renderEvent', copiedEventObject, true);

            if ($('#drop-remove').is(':checked')) {
                $(this).remove();
            }
        }
    });
</script>
</html>
