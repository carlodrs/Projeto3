<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<script type="text/javascript">

function deleteContentSpot(id){
	if(confirm('Deseja excluir o content spot?')){
		document.forms[0].action = 'DeleteContentSpotCMSAction?contentSpot.id='+id;
		document.forms[0].submit();
	}	
}
</script>


<div id="listContentSpotContent" class="cmscontent">
	
		<h3>Listagem de content spots cadastradas</h3>
			
		<s:actionerror/>
		
		<display:table  export="true" id="contentSpot" name="contentSpots"
		requestURI="ListContentSpotRegisteredAction" pagesize="20">
			<display:column property="id" title="Id" paramId="contentSpot.id" sortable="true" url="/cms/DetailContentSpotRegisteredAction"/>
			<display:column property="contentName" title="Nome" sortable="true"/>
			<display:column property="contentDescription" title="Descrição" sortable="true"/>
			<display:column><input type="button" value="excluir" onclick="javascript: deleteContentSpot(${contentSpot.id});"></display:column>
		</display:table>
			 
		
		<s:form name="PrepareCreateContentSpotAction" action="PrepareCreateContentSpotAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>