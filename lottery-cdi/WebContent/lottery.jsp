<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lottery Page</title>
</head>
<body>
	<form action="draw" method="post">
	    <button>Draw</button>
		<ul>
			<c:forEach items="${lottery.numbers}" var="num">
				<li>${num}</li>
			</c:forEach>
		</ul>
	</form>
</body>
</html>