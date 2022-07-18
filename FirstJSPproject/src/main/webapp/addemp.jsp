<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Emp</title>
</head>
<body>
<form action="AddEmployee" method="post">
<div>
<label for="name">Name:</label>
<input id="name" type="text" placeholder="Enter Name">
</div>
<div>
<label for="city">City:</label>
<input id="city" type="text" placeholder="Enter City">
</div>
<label for="salary">Salary:</label>
<input id="salary" type="text" placeholder="Enter Salary">
<input type="submit" value="add">
</form>
</body>
</html>