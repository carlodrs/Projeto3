<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE  html>
<html>
	<body>
	
		<div id="top">
			<h3>
				CMS - Loja Aphrodit
			</h3>
		</div>
		<div id="middle">
			<s:actionerror />
			<s:form action="loginCMS">
				<s:textfield name="email" key="label.email" required="true"/>
				<s:password name="password" key="label.password" required="true"/>
				<s:submit value="acessar" />
			</s:form>
		</div>

		<div id="bottom">
			Aphrodit TM. Direitos reservados
		</div>


	</body>
</html>