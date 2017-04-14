<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheel" href="x.css"/>
<style>
img{
    width: 150px;
    height: 150px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Image stored successfully</h3>
<div>
<img  src="data:image/jpeg;base64,${requestScope.image}"/>
</div>
<h3> image name is ${requestScope.imagename}</h3>
</body>
</html>