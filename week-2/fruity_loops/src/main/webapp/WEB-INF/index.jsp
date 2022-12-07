<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
<%--    <link rel="stylesheet" type="text/css" href="/css/styles.css">--%>
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Fruit Store</title>
</head>
<body class="w-6/12 m-auto">
    <h1 class="text-3xl font-bold underline text-center">Fruit Store</h1>
    <div class="overflow-x-auto relative">
        <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400">
            <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                <tr>
                    <th scope="col" class="py-4 px-6">Name</th>
                    <th scope="col" class="py-4 px-6">Price</th>
                </tr>
            </thead>
        <tbody>
            <c:forEach var="fruit" items="${fruits}" >
                <tr class="bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                    <td class="py-4 px-6"><c:out value="${fruit.name}" /></td>
                    <td class="py-4 px-6"><c:out value="${fruit.price}" /></td>
                </tr>
            </c:forEach>
        </tbody>
        </table>
    </div>
</body>
</html>