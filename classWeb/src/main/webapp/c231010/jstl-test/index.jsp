<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="list" class ="java.util.ArrayList" />
<%
list.add("김남균");
list.add("송성민");
%>


<c:set var="name" value="권원준" />
<c:set var="name" value="송성민" />
<c:set var="className" value="${\"java\" }" />

<c:remove var="className" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Tags</title>
</head>
<body>
	커스텀 태그 : JSP에서 자바를 더 쓰기 싫어서 만들어짐<br />
	JSTL : JSP Standard Tag Library 표준태그 라이브러리<br />
	${name }<br />
	${className }<br />
	조건문 / if, else, else if, switch, case, default<br />
	<c:if test="${3 > 1 }">
		크다<br />
	</c:if>
	<c:if test="${3 < 1 }">
		크다!!!<br />
	</c:if>
	<hr />
	<c:choose>
		<c:when test="${3 < 1 }">크다<br /></c:when>
		<c:when test="${3 > 54 }">크다!!<br /></c:when>
		<c:otherwise>전부 거짓,default<br /></c:otherwise>
	</c:choose>
	<hr />
	<hr />
	반복문 / for. while, forEach <br />
	for(int i = 0; i <= 10; ++i){}<br />
	<c:forEach var="i" begin="0" end="10" step="2" varStatus="loop">
		${i } : ${loop.count }<br />
	</c:forEach>
	<c:forEach var="item" items="${list }" varStatus="loop">
		번호 ${loop.count} : ${item }
	</c:forEach>
	<!--for문에 대한 정보가 varStatus로 확인한다.  -->
	<hr />
	<c:out value="<div>테스트</div>" escapeXml="false" />
	<c:out value="&gt" escapeXml="false" />
	<c:out value="&lt" escapeXml="false" />
	<hr />
	<c:url var="urlTest" value="../student">
		<c:param name="name" value="테스터~" />
	</c:url>
	<a href="${urlTest }">테스트로 보내기</a>
	<%-- <c:redirect url=	"../student">
		<c:param name="name" value="테스터~" />
	</c:redirect> --%>
</body>
</html>