<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sle</title>
</head>
<body>
    <form action="<%=basePath%>login">
		name:<input type="text" id="userName" value="1"/>
		<br/>
		pwd:<input type="text" id="passWord" value="1"/>
		<br/>
		<button onclick="login()">登录</button>
	</form>
	
	<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script type="text/javascript">
		function login(){
			<%-- var name = $("#1").val();
			var pwd = $("#1").val();
			if(name === '' || pwd === ''){
				return;
			}
			$.post("<%=basePath%>/user/login",
					{
						username : name,
						password : pwd
					},
					function(data){
						if(data === 'ok'){
							alert("登录成功");
							location.href = '<%=basePath%>';
						}else{
							alert("登录失败");
						}
					}
			); --%>
			document.form.submit();
			
		}		
	
	</script>
</body>
</html>