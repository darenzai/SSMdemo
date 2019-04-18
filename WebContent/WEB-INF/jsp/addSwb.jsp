
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@page import="org.springframework.context.annotation.Import"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%  Date date=new Date();
	SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd HH:mm");
	String time=df.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<script src="http://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css"
	rel="stylesheet">
<script src="http://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery.min.js"></script>
<meta charset="utf-8">
<title>添加页面</title>
</head>
<body>
	<form action="addSwb" method="post" style="width: 80%">
		<div class="form-group">
			<label for="name">宿舍号</label> <input type="text" class="form-control"
				name="dorm" placeholder="请输入宿舍号"> <br> 
				<label
				for="dengji">等级</label> 
				<select class="form-control" name="dengji">
				<option value="优秀">优秀</option>
				<option value="良好">良好</option>
				<option value="较差">较差</option>
				<option vlaue="差">差</option>
				
			</select>
			<label for="time">检查时间</label>
			<input type="text" class="form-control " name="time" value=<%=time%>> 
			<label for="原因">原因</label>
			<textarea class="form-control" rows="3" name="reason"></textarea>
			<label for="tongbao">通报</label><br>
			<input type="radio" name="tongbao" value="通报">通报
			<input type="radio" name="tongbao" value="不通报">不通报<br>
			<br>
			<button type="submit" class="	btn btn-primary">提交</button>
		</div>



	</form>
</body>
</html>