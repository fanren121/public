<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/springmvc2/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	function fun() {
		var user = {
			name : "白虎",
			password : "123"
		}
		var str = JSON.stringify(user);
		$.ajax({
			type : "post",
			url : "receive1.action",
			contentType : 'application/json;charset=utf-8',
			data : str,
			success : function(data) {
				$("#n").html(data);
			}

		});
	}
</script>
</head>
<body>
	<input type="text" id="name">
	<button onclick="fun()">点击</button>
	<h1 id="n"></h1>
</body>
</html>