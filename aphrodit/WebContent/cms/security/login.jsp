<%@taglib uri="/struts-tags" prefix="s" %>

<div id="loginContent" class="cmslogin">
	<s:actionerror />
	<s:form action="loginCMS">
		<s:textfield name="email" key="label.email" required="true"/>
		<s:password name="password" key="label.password" required="true"/>
		<s:submit value="acessar" />
	</s:form>
</div>
