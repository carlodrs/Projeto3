<%@taglib uri="/struts-tags" prefix="s" %>

<div id="messageContent" class="cmscontent">
		
		<h3><s:actionmessage/></h3>
		
		<div id="messageNew">
			<s:form name="ProductPrepareCreateCMSAction" action="ProductPrepareCreateCMSAction" method="post"> 
				<s:submit key="buttonregistrynew" align="center"/>	
			</s:form>
		</div>
		
		<div id="messageList">
			<s:form name="ProductListCMSAction" action="ProductListCMSAction" method="post"> 
				<s:submit key="buttonlistall" align="center"/>	
			</s:form>
		</div>
		
		<div id="messageSearch">
			<s:form name="ProductSearchCMSAction" action="ProductSearchCMSAction" method="post"> 
				<s:submit key="buttonsearch" align="center"/>	
			</s:form>
		</div>	 
</div>