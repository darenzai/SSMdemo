<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
<style type="text/css">

}
</style>
<script src="http://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css"
	rel="stylesheet">
<script src="http://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery.min.js"></script>
</head>
<body>

	
	<nav class="navbar navbar-inverse">管理员登录系统</nav>
	<h1 align="center">管理员登录页面</h1>
	</br>
	</br>
	</br>
	<form class="form-horizontal" action="checkLogin" method="post">
		<div class="form-group" align="center">
			<span class="glyphicon glyphicon-user" aria-hidden="true" align="center"></span>
			<label for="inputEmail3" class="col-sm-2 control-label">账户名</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="inputEmail3" name="username"
					placeholder="账户名">
			</div>
		</div>
		<div class="form-group" align="center">
			<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
			<div class="col-sm-3">
				<input type="password" class="form-control" id="inputPassword3" name="password"
					placeholder="Password">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-3">
				<div class="checkbox">
					<label> <input type="checkbox"> 记住我
					</label>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-3">
				<button type="submit" class="btn btn-default">登录</button>
			</div>
		</div>
	</form>
</body>
</html>