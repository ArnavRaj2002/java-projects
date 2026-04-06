<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<frm:form action="${pageContext.request.contextPath}/employee/save" method="post" modelAttribute="employee">
  <table align="center" bgcolor="yellow"> 
  <tr>
  <td>ID</td>
  <td><frm:input path="id"/></td>
  </tr>
  
  <tr>
  <td>NAME</td>
  <td><frm:input path="name"/></td>
  </tr>
  
  <tr>
  <td>DEPARTMENT</td>
  <td><frm:input path="department"/> </td>
  </tr>
  
  <tr>
  <td>SALARY</td>
  <td><frm:input path="salary"/></td>
  </tr>
  
  <tr>
  <td>DESIGNATION</td>
  <td><frm:input path="designation"/></td>
  </tr>
  <tr>
  <td><input type="submit" value="REGISTER!!">  </td>
  </tr>
  </table>
</frm:form>