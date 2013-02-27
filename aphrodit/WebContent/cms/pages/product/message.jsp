<%@taglib uri="/struts-tags" prefix="s" %>

<div id="messageContent" class="cmscontent">
		
		<h3><s:actionerror/></h3>
		
		<s:form name="ProductInitCMSAction" action="ProductInitCMSAction" method="post"> 
			<s:submit key="button.registry.new" align="center"/>	
		</s:form>
	
		<s:form name="ProductListCMSAction" action="ProductListCMSAction" method="post"> 
			<s:submit key="button.list.all" align="center"/>	
		</s:form>
			 
</div>