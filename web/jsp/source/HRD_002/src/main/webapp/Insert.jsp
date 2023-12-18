<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <%@ page import = "dao.EmpDao" %> --%>

<%-- <jsp:useBean id="buseo" class="dto.Buseo"></jsp:useBean> --%>
<%@ page import = "dto.Buseo" %>
<jsp:useBean id="dao" class="dao.EmpDao"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	for(Buseo b : dao.getBuseoAll()) {
%>

	<%=b.getBuseo_code() %> / <%=b.getBuseo_name() %>

<%
	}
%>

</body>
</html>