<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>

<h2>Enter Student Details</h2>

<form:form action="studentGradeCalculator" method="post" modelAttribute="student">

    <p>Name: 
        <form:input path="name" required="true" />
    </p>

    <p>Roll No: 
        <form:input path="rollNo" required="true" />
    </p>

    <p>Marks 1: 
        <form:input path="marks1" required="true" />
    </p>

    <p>Marks 2: 
        <form:input path="marks2" required="true" />
    </p>

    <p>Marks 3: 
        <form:input path="marks3" required="true" />
    </p>

    <input type="submit" value="Submit Student" />

</form:form>

</body>
</html>
