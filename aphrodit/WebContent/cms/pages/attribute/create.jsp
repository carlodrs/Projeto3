<%@taglib uri="/struts-tags" prefix="s" %>
	
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela cadastro de attributos</h3>
			
		<span><s:actionerror/></span>
		
		<s:form name="AttributeCreateCMSAction" action="AttributeCreateCMSAction" method="post" validate="true">  
	
			<s:textfield name="name" key="attr.name" required="true"/>
			<s:textfield name="listValue" key="attr.listValue" required="true"/>
			<s:textfield name="value" key="attr.value" required="true"/>
			
			<s:submit key="buttonregistry" align="center"/>
		</s:form>
		
		<s:form name="ListAttributeRegisteredAction" action="ListAttributeRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>