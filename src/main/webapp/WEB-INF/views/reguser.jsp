<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>회원등록</title>
</head>
<body>
<h1>
	KIMSCHOOL 회원가입
</h1>

<!-- RegUserController의 reguser로 아이디 패스워드 이메일 전달 -->
<form action = "reguser">
	ID : <br>
	<input type = "text" name = "id" required = "required"><br>
	PASSWORD : <br>
	<input type = "password" name = "password" required = "required"><br><br>
	EMAIL : <br>
	<input type = "text" name = "email1"> @ <input type = "text" name = "email2" required = "required"><br>
	<input type = "submit" value = "회원가입">
</form>

<a href = "reg_user">Don't you have Account?</a><br>
<a href = "find_password">Forgot your Password?</a><br>

</body>
</html>
