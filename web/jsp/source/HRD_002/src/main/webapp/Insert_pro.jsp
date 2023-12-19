<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "dto.*" %>
<jsp:useBean id="empDao" class="dao.EmpDao"></jsp:useBean>
    
<%
	request.setCharacterEncoding("utf-8");
	String buseo = request.getParameter("buseo_code");
	String emp_name = request.getParameter("emp_name");
	String emp_email = request.getParameter("emp_email");
	String emp_addr = request.getParameter("emp_addr");
	
	Employee emp = new Employee();
	emp.setBuseo_code(buseo);
	emp.setEmp_name(emp_name);
	emp.setEmp_email(emp_email);
	emp.setEmp_addr(emp_addr);
	
	int result = empDao.insertEmployee(emp);
	
	response.sendRedirect("list.jsp");
	
	/* 자바스크립트를 jsp 안에서 사용하기 */
	if(result > 0) {
		out.println("<script>");
		out.println("alert('사원정보가 저장되었습니다.');");
		out.println("location.href = 'list.jsp'");
		out.println("</script>");
	}
%>

<%=buseo %> / <%=emp_name %>