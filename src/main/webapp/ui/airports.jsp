<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Аэропорты</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <td>Код аэропорта</td>
                <td>Название</td>
                <td>Город</td>
                <td>Координаты</td>
                <td>Временная зона</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${allAirport}" var="item">
                <tr>
                    <td>${item.airportCode}</td>
                    <td>${item.airportName}</td>
                    <td>${item.city}</td>
                    <td>${item.coordinates}</td>
                    <td>${item.timezone}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>