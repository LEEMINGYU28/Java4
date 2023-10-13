<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>범인 지목</title>
<link href="./styles/criminal.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="card">
		<div class="A-card">
			<div class="A-head">"용의자 A"</div>
			<div class="A-main">
				<p>
					피해자와 오래된 <br />친구였으며,어린시절 많은 <br />추억을 쌓았다고 한다.
				</p>
			</div>
			<div class="A-choose">
				<button class="w-btn w-btn-A"
					onClick="location.href='badending.jsp'">지목</button>
			</div>
		</div>
		<div class="B-card">
			<div class="B-head">"용의자 B"</div>
			<div class="B-main">
				<p>
					피해자와 항상 운동을 <br />같이하는 운동 메이트 였다.
				</p>
			</div>
			<div class="B-choose">
				<button class="w-btn w-btn-B"
					onClick="location.href='badending.jsp'">지목</button>
			</div>
		</div>
		<div class="C-card">
			<div class="C-head">"용의자 C"</div>
			<div class="C-main">
				<p>피해자는 용의자C의 작품에 대한 소중한 비평가였다.</p>
			</div>
			<div class="C-choose">
				<button class="w-btn w-btn-C"
					onClick="location.href='badending.jsp'">지목</button>
			</div>
		</div>
		<div class="D-card">
			<div class="D-head">"용의자 D"</div>
			<div class="D-main">
				<p>
					피해자는 용의자D와<br />사업적으로 굉장히 가까운<br />사업 파트너 였다.
				</p>
			</div>
			<div class="D-choose">
				<button class="w-btn w-btn-D"
					onClick="location.href='happyending.jsp'">지목</button>
			</div>
		</div>
	</div>

</body>
</html>