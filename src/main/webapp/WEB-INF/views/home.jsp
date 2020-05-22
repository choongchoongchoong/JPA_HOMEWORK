<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>KIMSCHOOL 사원관리 시스템</title>
</head>
<body>
<h1>사원 로그인</h1>

<form action = "wbsLogincheck">
	사원번호 : <br>
	<input type = "text" name = "u_no"><br>
	패스워드 : <br>
	<input type = "password" name = "u_password"><br>
	<input type = "submit" name = "로그인"><br>
</form>

<!-- HomeController의 logincheck로 아이디 패스워드 전달 -->
<!-- <form action = "logincheck">
	ID : <br>
	<input type = "text" name = "id"><br>
	PASSWORD : <br>
	<input type = "password" name = "password"><br><br>
	<input type = "submit" value = "로그인">
</form> -->

<!-- <a href = "movereguser">Don't you have Account?</a><br>
<a href = "movefindpassword">Forgot Your Password?</a><br>
<a href = "movefindwbs">근태관리 검색</a><br> -->

</body>
</html>
