<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Hoppers Receipt</title>
</head>
<body>
    <h1>Customer Name: <c:out value="${receipt['name']}" /></h1>
    <p>Item Name: <c:out value="${receipt['itemName']}"/></p>
    <p>Price: $<c:out value="${receipt['price']}"/></p>
    <p>Description: <c:out value="${receipt['description']}"/></p>
    <p>Vendor: <c:out value="${receipt['vendor']}"/> </p>
</body>
</html>