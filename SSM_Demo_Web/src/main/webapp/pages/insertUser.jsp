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
    <title>UserList</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="../js/jquery-3.2.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/save.do">
        <div class="form-group">
            <label for="userId">编号</label>
            <input type="text" class="form-control" id="userId" placeholder="ID">
        </div>
        <div class="form-group">
            <label for="userName">姓名</label>
            <input type="text" class="form-control" id="userName" placeholder="Name">
        </div>
        <div class="form-group">
            <label for="userAge">年龄</label>
            <input type="text" class="form-control" id="userAge" placeholder="Age">
        </div>
        <div class="form-group">
            <label for="userClass">班级</label>
            <input type="text" class="form-control" id="userClass" placeholder="Class">
        </div>
            <div class="form-group">
            <label for="userHome">家乡</label>
            <input type="text" class="form-control" id="userHome" placeholder="Home">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</body>
</html>
