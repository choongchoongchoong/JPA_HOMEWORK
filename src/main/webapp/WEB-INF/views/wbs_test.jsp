<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KIMSCHOOL WBS</title>
</head>
<body>
<h1>
	근태관리 시스템
	<c:forEach items="${listWbsUserInfo }" var = "UserInfo">
		${UserInfo.name }
	</c:forEach>
</h1>

<table border = "1">
	<tr>
	</tr>
</table>

<table border = "1">
	<tr>
	<c:forEach items="${listWorkPlaceInfo }" var = "WorkPlaceInfo">
		<td>${WorkPlaceInfo.min_time }시간</td>
		<td>${WorkPlaceInfo.max_time }시간</td>
	</c:forEach>
	</tr>
</table>

<table border = "1">
	<tr>
		<c:forEach items="${listWbsYear }" var = "WbsYear">
		<td colspan = "3"></td>
		<td>${WbsYear.start_time }</td>
		<td>${WbsYear.end_time }</td>
		<td>${WbsYear.vacation_type }</td>
		<td>${WbsYear.memo }</td>
		</c:forEach>
	</tr>
</table>

</body>
</html>