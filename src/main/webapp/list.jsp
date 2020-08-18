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
	<form action="slist" method="post">
		<input type="hidden" name="pageNum">
		学生姓名：<input type="text" name="name" value="${map.name }"><br>
		班级：<input type="text" name="cname" value="${map.cname }"><br>
		<input type="submit" value="查询">
	</form>
	<input type="button" value="添加 " onclick="add()">
	<table>
		<tr>
			<th>id</th>
			<th>学生姓名</th>
			<th>学生性别</th>
			<th>学生年龄</th>
			<th>学生爱好</th>
			<th>班级</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${slist }" var="s">
		<tr>
			<td>${s.sid }</td>
			<td>${s.sname }</td>
			<td>${s.gender }</td>
			<td>${s.age }</td>
			<td>${s.hobbys }</td>
			<td>${s.cname }</td>
			<td>
				<input type="button" value="修改" onclick="toupd(${s.sid})">
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
				<input type="button" value="首页 " onclick="fenye(1)">
				<input type="button" value="上一页 " onclick="fenye(${pi.isIsFirstPage()?1:pi.getPrePage() })">
				<c:forEach begin="1" end="${pi.getPages() }" step="1" var="num">
					<input type="button" value="${num }" onclick="fenye(${num})">
				</c:forEach>
				<input type="button" value="下一页 " onclick="fenye(${pi.isIsLastPage()? pi.getPages():pi.getNextPage()})">
				<input type="button" value="尾页 " onclick="fenye(${pi.getPages()})">
			</td>
		</tr>
	</table>

</body>
<script type="text/javascript">
	function fenye(pageNum){
		$("[name='pageNum']").val(pageNum);
		$("form").submit();
	}
	function add(){
		location="toadd";
	}
	function toupd(sid){
		location="toupd?sid="+sid;
	}
</script>
</html>
