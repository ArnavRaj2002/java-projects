<%@page isELIgnored="false" %>  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Student Registration Form</h2>
<Form action="dispaly3" method="post">
<table align="center" bgcolor="cyan">
<tr>
<td> ID</td>
<td><input type="text" name="id"> </td>
</tr>

<tr>
<td> Name</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td> AGE </td>
<td><input type="text" name="age"></td>
</tr>

<tr>
<td>Country </td>
<td><input type="text" name="country"> </td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="REGISTER !!"> </td>
</tr>
</table>
</Form>