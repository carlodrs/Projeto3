<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>

	<h4>Informe seu email e senha</h4>	
	<s:form action="createUser">
		<s:textfield name="email" label="Email"/>
		<br/>
		<s:password name="password" label="password"/>
	
		<s:submit/>
	</s:form>
	
</body>
</html>