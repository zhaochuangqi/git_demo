<%--
  Created by IntelliJ IDEA.
  User: 86152
  Date: 2020/10/27
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.5.0.min.js"></script>
</head>
<body>
<form action="Servlet" method="post">
    <table border="1px">
<tr>
    <td>用户编码</td>
    <td>用户名称</td>
    <td>用户密码</td>
    <td>性别</td>
    <td>出生日期</td>
    <td>手机</td>
    <td>地址</td>
    <td>用户角色</td>
    <td>创建者</td>
    <td>创建时间</td>
    <td>更新者</td>
    <td>更新时间</td>
    <td>年龄</td>
</tr>
        <c:forEach items="${list}" var="list">
            <tr>
            <td>${list.userCode}</td>
            <td>${list.userName}</td>
            <td>${list.userPassword}</td>
        <td><c:if test="${list.gender eq 1}"/>男
            <c:if test="${list.gender eq 2}"/>女
        </td>
            <td>${list.birthday}</td>
            <td>${list.phone}</td>
            <td>${list.address}</td>
            <td>${list.userRole}</td>
            <td>${list.createdBy}</td>
            <td>${list.creationDate}</td>
            <td>${list.modifyBy}</td>
            <td>${list.modifyDate}</td>
            <td>${list.age}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
