<%@taglib uri="/struts-tags" prefix="s" %>

<div id="messawgeContent" class="cmscontent">
		
		<h3><s:actionmessage/></h3>
		
		<div id="messageNew">
			<s:form name="PrepareCreateCategoryAction" action="PrepareCreateCategoryAction" method="post"> 
				<s:submit key="buttonregistrynew" align="center"/>	
			</s:form>
		</div>
		
		<div id="messageList">
			<s:form name="ListCategoryRegisteredAction" action="ListCategoryRegisteredAction" method="post"> 
				<s:submit key="buttonlistall" align="center"/>	
			</s:form>
		</div>
		
		<div id="messageSearch">
			<s:form name="ListCategoryRegisteredAction" action="ListCategoryRegisteredAction" method="post"> 
				<s:submit key="buttonsearch" align="center"/>	
			</s:form>
		</div>	 
</div>