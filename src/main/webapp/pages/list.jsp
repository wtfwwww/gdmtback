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
<h1>用户列表</h1>
<table>
<tr>
 <th>roleUuid</th>
 <th>roleid</th>
 <th>rolename</th>
 <th>修改</th>
 <th>删除</th>
</tr>
<c:forEach items="${role}" var="ro">
<tr>
 <th>${role.roleUuid }</th>
 <th>${role.roleId }</th>
 <th>${role.roleName}</th>
 <th>修改</th>
 <th>删除</th>
</tr>
</c:forEach>
</table>
</body>
</html>