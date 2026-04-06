<%@page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<h1 style="color:red;text-align:center">MOVIE MANAGEMENT SYSTEM</h1>
<hr>
<h2 style="color:orange;text-align:center">MOVIES</h2>
<div style="text-align:center"><a href="add">Add Movie</a></div>   
<center>
<table border="1" style="text-align:center">
<tr>
<th>ID</th>
<th>Name</th>
<th>genre</th>
<th>rating </th>
<th>releaseYear</th>
<th>Actions</th>
</tr>

<c:forEach var="m" items="${movieList}">  
 <tr>
 <td>${m.movieId}</td>
 <td>${m.title}</td>
 <td>${m.genre}</td>
 <td>${m.rating}</td>
 <td>${m.releaseYear}</td>  
 <td>
 
 <a href="edit/${m.movieId}">EDIT</a> |
 <a href="delete/${m.movieId}">DELETE</a>
 </td>
 </tr>
</c:forEach>
</table>
</center>