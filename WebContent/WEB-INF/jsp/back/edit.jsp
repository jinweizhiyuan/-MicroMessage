<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() +  path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>内容维护</title>
<link rel="stylesheet" type="text/css" href="<%= basePath %>/resources/css/all.css">
</head>
<body style="background: #e1e9eb;">
	<form action="<%= basePath %>/EditSaveServlet.action" method="post">
		<div class="right">
			<div class="current">当前位置：<a href="javascript:void(0)" style="color:#6E6E6E;">内容管理</a> &gt; 内容维护</div>
			<div class="rightCont">
				<p class="g_title_fix">内容维护</p>
				<div class="fabuzixun">
					<p>指令名称：<input type="text" name="command" class="l-text"><span class="red">*</span></p>
					<p>描　　述：<input type="text" name="description" class="l-text"><span class="red">*</span></p>
					<p>回复内容：<textarea type="text" name="content" class="l-text"></textarea><span class="red">*</span></p>
					<p>　　　　<button class="type-file-button">保存</button></p>
				</div>
			</div>
		</div>
	</form>
</body>
</html>