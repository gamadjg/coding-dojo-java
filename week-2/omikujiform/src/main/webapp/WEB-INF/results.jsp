<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<script src="https://cdn.tailwindcss.com"></script>
	<title>Omikuji Form</title>
</head>
<body class="flex flex-col items-center">
	<h1 class="text-3xl">Here's Your Omikuji</h1>
	<div class="border border-black">
		<p class="max-w-sm break-words p-2">
			In <c:out value="${theNum}"/> years you will live in <c:out value="${cityName}" />
		 	with <c:out value="${personName}"/> as your roomate, <c:out value="${hobby}" /> 
		 	for a living. The next time you see a <c:out value="${objectName}" /> you will have good luck.
		 	Also, <c:out value="${somethingNice}" />.
		 </p>
	</div>
	<a href="/">Go Back</a>
</body>
</html>