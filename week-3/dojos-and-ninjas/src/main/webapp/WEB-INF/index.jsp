<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>  
<html lang="en">  
<head>  
    <meta charset="UTF-8"/>  
    <script src="https://cdn.tailwindcss.com"></script>  
    <title>Title</title>  
</head>

<body class="w-6/12 m-auto">
    <div class="flex flex-row items-center justify-end gap-2 mt-4">
        <a href="/dojos/new" class="underline text-blue-500">Create new dojo</a>
        <a href="/ninjas/new" class="underline text-blue-500">Create new ninja</a>
    </div>
    <table class="text-sm text-gray-400 text-center m-auto w-full mt-4">
        <thead class="text-xs text-gray-400 uppercase bg-gray-700">
            <tr>
                <th scope="col" class="py-4 px-6 text-xl">All Dojos</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="dojo" items="${dojos}" >
                <tr class="bg-white border-b dark:bg-gray-800 dark:border-gray-700">
                    <td class="py-4 px-6">
                        <a href="/dojos/<c:out value="${dojo.id}"/>" class="underline text-blue-500">
                            <c:out value="${dojo.name}"/>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>