<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	int var;

	int add(int a, int b){
		return (a + b);
	}
%>

<% 

	//Implicit Objects
	/* out
	request
	response
	session
	application */

/* for(int var = 1; var < 100; var++){
	out.println(var);
} */ 
out.println(this.add(67, 999));
%>

<select>
	<option>Please select your ID</option>
	<% 
		for(int var = 456; var < 1056; var++){
			%>
			<option><%= var %></option>
		<%
		}
		session.setAttribute("var", "value");
	
	//Fetch data from previous jsp
	
	
	
	
	%>
</select>
<%= "from previous page : " + request.getParameter("var") %>
</body>
</html>