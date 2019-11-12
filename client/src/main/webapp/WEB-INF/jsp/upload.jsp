<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:red">单文件上传</h1>
	<form action="upload1.action" enctype="multipart/form-data" method="post">
		选择文件：<input type="file" name="file" /><br> <input type="submit" value="上传">
	</form>
	<h1 style="color:red">单文件上传并下载</h1>
	<form action="upload2.action" enctype="multipart/form-data" method="post">
		选择文件：<input type="file" name="file" /><br> <input type="submit" value="上传">
	</form>
	<h1 style="color:red">多文件上传并下载</h1>
	<form action="upload3.action" enctype="multipart/form-data" method="post">
		选择文件：<input type="file" name="file" /><br> 选择文件：<input type="file" name="file" /><br>
		选择文件：<input type="file" name="file" /><br> 选择文件：<input type="file" name="file" /><br>
		<input type="submit" value="上传">
	</form>
</body>
</html>