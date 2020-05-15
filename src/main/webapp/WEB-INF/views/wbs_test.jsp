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
</h1>

<table border = "1" style = text-alighn:center>
	<tr>
		<th>사원명</th><th>근무처</th>
	</tr>
	<tr>
		<td colpan = "3">
			<c:forEach items="${wbsUserInfo }" var = "UserInfo">
				${UserInfo.name }
			</c:forEach>
		</td>
		<td colpan = "3">
			<c:forEach items="${workPlaceInfo }" var = "WorkPlaceInfo">
				${WorkPlaceInfo.wp_name }
			</c:forEach>
		</td>
	</tr>
</table>

<br><br>

<table border = "1"  style = text-alighn:center>
	<c:forEach items="${workPlaceInfo }" var = "WorkPlaceInfo">
	<tr style = "background-color: lightblue">
		<th>최소근무시간</th>
		<th>최대근무시간</th>
	</tr>
	<tr>
		<td>${WorkPlaceInfo.min_time }시간</td>
		<td>${WorkPlaceInfo.max_time }시간</td>
	</tr>
	</c:forEach>
</table>

<br><br>

<table border = "1" style = text-alighn:center>
	<tr style = "background-color: lightblue">
		<th>출근</th><th>퇴근</th><th>근무</th><th>비고</th>
	</tr>
		<c:forEach items="${wbsYear }" var = "WbsYear">
	<tr>
		<td>${WbsYear.start_time }</td>
		<td>${WbsYear.end_time }</td>
		<td>${WbsYear.vacation_type }</td>
		<td>${WbsYear.memo }</td>
	</tr>
		</c:forEach>
</table>

</body>
</html>