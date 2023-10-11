<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List,c231006.StudentBean"
    
    isELIgnored="false"%>
<%--
<%
	List students = (ArrayList) request.getAttribute("students");
%>    --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${studentsMap.students[0].name }<br />
	${studentsMap.students[1].name }<br />
	${sessionScope.studentsMap.students[0].name }<br />
	확인순서<br />
	page => request => session => application(Context, ServletContext)<br />
	<%=request.getContextPath() %><br />
	${pageContext.request.contextPath }<br />
	${requestScore.error }<br />
	<%-- pageScope, requestScope, sessionScope, applicationScope --%>

</body>
</html>