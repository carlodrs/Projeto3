<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela cadastro de Content Spots</h3>
			
		<span><s:actionerror/></span>
		
		<s:form name="ContentSpotCreateCMSAction" action="ContentSpotCreateCMSAction" method="post" validate="true">  
	
			<s:textfield name="contentSpot.contentName" key="spot.contentName" required="true"/>
			<s:textfield name="contentSpot.contentDescription" key="spot.contentDescription" required="true"/>
			<s:textarea name="contentSpot.textContent" key="spot.contentText"></s:textarea>
			<s:checkbox name="contentSpot.isContentText" key="spot.is.contentText" />
			<s:submit key="buttonregistry" align="center"/>
			
		</s:form>
		
		<s:form name="ListContentSpotRegisteredAction" action="ListContentSpotRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>
