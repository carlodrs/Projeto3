<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela cadastro de Spots</h3>
			
		<span><s:actionerror/></span>
		
		<s:form name="SpotCreateCMSAction" action="SpotCreateCMSAction" method="post" validate="true">  
	
			<s:radio name="spot.active" key="spot.opt.active" list="activeOptions" required="true" value="true"/>
			<s:textfield name="spot.spotName" key="spot.name" required="true"/>
			<s:textfield name="spot.spotDescription" key="spot.description" required="true"/>
			<s:select  key="content.spot.choose" required="true" list="contentSpots"  listKey="id" listValue="contentName" name="contentSpot.id" />
			<s:submit key="buttonregistry" align="center"/>
		</s:form>
		
		<s:form name="ListSpotRegisteredAction" action="ListSpotRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>