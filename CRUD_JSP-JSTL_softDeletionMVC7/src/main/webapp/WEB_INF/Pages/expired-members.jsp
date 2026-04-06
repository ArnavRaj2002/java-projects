 <%@page isELIgnored="false" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <h1 style="color:blue;text-align:center">Expired Members</h1>
 
 <c:forEach var="m" items="${expDate}">
 <h1>${m.id}</h1>
 <h1>${m.name}</h1>
 <h1>${m.membershipType}</h1>
 <h1>${m.membershipFee}</h1>
 <h1>${m.expiryDate}</h1>
 </c:forEach>