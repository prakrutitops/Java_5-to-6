<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
		Integer id2 = Integer.parseInt(id);
		int a = Dao.deletedata(id2);
	
		if(a>0)
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			out.print("fail");
		}
	%>

</body>
</html>