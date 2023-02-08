<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>People</title>
</head>
<body>
<div align="center">
    <h2>People</h2>

    <h3><a href="/new">New Person</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>E-mail</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${allPeople}" var="person">
            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.age}</td>
                <td>${person.email}</td>
                <td>
                    <a href="/edit?id=${person.id}">Edit</a>

                    <a href="/delete?id=${person.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>