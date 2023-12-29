<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*" %>
<%@ page import="dto.Member" %>
<%@ page import="dto.Money" %>

    
<%-- <%@ page import = "dao.MemberDao" %> --%>
<jsp:useBean id="memberDao" class="dao.MemberDao"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈쇼핑 회원 매출조회</title>
<link href="css/style.css" rel="stylesheet" />
</head>
<body>
<%@ include file="include/header.jsp" %>
<section>
	
	<div class="container">
		<h1>홈쇼핑 회원 매출조회</h1>
		<table>
			<thead>
				<tr>회원번호</tr>
				<tr>회원성명</tr>
				<tr>고객등급</tr>
				<tr>매출</tr>
			</thead>
			<tbody>
			<%
				request.setCharacterEncoding("utf-8");
				List<Money> mList = memberDao.salesResult();
				
				if(mList.size() == 0) {
			%>
				<tr><td colspan="4">등록된 회원매출 정보가 없습니다.</td></tr>
			<%
				}else{
					
					for(Money money : mList) {
			%>
				<tr style="text-align:center;">
					<td><%=money.getCustno() %></td>
					<td><%=money.getCustname() %></td>
					<td><%=money.getGrade() %></td>
					<td><%=money.getPrice() %></td>
				</tr>
			<% 
					}
				}	
			%>
			</tbody>
		</table>
	</div>	
</section>
<%@ include file="include/footer.jsp" %>
</body>
</html>