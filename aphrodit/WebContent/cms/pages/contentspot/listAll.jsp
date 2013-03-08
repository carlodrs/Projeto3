<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<div id="listContentSpotContent" class="cmscontent">
	
		<h3>Listagem de spots cadastradas</h3>
			
		<s:actionerror/>
		
		<display:table  export="true" id="spot" name="spots"
		requestURI="br.com.store.cms.spot.action.ContentSpotCMSAction" pagesize="20">
			<display:column property="id" title="Id" sortable="true"/>
			<display:column property="spotName" title="Nome" sortable="true"/>
			<display:column property="spotDescription" title="Descrição" sortable="true"/>
			<display:column property="spot.spotName" title="Spot" sortable="true" />
		</display:table>
			 
		
		<s:form name="PrepareCreateContentSpotAction" action="PrepareCreateContentSpotAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>