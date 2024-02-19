<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <title>Результат сортировки</title>
</head>
<body>
    <h1>Отсортированный массив:</h1>
    <% int[] sortedNumbers = (int[]) request.getAttribute("sortedNumbers"); %>
    <% for (int number : sortedNumbers) { %>
        <p><%= number %></p>
    <% } %>
</body>
</html>