<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="userInfo" value="${userInfo}" />
<c:set var="response" value="${userInfo.response}" />
<!-- {"resultcode":"00","message":"success","response":{"id":"3984398","nickname":"ho****","profile_image":"https:\/\/ssl.pstatic.net\/static\/pwe\/address\/img_profile.png","age":"30-39","gender":"F", -->
<!-- "email":"horany83@gmail.com","name":"\uad8c\uc601\ub780","birthday":"03-08"}} -->
<table>
	<thead>
		<tr><td>resultcode</td><td>${userInfo.resultcode }</td></tr>
		<tr><td>message</td><td>${userInfo.message }</td></tr>
	</thead>
	<tbody>
		<tr><td>id</td><td>${response.id }</td></tr>
		<tr><td>nickname</td><td>${response.nickname }</td></tr>
		<tr><td>profile_image</td><td><img src="${response.profile_image }"></td></tr>
		<tr><td>age</td><td>${response.age }</td></tr>
		<tr><td>gender</td><td>${response.gender }</td></tr>
		<tr><td>email</td><td>${response.email }</td></tr>
		<tr><td>name</td><td>${response.name }</td></tr>
		<tr><td>birthday</td><td>${response.birthday }</td></tr>
	</tbody>
</table>


</body>
</html>