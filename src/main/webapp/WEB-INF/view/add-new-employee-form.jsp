<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: a18512683
  Date: 27.10.2021
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form action="/spring_course_mvc_hibernate_aop/saveEmployee" modelAttribute="employee">

       Id<form:hidden path="id" />

        Name<form:input path="name"/>
        <br><br>
        Surname<form:input path="surname"/>
        <br><br>
        Department<form:input path="department" />
        <br><br>
        Salary<form:input path="salary" />
        <br><br>

        <input type="submit" value="Add">
    </form:form>

</body>
</html>
