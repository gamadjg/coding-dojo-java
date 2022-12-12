<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <script src="https://cdn.tailwindcss.com"></script>
    <title>${book.title}</title>
</head>
<body class="w-6/12 m-auto">
    <div class="overflow-x-auto relative">
	   <h1 class="text-3xl font-bold">${book.title}</h1>
       <p>Description: <c:out value="${book.description}" /></p>
       <p>Language: <c:out value="${book.language}" /></p>
       <p>Pages: <c:out value="${book.numberOfPages}" /></p>
    </div>
</body>
</html>