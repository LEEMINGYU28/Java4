<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored = "false"%>
    
<%--Expression Language --%>    
<jsp:useBean id="student"  class="c231006.StudentBean"  />
<jsp:setProperty name="student" property="*" />  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--<%=student.getName() 
	<jsp:getProperty property="name" name="student"/>--%>
	<%= 1+3 %><br />
	${1 + 3 }<br />
	${4 / 2 }<br />
	${4 div 2 }<br />
	${4 % 3 }<br />
	${2 == 2 }<br />
	${2 eq 2 }<br />
	${2 != 2 }<br />
	${2 != 2 }<br />
	${2 ne 2 }<br />
	${3 > 2 }<br />
	${3 gt 2 }<br /> <%--greater than &gt = html 에서 사용--%>
	${3 < 2 }<br />
	${3 lt 2 }<br /> <%--little than &lt --%>
	${3 >= 2 }<br />
	${3 ge 2 }<br /> 
	<hr />
	${true && false }<br />
	${true and false }<br />
	${true || false }<br />
	${true or false }<br />
	${!true }<br />
	${!true }<br /> 
	${not true }<br /> 
	${empty null }<br />
	${empty "" }<br /> 
	
</body>
</html>