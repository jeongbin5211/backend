<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="/servlet03">������������ �̵�(HomeController)</a>
<br />
<br />

<form method="post" action="/servlet03/login">
	<label>���̵�</label>
	<input type="text" name="userid" /><br />
	<label>��й�ȣ</label>
	<input type="password" name="password" /><br />
	<input type="submit" value="�α���" /><br />
</form>
</body>
</html>