<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Save Travels</title>
</head>
<body class="w-6/12 m-auto">
<div class="flex flex-row justify-between items-center">
    <h1 class="text-4xl font-bold">Edit Expense</h1>
    <a href="/expenses" class="underline text-blue-500">Go Back</a>
</div>
<div class="overflow-x-auto relative">
<%--    <div class="w-full border-b bg-gray-800 border-gray-700 mb-4">--%>
    <div class="w-full m-auto">
        <form:form class="border-b bg-gray-800 border-gray-700 px-8 pt-6 pb-8 mb-4 mt-1" action="/expenses/edit/${id}" method="post" modelAttribute="expense">
            <div class="mb-4">
                <form:label path="name" for="name" class="block text-sm font-bold mb-2 text-gray-400">Expense Name</form:label>
                <form:input path="name" id="vendor" class="shadow appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" />
                <form:errors path="name" class="text-red-600"/>
            </div>
            <div class="mb-6">
                <form:label path="vendor" for="vendor" class="block text-sm font-bold mb-2 text-gray-400">Vendor</form:label>
                <form:input path="vendor" id="vendor" type="text" class="shadow appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"/>
                <form:errors path="vendor" class="text-red-600"/>
            </div>
            <div class="mb-4">
                <form:label path="amount" for="amount" class="block text-sm font-bold mb-2 text-gray-400">Amount</form:label>
                <form:input path="amount" id="amount" type="text" class="shadow appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"/>
                <form:errors path="amount" class="text-red-600" />
            </div>
            <div class="mb-6">
                <form:label path="description" for="description" class="block text-sm font-bold mb-2 text-gray-400">Description</form:label>
                <form:input path="description" id="description" type="text" class="shadow appearance-none border w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"/>
                <form:errors path="description" class="text-red-600"/>
            </div>
            <div class="flex items-center justify-between">
                <button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 focus:outline-none focus:shadow-outline" type="submit">Submit</button>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>