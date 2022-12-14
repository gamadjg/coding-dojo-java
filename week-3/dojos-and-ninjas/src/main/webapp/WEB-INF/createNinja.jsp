<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Create Ninja</title>
</head>

<body class="w-6/12 m-auto">
    <div class="flex flex-col items-center">
        <h1 class="text-4xl font-bold">Create New Ninja</h1>
        <form:form action="/ninjas/new" method="post" modelAttribute="ninja" class="text-sm uppercase bg-gray-700 m-auto w-full mt-4 shadow-md rounded px-8 pt-6 pb-8 mb-4">
            <div class="mb-4">
                <form:label path="firstName" for="firstName" class="block text-gray-400 text-sm font-bold mb-2">First Name</form:label>
                <form:input path="firstName" class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" />
                <form:errors path="firstName" class="text-red-600"/>
            </div>
            <div class="mb-6">
                <form:label path="lastName" for="lastName" class="block text-gray-400 text-sm font-bold mb-2">Last Name</form:label>
                <form:input path="lastName" id="lastName" type="text" class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"/>
                <form:errors path="lastName" class="text-red-600"/>
            </div>
            <div class="mb-4">
                <form:label path="age" for="age" class="block text-gray-400 text-sm font-bold mb-2">Age</form:label>
                <form:input path="age" id="age" type="number" class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"/>
                <form:errors path="age" class="text-red-600" />
            </div>
            <div class="mb-4">
                <form:label path="firstName" for="firstName" class="block text-gray-400 text-sm font-bold mb-2">Dojo</form:label>
                <form:select path="dojo">
                    <c:forEach var="dojo" items="${dojos}">
                        <form:option value="${dojo.id}" path="dojo">
                            <c:out value="${dojo.name}"/>
                        </form:option>
                    </c:forEach>
                </form:select>
            </div>
            <div class="flex items-center justify-between">
                <button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline" type="submit">
                    Create
                </button>
            </div>
        </form:form>
    </div>
</body>
</html>