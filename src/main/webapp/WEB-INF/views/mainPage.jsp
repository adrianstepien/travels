<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Main page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background: url(/resources/image/background.jpg)">
    <div class="container">
        <a href="<spring:url value="/main/map"/>" id="mapBut" type="button" class="btn btn-primary btn-lg btn-block" style="background: url(/resources/image/map.jpg); height:30%">Map</a>

        <a href="<spring:url value="/main/history"/>" id="historyBut" type="button" class="btn btn-primary btn-lg btn-block" style="background: url(/resources/image/history.jpg); height:30%">History</a>

        <a href="<spring:url value="/main/plan"/>" id="planBut" type="button" class="btn btn-primary btn-lg btn-block" style="background: url(/resources/image/plan.jpg); height:30%">Plan</a>
    </div>
</body>
</html>
