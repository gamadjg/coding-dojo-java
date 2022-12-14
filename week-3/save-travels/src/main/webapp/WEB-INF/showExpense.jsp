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
    <h1 class="text-4xl font-bold">Expense Details</h1>
    <a href="/expenses" class="underline text-blue-500">Go Back</a>
</div>

<div class="overflow-x-auto relative">
    <div class="w-full m-auto">
        <div class="border-b bg-gray-800 border-gray-700 px-8 pt-6 pb-8 mb-4 mt-1">
            <p class="block text-sm font-bold mb-2 text-gray-400">Expense Name: <c:out value="${expense.name}" /> </p>
            <p class="block text-sm font-bold mb-2 text-gray-400">Vendor Name: <c:out value="${expense.vendor}" /> </p>
            <p class="block text-sm font-bold mb-2 text-gray-400">Amount: $<c:out value="${expense.amount}" /> </p>
            <p class="block text-sm font-bold mb-2 text-gray-400">Description: <c:out value="${expense.description}" /> </p>
        </div>
    </div>
</div>
</body>
</html>