<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GetAllEmployees</title>
</head>
<body>
    <form action="/FirstJSPproject/EmployeeServlet" method="get">

        <div>
            Do you want to view all employee details: <input type=submit
                name="input" value="yes"> <input type=submit name="input"
                value="no">
        </div>

    </form>
</body>
</html>