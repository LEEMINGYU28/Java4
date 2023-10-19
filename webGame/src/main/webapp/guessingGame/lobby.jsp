<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>호텔 로비</title>
<link href="./styles/lobby.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="./script/lobby.js"></script>
</head>
<body>
	<div class="root">
		<div id="output"></div>
			<button id="boanbtn">경비원</button>
			<a type="button" id="nextbtn"></a>
			<a type="button" id="prevbtn"></a>
		<div class="next">
			<button id="room1" onClick="location.href='room1.jsp'">1번방 입장</button>
		</div>
	</div>
</body>
</html>