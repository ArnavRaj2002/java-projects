<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="color:blue;text-align:center">EDIT FORM</h1>
<center>

<frm:form action="${pageContext.request.contextPath}/update" method="post" modelAttribute="editMovie">
<table border="1" style="text-align:center">

<tr>
    <td>ID </td>
    <td>
        <frm:input path="movieId" type="hidden" />
        <frm:input path="movieId"/>
    </td>
</tr>

<tr>
    <td>Title</td>
    <td><frm:input path="title" /></td>
    <br><frm:errors path="title" cssClass="error"/>
</tr>

<tr>
    <td>Genre</td>
    <td><frm:input path="genre" /></td>
    <br><frm:errors path="genre" cssClass="error"/>
</tr>

<tr>
    <td>Rating</td>
    <td><frm:input path="rating" /></td>
</tr>

<tr>
    <td>Release Year</td>
    <td><frm:input path="releaseYear" /></td>
</tr>

<tr>
    <td colspan="3"><input type="submit" value="EDIT" /></td>
</tr>

</table>
</frm:form>

</center>
