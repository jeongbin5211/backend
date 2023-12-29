<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "dto.Member" %>
<jsp:useBean id="memberDao" class="dao.MemberDao"></jsp:useBean>

<% 
	request.setCharacterEncoding("UTF-8");
	
	int custno = Integer.parseInt(request.getParameter("custno"));
	
	
	memberDao.delete(custno);
	
	response.sendRedirect("list.jsp");
%>