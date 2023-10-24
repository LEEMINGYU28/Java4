<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="./script/inventory.js"></script>
<script type="text/javascript" src="./script/corridor.js"></script>
<link href="./styles/corridor.css" rel="stylesheet" type="text/css">
<title>복도</title>
</head>
<body>
	<div class="root">
		<div id="invenbtn">
			<input id="check-btn" type="checkbox" /> <label class="btns"
				for="check-btn">인벤토리</label>
				<ul class="menubars" id="evidenceList"></ul>
				<ul class="inventory" id="inventoryList"></ul>
		</div>
		<div class='room2'>
			<button class='room2_btn' onClick="location.href='room2.jsp'">2번방</button>
		</div>
		<div class='room3'>
			<button class='room3_btn' onClick="location.href='room3.jsp'">3번방</button>
		</div>
		<div class='room4'>
			<button onClick="location.href='room4.jsp'">4번방</button>
		</div>
		<div class='room5'>
			<button onClick="location.href='room5.jsp'">5번방</button>
		</div>
		<div class='choose'>
			<button calss='choose' onClick="location.href='criminal.jsp'">범인
				맞추기</button>
		</div>
	</div>
</body>
</html>