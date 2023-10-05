<%@ page language="java" contentType="text/html; charset=UTF-8"
    session="true" 
    pageEncoding="UTF-8"%>
    <!-- jsp에서만 사용하는 jsp태그 -->
    
<!-- 위와 같은 것들을 디렉티브 태그라고 얘기한다. -->
<%-- 
	JSP에서의 주석
	디렉티브 태그
		페이지 디렉티브 태그
			자바에서 사용하는 페이지를 설정하는 정보를 갖고있다. 
			language = jsp에서 사용하는 언어
			contentType = 페이지 출력 형식
			session = 세션 사용 여부, true(기본값)
			pageEncoding = 페이지에서 사용하는 언어 형식
			import = 다른 패키지에서 클래스 등을 가져옴
			errorPage, isErrorPage
		인클루드 디렉티브 태그
		태그라이브 디렉티브 태그
--%>

<%
	String str = "java를 입력했다";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 테스트</title>
</head>
<body>
	여기에 입력하면 페이지에 뜸
</body>
</html>