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
		<label>���̵�</label>
		<input type="text" name="userid" maxlength="20" /><br />
		<label>��й�ȣ</label>
		<input type="password" name="passwd" maxlength="20" /><br />
		<label>�̸�</label>
		<input type="text" name="username" /><br />
		<input type="submit" value="ȸ������"/>
	</form>
</body>
</html>