<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela cadastro de Spots</h3>
			
		<span><s:actionerror/></span>
		
		<s:form name="SpotCreateCMSAction" action="SpotCreateCMSAction" method="post" validate="true">  
	
			<s:radio name="active" key="spot.opt.active" list="activeOptions" required="true" value=""/>
			<s:textfield name="spotName" key="spot.name" required="true"/>
			<s:textfield name="spotDescription" key="spot.description" required="true"/>
			
			<s:submit key="buttonregistry" align="center"/>
		</s:form>
		
		<s:form name="ListSpotRegisteredAction" action="ListSpotRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>