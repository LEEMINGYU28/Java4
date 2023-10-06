<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="javax.servlet.RequestDispatcher"
    errorPage="../c231006/exception.jsp"
    pageEncoding="UTF-8"%>
<%!
// 선언문
	String hobby = "음악듣기";
	public String getHobby(){return hobby;}
%>

<% 
	// 스크립트릿 
	// 함수내에 출력을하는 도중에 들어온다.
	String name = "송성민";
	getHobby();
	String age = request.getParameter("age");
	Cookie cookie = new Cookie("test","124");
	response.addCookie(cookie);
	application.setAttribute("servletContext","입니다.");
	session.setAttribute("session","입니다." );
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>진짜 테스트</title>
</head>
<body>
	<!-- . 한개 같은 파일 .. 다른 파일 -->
	<%@ include file="./table.jsp" %>
	<!-- 나한테 포함을 시킨다. -->
	<%=name + "입니다." %>
	<%=Integer.parseInt(age) + 10 %>
	<%=session.getAttribute("session") %>
	<%-- 표현식 --%>
	<%! String test ="ㅎㅇ"; %>
	<%-- 되긴 하지만 컨벤션(개발자들 간의 규칙) 상으로 맞지 않다. --%>
	<%
	request.setAttribute("num", 3);
	request.setAttribute("name", "김남균");
	request.setAttribute("hobby", "음악듣기");
	RequestDispatcher dispatch = request.getRequestDispatcher("./table.jsp");
	dispatch.forward(request,response);
	%>

</body>
</html>