<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Create Dojo</title>
</head>

<body class="w-6/12 m-auto">
    <div class="flex flex-col items-center">
        <h1 class="text-4xl font-bold">Create New Dojo</h1>
        <form:form class="text-sm uppercase bg-gray-700 m-auto w-full mt-4 shadow-md rounded px-8 pt-6 pb-8 mb-4" action="/dojos/new" method="post" modelAttribute="dojo">
            <div class="mb-4">
                <form:label path="name" for="name" class="block text-gray-400 text-sm font-bold mb-2">Dojo Name</form:label>
                <form:input path="name" id="name" type="text" class="shadow appearance-none border rounded w-full py-2 px-3 leading-tight focus:outline-none focus:shadow-outline"/>
                <form:errors path="name" class="text-red-600"/>
            </div>
            <div class="flex items-center justify-between">
                <button type="submit" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline">
                    Create
                </button>
            </div>
        </form:form>
    </div>
</body>
</html>