<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<script type="text/javascript">

function deleteSpot(id){
	if(confirm('Deseja excluir o spot?')){
		document.forms[0].action = 'DeleteSpotCMSAction?spot.id='+id;
		document.forms[0].submit();
	}	
}
</script>


<div id="listSpotContent" class="cmscontent">
	
		<h3>Listagem de spots cadastradas</h3>
			
		<s:actionerror/>
		
		<display:table  export="true" id="spot" name="spots"
		requestURI="br.com.store.cms.spot.action.SpotCMSAction" pagesize="20">
			<display:column property="id" title="Id" sortable="true" paramId="spot.id" url="/cms/DetailSpotRegisteredAction"/>
			<display:column property="spotName" title="Nome" sortable="true"/>
			<display:column property="spotDescription" title="Descrição" sortable="true"/>
			<display:column property="active" title="Ativo" sortable="true"/>
			<display:column><input type="button" value="excluir" onclick="javascript: deleteSpot(${spot.id});"></display:column>
	
		</display:table>
			 
		
		<s:form name="PrepareCreateSpotAction" action="PrepareCreateSpotAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>