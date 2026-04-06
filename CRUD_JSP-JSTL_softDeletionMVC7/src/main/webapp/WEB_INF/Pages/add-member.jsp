 <%@page isELIgnored="false" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
  <h1 style="color:blue;text-align:center">ADD FORM</h1>
 <center>
 <frm:form action="${pageContext.request.contextPath}/save" method="post" modelAttribute="member"> 
 <table border="1" style="text-align:center" align="center" bgcolor="cyan">
 <tr>
 <td>ID </td>
<td> <frm:input path="id" readonly="true"/></td>
 </tr>
<tr>
 <td>Name </td>
 <td><frm:input path="name"/></td>
 </tr>
 <tr> 
 <td>MemberShip Type </td>
 <td> <frm:input path="membershipType"/></td>
 </tr>
 
 <tr>
 <td>MemberShip Fee </td>
 <td><frm:input path="membershipFee"/> </td>
 </tr>
 <tr>
 <td>ExpiryDate</td>
 <td><frm:input path="expiryDate" type="date"/> </td>
 </tr>
 <tr>
 <td colspan="3"><input type="submit" value="ADD"/></td>
 </tr>
 </table>
 </frm:form>
 </center>