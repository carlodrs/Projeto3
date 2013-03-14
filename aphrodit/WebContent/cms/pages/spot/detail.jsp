<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela detalhe do Content Spots</h3>
			
		<span><s:actionerror/></span>
		<span><s:actionmessage/></span>
			
		<s:form name="UpdateSpotRegisteredAction" action="UpdateSpotRegisteredAction" method="post" validate="true">  
	
				
		
			<s:radio name="spot.active" key="spot.opt.active" list="activeOptions" required="true" value="true"/>
			<s:textfield name="spot.spotName" key="spot.name" required="true"/>
			<s:textfield name="spot.spotDescription" key="spot.description" required="true"/>
			<s:select key="content.spot.choose" required="true" list="contentSpots" value="%{contentSpot.id}" listKey="id" listValue="contentName" name="contentSpot.id" />
		
			<s:hidden id="id" name="id"/>
			<s:submit key="buttonregistry" align="center"/>
			
		</s:form>
		
		<s:form name="ListContentSpotRegisteredAction" action="ListContentSpotRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>