
<%--
  Created by IntelliJ IDEA.
  User: Ivan
  Date: 17.08.2019
  Time: 6:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>
    <form method="post" enctype="multipart/form-data" action="uploadImage">
        <input type="file" name="imageFile"/>
        <input type="submit" value="Upload"/>
    </form>

</body>
</html>


