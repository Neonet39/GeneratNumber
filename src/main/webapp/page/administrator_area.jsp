<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <p></p>

    <c:if test="${number!=null}">
        <p>Текущее установленное число : ${number}</p>
    </c:if>
    <br>
    <form method="get" action="/personal/administrator_set_param">
        <p>Установите число: <input type="text" name="number"> </p>
        <p>Установить генерацию числа на заданную <input type="radio" name="metodNull" value="false" checked>  </p>
        <p>Затереть значение / свободно генерировать числа <input type="radio" name="metodNull" value="true"> </p>

        <input type="submit"  value="Применить данные">
    </form>

</body>
</html>
