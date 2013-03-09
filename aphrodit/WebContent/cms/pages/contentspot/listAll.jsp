<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<div id="listContentSpotContent" class="cmscontent">
	
		<h3>Listagem de content spots cadastradas</h3>
			
		<s:actionerror/>
		
		<display:table  export="true" id="contentSpot" name="contentSpots"
		requestURI="br.com.store.cms.spot.action.ContentSpotCMSAction" pagesize="20">
			<display:column property="id" title="Id" sortable="true"/>
			<display:column property="contentName" title="Nome" sortable="true"/>
			<display:column property="contentDescription" title="Descrição" sortable="true"/>
			<display:column property="spot.spotName" title="Spot" sortable="true" />
		</display:table>
			 
		
		<s:form name="PrepareCreateContentSpotAction" action="PrepareCreateContentSpotAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>