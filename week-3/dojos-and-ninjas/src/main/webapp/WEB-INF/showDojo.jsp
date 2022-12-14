<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Dojo</title>
</head>
<body class="w-6/12 m-auto">
<div class="flex flex-row justify-between items-center mt-4 mb-4">
    <h1 class="text-4xl font-bold"><c:out value="${dojo.name}"/></h1>
    <a href="/dojos" class="underline text-blue-500 font-bold">Home</a>
</div>
<table class="text-sm text-left text-gray-500 dark:text-gray-400 w-full m-auto">
    <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
    <tr>
        <th scope="col" class="py-4 px-6">First Name</th>
        <th scope="col" class="py-4 px-6">Last Name</th>
        <th scope="col" class="py-4 px-6">Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="ninja" items="${dojo.ninjas}" >
        <tr class="bg-white border-b dark:bg-gray-800 dark:border-gray-700">
            <td class="py-4 px-6"><c:out value="${ninja.firstName}"/></td>
            <td class="py-4 px-6"><c:out value="${ninja.lastName}"/></td>
            <td class="py-4 px-6"><c:out value="${ninja.age}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>