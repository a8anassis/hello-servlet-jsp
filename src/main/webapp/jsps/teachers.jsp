<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<c:forEach var="teacher" items="${requestScope.teachers}">
			<tr>
				<td>${teacher.id}</td>
				<td>${teacher.firstname}</td>
				<td>${teacher.lastname}</td>
			</tr>
		</c:forEach>
	
	</table>

</body>
</html>