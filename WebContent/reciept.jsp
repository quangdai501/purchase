<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Order Confirmation</h2>
	<p>Thank you for your order of <%=request.getAttribute("quantity")%>, John.<br/>
	At $<%=request.getAttribute("pricePerUnit")%>, your bill will be $<%=request.getAttribute("cost")%>.<br/>
	You will shortly receive an email confirmation at john@cis
</body>
</html>