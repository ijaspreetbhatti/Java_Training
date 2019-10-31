<%@ page import="java.util.Date, java.util.List, java.util.ArrayList, com.ibm.training.MyClass" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Some more stuff with JSP</title>
</head>
<body>
<%-- <%@ include file="ot.html" %> --%>

<jsp:include page="ot.html"></jsp:include>
<%= new Date() %>
<% 
List<String> list = new ArrayList<>();

MyClass ref = new MyClass();

out.println(ref.doSomething());

%>

<jsp:forward page="index.jsp">
<jsp:param value="IBM" name="var"/>
<jsp:param value="TCS" name="second"/>
</jsp:forward>



</body>
</html>