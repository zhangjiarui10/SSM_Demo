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
    <title>Main Page！！！</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="center-block">
    <div class="btn-group" role="group" aria-label="...">
        <a type="button" class="btn btn-default" href="${pageContext.request.contextPath}/user/findAll.do">查看用户</a>
        <a type="button" class="btn btn-default" href="${pageContext.request.contextPath}/book/findAll.do">查看图书</a>
        <a type="button" class="btn btn-default" href="${pageContext.request.contextPath}/relation/findAll.do">查看借阅关系</a>
    </div>
</div>
</body>
</html>
