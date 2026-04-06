<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Admission Result</title>
</head>
<body>

<h1 style="color: green;">--- Student Admission Result ---</h1>

<p>Name: <c:out value="${name}" /></p>
<p>Roll No.: <c:out value="${rollNo}" /></p>
<p>Total Marks: <c:out value="${totalObtainedMarks}" /></p>
<p>Grade: <c:out value="${grade}" /></p>

</body>
</html>
