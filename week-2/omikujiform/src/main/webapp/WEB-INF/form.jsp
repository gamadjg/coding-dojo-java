<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Omikuji Form</title>
	<script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="flex flex-col items-center">
    <h3 class="text-3xl p-5">Send an Omikuji</h3>
    <form action='/processResults' method='post' class="flex flex-col border border-black p-5">
		<label>Pick any number between 5 and 25:</label>
	    <input type="number" name='theNum' class="border border-black">

		<label>Enter a city name:</label>
	    <input type="text" name='cityName' class="border border-black">
		
		<label>Enter a person's name</label>
	   	<input type='text' name='personName' class="border border-black">
	   	
	   	<label>Enter a Hobby</label>
	   	<input type='text' name='hobby' class="border border-black">
	   	
	   	<label>Enter the name of an object</label>
	   	<input type='text' name='objectName' class="border border-black">
	   	
	   	<label>Say something nice to someone</label>
	   	<textarea rows="4" cols="4" name="somethingNice" class="border border-black"></textarea>
	   	
	   	<button type='submit' class="border border-black mt-5 w-2/4">Submit</button>
    </form>
</body>
</html>