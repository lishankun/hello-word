<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	<form action="addstu" method="post">
		姓名：<input type="text" name="sname"><br>
		年龄：<input type="text" name="age"><br>
		爱好：<input type="text" name="hobbys"><br>
		性别：<input type="radio" name="gender" value="男">男
		性别：<input type="radio" name="gender" value="女">女
		<br>
		班级：<select name="ids">
			<option>请选择</option>
			<c:forEach items="${clist }" var="a">
				<option value="${a.cid }">${a.cname }</option>
			</c:forEach>
		</select><br>
		<input type="submit" value="添加">
	</form>
</body>
<script type="text/javascript">

</script>
</html>
