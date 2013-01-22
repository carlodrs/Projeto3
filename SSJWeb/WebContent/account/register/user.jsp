<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>

	<h4>Dados pessoais</h4>	
	<s:form action="createUser" namespace="/account/register" method="post">
	
		<s:textfield name="email" label="Email" value="" />
		
		<s:password name="password" label="password" value=""/>
		
		<s:textfield name="name" label="Nome" value=""/>
		
		<s:textfield name="nickName" label="Apelido" value=""/>
		
		<s:textfield name="cpf" label="CPF" value=""/>
		
		<s:textfield name="rg" label="RG" value=""/>
		
		<s:textfield name="birthday" label="Nascimento" value=""/>
		
		<s:textfield name="gender" label="Sexo" value=""/>
		
		<s:textfield name="occupation" label="Profissão" value=""/>
		
		<s:textfield name="literacy" label="Escolaridade" value=""/>
		
		<s:textfield name="musicPrefs" label="Preferências musicais" value=""/>
		
		<s:textfield name="foodPrefs" label="Preferências gastronômicas" value=""/>
		
		<s:textfield name="facebookId" label="Facebook" value=""/>
		
		<s:textfield name="twitterId" label="Twitter" value=""/>
		
		<s:textfield name="linkedInId" label="Linked In" value=""/>
	
		<s:textfield name="optIn" label="Aceita email marketing" value=""/>
		
		<s:submit/>
	</s:form>
	
</body>
</html>