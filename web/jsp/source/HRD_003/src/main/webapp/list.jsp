<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*" %>
<%@ page import="dto.Member" %>

    
<%-- <%@ page import = "dao.MemberDao" %> --%>
<jsp:useBean id="memberDao" class="dao.MemberDao"></jsp:useBean>

<%
	int custno = memberDao.nextCustno();
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
		<h1>홈쇼핑 회원 목록</h1>
		<table>
			<thead>
				<tr>
					<th>회원번호</th>
					<th>회원성명</th>
					<th>전화번호</th>
					<th>주소</th>
					<th>가입일자</th>
					<th>고객등급</th>
					<th>거주지역</th>
					<th>수정/삭제</th>
				</tr>
			</thead>
			<tbody>
			<%
				List<Member> list = memberDao.selectAll();
				for(int i = 0; i < list.size(); ++i) {
			%>
				<tr>
					<td>
						<%= list.get(i).getCustno() %>
					</td>
					<td>
						<%= list.get(i).getCustname() %>
					</td>
					<td>
						<%= list.get(i).getPhone() %>
					</td>
					<td>
						<%= list.get(i).getAddress() %>
					</td>
					<td>
						<%= list.get(i).getJoindate() %>
					</td>
					<td>
						<%= list.get(i).getGrade() %>
					</td>
					<td>
						<%= list.get(i).getCity() %>
					</td>
					<td>
						<button type="button" onclick="memModify(<%= list.get(i).getCustno() %>)">수정</button>
						<button type="button" onclick="memDelete(<%= list.get(i).getCustno() %>)">삭제</button>
					</td>
				</tr>
			<% 
				} 	
			%>
			</tbody>
		</table>
	
	</div>	
</section>
<%@ include file="include/footer.jsp" %>
<script type="text/javascript">
	function memDelete(custno) {
		// alert(custno);
		if (confirm("회원정보를 삭제하시겠습니까?")) {
			location.href = "delete.jsp?custno="+custno;
		}
	}
	
	function memModify(custno) {
		location.href = "modify.jsp?custno="+custno;
	}
</script>
</body>
</html>