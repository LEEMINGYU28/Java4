<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.Date"
    pageEncoding="UTF-8"%>

<%-- fmt : format, 언어 형식 --%>
<%-- JSTL => c, fmt, sql, x(XML), fn(function) --%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>원하는 언어로 즉각적인 적용</title>
</head>
<body>
	<fmt:setLocale value="en_US"/>
	<%-- 
	<fmt:setLocale value="en_US"/>
	<fmt:setLocale value="jp_JP"/>
	<fmt:setLocale value="zh_CN"/> 
	--%>
	<div id="locale" data-locale="ko_KR">
		<div id="name" data-name="test_ko.name"></div>
	</div>
	<fmt:bundle basename="student">
		<fmt:message key="student.name" /><br />
		<fmt:message key="student.classname" /><br />
	</fmt:bundle>
	<fmt:setLocale value="ko_KR"/>
	<fmt:setBundle basename="student"/>
	<fmt:message key="student.name" /><br />
	<fmt:message key="student.classname" /><br />
	<%-- 다른곳에서는 l18n  이라고 부름 = fmt 형식 --%>
	<fmt:formatNumber value="1000" type="number" var="won" />
	${won }
	<fmt:formatNumber value="1000" type="currency" currencySymbol="\\" groupingUsed="true"/>
	groupingUsed = 단위별로 끊어줄것이냐<br />
	
	<c:set var="now" value="<%=new Date() %>" />
	${now }
	<fmt:formatDate value="${now }" pattern="YYYY/ MM / dd - hh : mm : ss"/> <br /> <hr />
	<fmt:timeZone value="America/New York">
		<fmt:formatDate value="${now }" type="time" dateStyle="full" timeStyle="full"/>
		<br />
		<fmt:formatDate value="${now }" pattern="YYYY/ MM / dd - hh : mm : ss"/>
	</fmt:timeZone>
</body>
</html>