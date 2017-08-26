
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
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
            <a href="/number/generating_numbers"></a>
        </div>

        <div class="menu">
            <a class="menu_content_1" href="/number/generating_numbers"></a>
        </div>

    </div>

    <div class="central_content">
        <h1 id="conteption">Случайное число:</h1>

        <div class="number">
            <h1 class="number_general">${number}</h1>
        </div>


        <spring:form method="post"  modelAttribute="numberModel" action="/number/generating_numbers">
            <div id="btn">
                 <spring:button ></spring:button>
            </div>

            <div id="beetwin">
                <p>от <spring:input path="oneNumber" type="text" id="start_number"/>
                 до <spring:input path="toNumber" type="text" id="end_number" /></p>
            </div>
        </spring:form>
        <div id="footer">

        </div>


    </div>

</div>

</body>
</html>