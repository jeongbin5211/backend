<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="/servlet03">메인페이지로 이동(HomeController)</a>
<br />
<br />

<form method="post" action="/servlet03/login">
	<label>아이디</label>
	<input type="text" name="userid" /><br />
	<label>비밀번호</label>
	<input type="password" name="password" /><br />
	<input type="submit" value="로그인" /><br />
</form>
</body>
</html>