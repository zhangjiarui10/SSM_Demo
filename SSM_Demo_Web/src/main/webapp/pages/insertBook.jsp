<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/12/18
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>insert</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="../js/jquery-3.2.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/book/save.do" method="post" accept-charset="UTF-8">
        <div class="form-group">
            <label for="bookId">编号</label>
            <input type="text" class="form-control" id="bookId" placeholder="Id" name="bookId">
        </div>
        <div class="form-group">
            <label for="bookName">书名</label>
            <input type="text" class="form-control" id="bookName" placeholder="Name"name="bookName">
        </div>
        <div class="form-group">
            <label for="bookKind">类别</label>
            <input type="text" class="form-control" id="bookKind" placeholder="Kind" name="bookKind">
        </div>
        <div class="form-group">
            <label for="bookBrith">出版年份</label>
            <input type="text" class="form-control" id="bookBrith" placeholder="Year" name="bookBrith">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </form>
</body>
</html>
