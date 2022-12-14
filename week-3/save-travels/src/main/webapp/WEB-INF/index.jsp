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
    <h1 class="text-4xl font-bold">Save Travels</h1>
    <div class="overflow-x-auto relative">
        <div class="w-full border-b bg-gray-800 border-gray-700 mb-4">
            <table class="w-full text-sm text-left text-gray-400">
                <thead class="text-xs text-gray-400 uppercase bg-gray-700">
                    <tr>
                        <th scope="col" class="py-4 px-6">Id</th>
                        <th scope="col" class="py-4 px-6">Name</th>
                        <th scope="col" class="py-4 px-6">Vendor</th>
                        <th scope="col" class="py-4 px-6">Amount</th>
                        <th scope="col" class="py-4 px-6">Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="expense" items="${allExpenses}" >
                        <tr class="border-b bg-gray-800 border-gray-700">
                            <td class="py-4 px-6"><c:out value="${expense.id}" /></td>
                            <td class="py-4 px-6">
                                <a href='/expenses/show/<c:out value="${expense.id}"/>' class="underline text-blue-500">
                                    <c:out value="${expense.name}" />
                                </a>
                            </td>
                            <td class="py-4 px-6"><c:out value="${expense.vendor}" /></td>
                            <td class="py-4 px-6">$<c:out value="${expense.amount}" /></td>
                            <td class="py-4 px-6 flex flex-row items-center justify-between underline text-blue-500">
                                <a href="/expenses/edit/<c:out value="${expense.id}"/>">Edit</a>
                                <form action="/expenses/delete/${expense.id}" method="post">
        <%--                            <input type="hidden" name="_method" value="delete">--%>
                                    <button type="submit" name="_method" class="text-red-500">DELETE</button>
<%--                                    <input type="submit" name="_method" value="Delete">--%>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="w-full m-auto">
            <h1 class="text-3xl font-bold">Enter new expense</h1>
            <form:form class="border-b bg-gray-800 border-gray-700 px-8 pt-6 pb-8 mb-4 mt-1" action="/expenses/new" method="post" modelAttribute="expense">
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
                    <button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 focus:outline-none focus:shadow-outline" type="submit">Create</button>
                </div>
            </form:form>
        </div>
    </div>
</body>
</html>