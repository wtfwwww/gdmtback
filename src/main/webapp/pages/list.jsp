<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<tr>
<th>UID</th>
<th>rid</th>
<th>rname</th>
</tr>
<c:forEach items="${role}" var="u">
<tr>
<th>${role.roleUuid}</th>
<th>${role.roleId }</th>
<th>${role.roleName }</th>
</tr>
</c:forEach>
 
</body>
</html>