<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h2 style="text-align:center">EDIT FORM</h2>

<form:form method="post"
           modelAttribute="employee"
           action="${pageContext.request.contextPath}/employee/update">
    <table style="margin:0 auto; background-color:pink;" border="1" cellpadding="8">

        <tr>
            <td>ID</td>
            <td><form:input path="id" readonly="true"/></td>
        </tr>

        <tr>
            <td>NAME</td>
            <td><form:input path="name"/></td>
        </tr>

        <tr>
            <td>DEPARTMENT</td>
            <td><form:input path="department"/></td>
        </tr>

        <tr>
            <td>SALARY</td>
            <td><form:input path="salary"/></td>
        </tr>

        <tr>
            <td>DESIGNATION</td>
            <td><form:input path="designation"/></td>
        </tr>

        <tr>
            <td colspan="2" style="text-align:center;">
                <input type="submit" value="UPDATE"/>
            </td>
        </tr>

    </table>
</form:form>
