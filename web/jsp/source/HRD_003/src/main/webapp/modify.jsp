<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <%@ page import = "dao.MemberDao" %> --%>
<jsp:useBean id="memberDao" class="dao.MemberDao"></jsp:useBean>

<%@ page import = "dto.Member" %>

<%
	request.setCharacterEncoding("utf-8");
	int custno = Integer.parseInt(request.getParameter("custno"));
	
	Member mem = memberDao.view(custno);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈쇼핑 회원관리 시스템</title>
<link href="css/style.css" rel="stylesheet" />
</head>
<body>
<%@ include file="include/header.jsp" %>
<section>
	
	<div class="container">
		<h1>홈쇼핑 회원 수정</h1>
	<form action="modify_pro.jsp" method="post" onsubmit="return frmCheck()">
		<table>
			<tbody>
				<tr>
					<th>회원번호(자동발생)</th>
					<td>
						<input type="text" name="custno" readonly value="<%=mem.getCustno() %>" />
					</td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td>
						<input type="text" name="custname" value="<%=mem.getCustname() %>" />
					</td>
				</tr>
				<tr>
					<th>회원전화번호</th>
					<td>
						<input type="text" name="phone" value="<%=mem.getPhone() %>" maxlength="13" />
					</td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td>
						<input type="text" name="joindate" placeholder="예시:20231228" value="<%=mem.getJoindate() %>"/>
					</td>
				</tr>
				<tr>
					<th>고객등급[A:VIP, B:일반, C:직원]</th>
					<td>
						<input type="text" name="grade" value="<%=mem.getGrade() %>"  maxlength="1"/>
					</td>
				</tr>
				<tr>
					<th>도시코드[서울:01]</th>
					<td>
						<input type="text" name="city" value="<%=mem.getCity() %>"  maxlength="2"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="회원정보수정">
						<input type="button" value="목록으로" onclilck="location.href='list.jsp'">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
	</div>	
</section>
<%@ include file="include/footer.jsp" %>
<script type="text/javascript" src="js/formCheck.js"></script>
</body>
</html>