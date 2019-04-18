<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="http://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css"
	rel="stylesheet">
<script src="http://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery.min.js"></script>
<div class="container">






	<div class="row">
		<div class="col-md-12">

			<h1>测试系统(基于SSM框架)</h1>
			<div class="col-lg-6">
			<form action="editSwb" method="post">
				<div class="input-group">
					<input type="text" class="form-control" name="dorm" placeholder="请输入要查询的宿舍">
					<span class="input-group-btn">
						<button class="btn btn-default" type="submit">查询</button>
					</span>
				</div>
			</form>
				<!-- /input-group -->
			</div>
			<!-- /.col-lg-6 -->
			<table class="table table-hover">
				<thead>
					<tr>

						<th>ID</th>
						<th>宿舍号码</th>
						<th>等级</th>
						<th>检查时间</th>
						<th>原因</th>
						<th>是否通报</th>
						<th>编辑</th>
						<th>删除</th>
					</tr>
				</thead>

				<c:forEach items="${cs}" var="c" varStatus="st">
					<tr>
						<td>${c.id}</td>
						<td>${c.dorm}</td>
						<td>${c.dengji}</td>
						<td>${c.time}</td>
						<td>${c.reason}</td>
						<td>${c.tongbao}</td>
						<td><button type="button" class="btn btn-info">
								<a href="editSwb?id=${c.id}">编辑</a>
							</button></td>
						<td><button type="button" class="btn btn-danger">
								<a href="deleteSwb?id=${c.id}">删除</a>
							</button></td>
					</tr>
				</c:forEach>
			</table>

		</div>
	</div>

	<div style="text-align: center">
		<a href="?start=0">首 页</a> <a href="?start=${page.start-page.count}">上一页</a>
		<a href="?start=${page.start+page.count}">下一页</a> <a
			href="?start=${page.last}">末 页</a>


	</div>



</div>

<script type="text/javascript">
	
</script>

