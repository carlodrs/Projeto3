<%@taglib uri="/struts-tags" prefix="s" %>

<div id="message">
	
		<h3>
			<s:actionmessage />
		</h3>
		
		<s:submit key="button.registry" action="ProductInitCMSAction"></s:submit>
		<s:submit key="button.list" action="ProductListCMSAction">></s:submit> 
</div>		