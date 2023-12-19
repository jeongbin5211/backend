<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="insert.jsp">사원등록</a>
	<table border="1" style="width: 80%">
		<thead>
			<tr>
				<th>부서명</th>
				<th>사원명</th>
				<th>이메일</th>
				<th>주소</th>
				<th>비고</th>
			</tr>
		</thead>
		<tbody>
		<%
			response.setCharacterEncoding("utf-8");
			for(Employee emp : empDap.getEmployeeAll()) {
		%>
			<tr>
				<td>
					<%=emp.getBuseo_code() %>
				</td>
				<td>
					<%=emp.getBuseo_name() %>
				</td>
				<td>
					<%=emp.getBuseo_email() %>
				</td>
				<td>
					<%=emp.getBuseo_addr() %>
				</td>
				<td>
					<button>수정</button>
					<button>삭제</button>
				</td>
			</tr>
		<% } %>
		</tbody>
	</table>
</body>
</html>