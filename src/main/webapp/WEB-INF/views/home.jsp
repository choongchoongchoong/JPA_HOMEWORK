<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	JPA + Spring 연동
</h1>

<!-- HomeController의 logincheck로 아이디 패스워드 전달 -->
<form action = "logincheck">
	ID : <br>
	<input type = "text" name = "id"><br>
	PASSWORD : <br>
	<input type = "password" name = "password"><br><br>
	<input type = "submit" value = "로그인">
</form>

<a href = "movereguser">Don't you have Account?</a><br>
<a href = "movefindpassword">Forgot Your Password?</a><br>
<a href = "movefindwbs">근태관리 검색</a><br>

</body>
</html>
