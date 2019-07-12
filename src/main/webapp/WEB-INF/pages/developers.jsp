<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="en">
<head>
    <title>Developers</title>

    <style>
        th, td {
            padding: 5px;
        }
    </style>

</head>

<body>

<h2>Developers</h2>
<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Second Name</th>
    </tr>
    <c:forEach var="d" items="${developers}">
        <tr>
            <td
            >${d.id}</td>
            <td>${d.firstName}</td>
            <td>${d.secondName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>