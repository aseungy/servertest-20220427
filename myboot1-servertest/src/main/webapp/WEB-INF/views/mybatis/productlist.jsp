<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		//jquery code
	});
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<c:forEach items="${productlist }" var="dto">
	${dto.ProductCode }
	<a href="/product?code=${dto.ProductCode }" > ${dto.productName } </a>
	${dto.price } <br>

</c:forEach>
</body>
</html>