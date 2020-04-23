<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>비밀번호 찾기</title>
</head>
<body>
<h1>
	비밀번호 찾기
</h1>

<!-- FindPasswordController의 findpassword로 아이디, 이메일주소 전달 -->
<form action = "findpassword">
	ID : <br>
	<input type = "text" name = "id" required = "required"><br>
	EMAIL : <br>
	<input type = "text" name = "email1" required = "required"> @
	<input type = "text" name = "email2" required = "required"><br>
	<input type = "submit" value = "확인">
</form>

</body>
</html>