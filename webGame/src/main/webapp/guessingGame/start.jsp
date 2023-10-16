<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="gameSev.ScenarioVO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>추리게임</title>
<link href="./styles/start.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="root">
		<div class="start">
			<button class="story">스토리</button>
			<button class="game" onClick="location.href='start2.jsp'">게임시작</button>
		</div>
	</div>
</body>
</html>