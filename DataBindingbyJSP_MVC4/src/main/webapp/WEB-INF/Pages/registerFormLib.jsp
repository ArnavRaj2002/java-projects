<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<h2>Student Registration Form</h2>
<frm:form action="dispaly3" method="post" modelAttribute="stu">
<table align="center" bgcolor="cyan"> 
<tr>
<td> ID</td>
<td><frm:input path="id"/> </td>
</tr>

<tr>
<td> Name</td>
<td><frm:input path="name"/></td>
</tr>

<tr>
<td> AGE </td>
<td> <frm:input path="age"/> </td>
</tr>

<tr>
<td>Country </td>
<td><frm:input path="country"/> </td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="REGISTER !!"> </td>
</tr>
</table>
</frm:form>