<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Employee Register Form</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath() %>/register">
		<label>아이디</label>
		<input type="text" name="userid" maxlength="20" /><br />
		<label>비밀번호</label>
		<input type="password" name="passwd" maxlength="20" /><br />
		<label>이름</label>
		<input type="text" name="username" /><br />
		<input type="submit" value="회원가입"/>
	</form>
</body>
</html>