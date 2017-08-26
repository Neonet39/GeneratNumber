<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resourses/css/style.css"/>" rel="stylesheet">
</head>
<body>

<div class="content">
    <div id="header">

        <div class="logo">
            <a href="#"></a>
        </div>

        <div class="menu">
            <a class="menu_content_1" href="#"></a>
        </div>

    </div>

    <div class="central_content">
        <h1 id="conteption">Случайное число:</h1>

        <div class="number">
            <h1 class="number_general">80</h1>
        </div>

        <div id="btn">
            <a href="#"></a>
        </div>

        <div id="beetwin">

            <p>от <input type="text" id="start_number" name="start_number"/>
                до <input type="text" id="end_number" name="end_number" name="end_number"></p>
        </div>

        <div id="footer">

        </div>


    </div>

</div>

</body>
</html>
