<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "dto.Member" %>
<jsp:useBean id="memberDao" class="dao.MemberDao"></jsp:useBean>

<% 
	request.setCharacterEncoding("UTF-8");
	
	int custno = Integer.parseInt(request.getParameter("custno"));
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	Member member = new Member();
	member.setCustno(custno);
	member.setCustname(custname);
	member.setPhone(phone);
	member.setAddress(address);
	member.setJoindate(joindate);
	member.setGrade(grade);
	member.setCity(city);
	
	memberDao.update(member);
	
	//response.sendRedirect("list.jsp");
%>

<jsp:forward page="list.jsp"></jsp:forward>