<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/servlet02/login">로그인 페이지로 이동</a>
<br />
<br />

<form method="post" action="/servlet02/login">
	<input type="text" name="userid" />
	<input type="submit" value="로그인" />
</form>
</body>
</html>