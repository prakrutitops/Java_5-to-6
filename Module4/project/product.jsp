<%@page import="com.dao.UserDao"%>
<%@page import="com.model.ProductModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:include page="header.jsp"></jsp:include>
	
	<%
		List<ProductModel>list = UserDao.viewdata();
		for(ProductModel p :list)
		{
			
			
	
	%>
			<center>
				<p>
				
					<img alt="xyz" name="pimage" src="<%= p.getPimage()%>" width="250" height="250">	
				</p>
				
				<p>
				
					<input type="text" name="pname" value="<%=p.getPname()%>" readonly="readonly">
				</p>
				
				<p>
				
					<input type="text" name="pprice" value="<%=p.getPprice()%>" readonly="readonly">
				</p>
				
				  		<a class="swd-button" href="wishlist.jsp">Add to Wishlist</a>
                        <a class="swd-button" href="cart.jsp">Add to cart</a>
			</center>
	<%
		}
	%>
	<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>