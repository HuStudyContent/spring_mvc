<%--
  Created by IntelliJ IDEA.
  User: huxuejun
  Date: 2022/5/8
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/upload2" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit">
  </form>

  <a href="/download">点击下载</a>
  </body>
</html>
