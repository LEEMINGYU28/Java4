<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="/regist" method="post">
		<label> 
			id : <input type="text" name="user-id" />
		</label> 
		<label> 
			password : <input type="text" name="user-pw" />
		</label> 
			<label>
			name : <input type="text" name="user-name" />
		</label>
		<button>회원가입</button>
	</form>
</body>
</html>