
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<h1 style="color: navy;text-align: center;text-decoration: underline;">EMPLOYEE MANAGEMENT SYSTEM</h1>
<center>
<table border="2" style="text-align: center;">
	<tr border="1" cellpadding="10">
		<th>ID</th>
		<th>NAME</th>
		<th>Department</th>
		<th>SALARY</th>
		<th>DESIGNATION</th>
		<th>ACTIONS</th>

	</tr>
	<c:forEach var="emp" items="${empList}">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.department}</td>
			<td>${emp.salary}</td>
			<td>${emp.designation}</td>
			<td><a href="edit/${emp.id}">Edit</a> | <a
				href="delete/${emp.id}">Delete</a></td>
		</tr>
	</c:forEach>
 	
</table>	
</center>
 <p style="text-align:center">

    <c:if test="${pageInfo.hasPrevious()}">
        <a href="report?page=${pageInfo.getPageable().getPageNumber() - 1}">
            previous
        </a> &nbsp; &nbsp;
    </c:if>

    <c:if test="${pageInfo.isFirst()}">
        <a href="report?page=0">first</a> &nbsp; &nbsp;
    </c:if>

    <c:forEach var="i" begin="1" end="${pageInfo.getTotalPages()}" step="1">
        <a href="report?page=${i - 1}">${i}</a> &nbsp;&nbsp;
    </c:forEach>

    <c:if test="${pageInfo.isLast()}">
        <a href="report?page=${pageInfo.getTotalPages() - 1}">
            Last
        </a> &nbsp; &nbsp;
    </c:if>

    <c:if test="${pageInfo.hasNext()}">
        <a href="report?page=${pageInfo.getPageable().getPageNumber() + 1}">
            next 
        </a>
    </c:if>

</p>
  

<hr>
<tr>
		<h2 style="color: fuchsia ;text-align:center">ADD NEW Employee => <a href="add">ADD</a></h2>
	</tr>
<hr>
<h1 style="color:lime;">${msg}</h1> <br>
