<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%@ page import="db.DBConnect" %>

<% 
	request.setCharacterEncoding("UTF-8");
	Connection conn = DBConnect.getConnection();
	
	String sql = "select * from member order by id desc";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="width: 100%">
		<tr>
			<th>번호</th>
			<th>사용자아이디</th>
			<th>사용자이름</th>
			<th>사용자비밀번호</th>
			<th>가입일</th>
			<th>비고</th>
		</tr>
		<%
			if(rs.next()) {
				do{
		%>
		<tr style="text-align:center">
			<td><%=rs.getInt("id")%></td>
			<td><%=rs.getString("userid")%></td>
			<td><%=rs.getString("username")%></td>
			<td><%=rs.getString("userpwd")%></td>
			<td><%=rs.getDate("regdate")%></td>
			<td>
				<a href="member_update?id=<%=rs.getInt("id")%>">
					<button>수정</button>
				</a>
				<a href="member_delete?id=<%=rs.getInt("id")%>">
					<button>삭제</button>
				</a>
			</td>
		</tr>
		<%
				} while(rs.next());
			}
		%>
	</table>
</body>
</html>