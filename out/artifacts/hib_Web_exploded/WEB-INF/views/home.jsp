<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<div id="mainContainer">
    <div id="mainRow">
        <section id="main">
            <h1>Главная страница</h1>
            <p>
                USD: ${USD} <br/>
                <br>
                Сведения об организации.
            </p>
            <h2>Статическая HTML-страница</h2>
        </section>
    </div> <!-- mainRow -->
</div> <!-- mainContainer -->

<table class="table-bordered">
    <tr>
        <th>ID:</th>
        <th>age:</th>
        <th>name</th>

    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.id}"/></td>
            <td><c:out value="${book.age}"/></td>
            <td><c:out value="${book.name}"/></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>

