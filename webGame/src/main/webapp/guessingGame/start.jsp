<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%--page import="gameSev.ScenarioVO" --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>추리게임</title>
<script type="text/javascript" src="./script/story.js"></script>
<link href="./styles/start.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="root">
		<div class="start">
		<div id="output" class="slide-up" ></div>
		<div class="buttons">
			<button id="storybtn">스토리</button>
			<button id="nextbtn">다음</button>
		</div>	
			<button class="game" onClick="location.href='lobby.jsp'">게임시작</button>
		</div>
	</div>
</body>
</html>