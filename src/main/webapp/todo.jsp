<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<title>Todo</title>
<head>

</head>
<body>
<p class="fs-1 text-center">Welcome To Todo Application</p>
    <%
        if(session.getAttribute("id") == null){
             response.sendRedirect(request.getContextPath());
        }
    %>
    <form action="todo" method="post">
        <p class="text-center fs-5">Enter Todo: <input class="input mb-3" type="text" name="todo" value="${todo.todo}"/>
        <input class="btn btn-outline-secondary mb-1" type="submit" value="Add" />
    </form>
    <c:if test="${todos.size() eq 0}">
        <p>No Items to display</p>
    </c:if>
    <c:if test="${todos.size() gt 0}">
        <table class="table table-hover container">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Todo</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="todo" items="${todos}">
                        <tr>
                            <td>
                                <c:out value="${todo.id}" />
                            </td>
                            <td>
                                <c:out value="${todo.todo}" />
                            </td>
                            <td><a class="btn btn-danger me-2" href="todo?id=<c:out value='${todo.id}'/>">Delete</a><a class="btn btn-primary " href="todo?id=<c:out value='${todo.id}'/>">Edit</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </c:if>
   <form action="logout.jsp" method="link" class="d-flex justify-content-end me-5">
        <input class="btn btn-warning" type="submit" value="Logout"/>
    </form>
</body>
</html>
