<%@taglib uri="/struts-tags" prefix="s" %>
	
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela cadastro de usuários</h3>
			
		<span><s:actionerror/></span>
		
		<s:form name="ClientRegisteredAction" action="ClientRegisteredAction" method="post" validate="true">  
	
			<s:textfield name="email" key="user.email" required="true"/>
			<s:password name="password" key="user.password" required="true"/>
			<s:password name="retypedPassword" key="user.retypedPassword" required="true"/>
			<s:textfield name="name" key="user.name" />
			<s:textfield name="nickName" key="user.nickName" required="true"/>
			<s:textfield name="rg" key="user.rg"  required="true"/>
			<s:textfield name="birthday" key="user.birthday" required="true"/>
			<s:radio name="gender" key="user.gender" list="genders" required="true" value="" />
			<s:textfield name="optIn" key="user.optIn" required="true"/>
			<s:submit key="buttonregistry" align="center"/>
		</s:form>
		
		<s:form name="ListClientRegisteredAction" action="ListClientRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>