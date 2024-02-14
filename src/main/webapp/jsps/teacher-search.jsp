<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Hello ${requestScope.admin}</p>
	
	<form method="POST" action="${pageContext.request.contextPath}/teacher">
	
		<label for="lastname">Επώνυμο Καθηγητή</label>
		<input type="text" name="lastname" id="lastname">
		<input type="submit" value="Search">
	</form>	
</body>
</html>