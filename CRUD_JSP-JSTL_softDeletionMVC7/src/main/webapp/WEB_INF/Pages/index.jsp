<%@page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style="color:red;text-align:center">GYM MANAGEMENT SYSTEM</h1>
<hr>
<h2 style="color:orange;text-align:center">GYM MEMBERS</h2>
<div style="text-align:center"><a href="add">Add Member</a> | <a href="expired">Expired Members</a></div>
<center>
<table border="1" style="text-align:center">
<tr>
<th>ID</th>
<th>Name</th>
<th>Type</th>
<th>Amount</th>
<th>Expiry Date</th>
<th>Actions</th>
</tr>

<c:forEach var="m" items="${listOfMembers}">  
 <tr>
 <td>${m.id}</td>
 <td>${m.name}</td>
 <td>${m.membershipType}</td>
 <td>${m.membershipFee}</td>
 <td>${m.expiryDate}</td>
 <td>
 <a href="edit/${m.id}">EDIT</a> |
 <a href="delete/${m.id}">DELETE</a>
 </td>
 </tr>
</c:forEach>
</table>
</center>