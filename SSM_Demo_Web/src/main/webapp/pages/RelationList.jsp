<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/12/18
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>BookList</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="../js/jquery-3.2.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
    <table class="table">
        <tr>
            <td>借阅者ID</td>
            <td>图书ID</td>
            <td>借阅者姓名</td>
            <td>书名</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${relationList}" var="relation">
            <tr>
                <td>${relation.userId}</td>
                <td>${relation.bookId}</td>
                <td>${relation.userName}</td>
                <td>${relation.bookName}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/relation/delete.do?userId=${relation.userId}&bookId=${relation.bookId}">删除</a>
<%--                    <a href="${pageContext.request.contextPath}/pages/updateRelation.jsp?uesrId=${relation.userId}&bookId=${relation.bookId}">修改</a>--%>
                </td>
            </tr>
        </c:forEach>
    </table>
    <button type="button" class="btn btn-default btn-lg btn-block">
        <a href="${pageContext.request.contextPath}/pages/insertRelation.jsp">
            添加
        </a>
    </button>
</body>
</html>
