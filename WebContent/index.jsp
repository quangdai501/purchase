<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="oderform" action="${pageContext.request.contextPath}/TestServlet" method="post">
<table>
		<tr>
			<td>Number to purchase</td>
			<td><input type="text" name="quantity" id=""></td>
		</tr>
		<tr>
			<td style="text-align: right;">Your name: </td>
			<td><input type="text" name="customerName" id=""></td>
		</tr>
		<tr>
			<td style="text-align: right;">Your email: </td>
			<td><input type="text" name="customerEmail" id=""></td>
		</tr>
		<tr>
			<td style="text-align: right;"></td>
			<td><input type="submit" name="" id="" value="Place Order"></td>
		</tr>
	</table>
</form>
</body>
</html>