<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Add Movie</title>
</head>
<body>

<h1 style="color:blue; text-align:center">ADD FORM</h1>

<center>
    <frm:form action="/save"
              method="post"
              modelAttribute="movie"> 

        <table border="1" style="text-align:center; margin:0 auto; background-color:cyan;">

            <tr>
                <td>ID</td>
                <td><frm:input path="movieId"   /></td>
            </tr>

            <tr>
                <td>Title</td>
                <td>
                    <frm:input path="title" />
                    <br><frm:errors path="title" />
                </td>
            </tr>

            <tr>
                <td>Genre</td>
                <td>
                    <frm:input path="genre" />
                    <br><frm:errors path="genre" />
                </td>
            </tr>

            <tr>
                <td>Rating</td>
                <td>
                    <frm:input path="rating" />
                    <br><frm:errors path="rating" />
                </td>
            </tr>

            <tr>
                <td>Release Year</td>
                <td>
                    <frm:input path="releaseYear" />
                    <br><frm:errors path="releaseYear" />
                </td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" value="ADD" /></td>
            </tr>

        </table>

    </frm:form>
</center>

</body>
</html>
