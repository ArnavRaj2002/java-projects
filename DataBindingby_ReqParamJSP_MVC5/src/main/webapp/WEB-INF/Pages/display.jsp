<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Sno: <c:out value="${NO}"/></h2>  
<h2>Name: <c:out value="${NAME}"/></h2>

<p>Using EL: ${NAME}</p>
<p>Output ::</p>
${NAME}