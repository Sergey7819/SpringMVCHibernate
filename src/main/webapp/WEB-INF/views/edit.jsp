<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Person</title>
</head>
<body>
<div align="center">
    <h2>Edit Person</h2>
    <form:form action="update" method="post" modelAttribute="person">
        <table>
            <tr>
                <td>ID: </td>
                <td>${person.id}
                    <form:hidden path="id"/>

                </td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Age: </td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Update"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>