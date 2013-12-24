<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<div id="listProductContent" class="cmscontent">
	
		<h3>Listagem de Atributos cadastrados</h3>
			
		<s:actionerror/>
		
		<display:table  export="true" id="attribute" name="attributes" 
		requestURI="br.com.store.cms.attribute.action.AttributeCMSAction" pagesize="20">
			<display:column property="name" title="Nome" sortable="true"/>
			<display:column property="listValue" title="Lista de Valores" sortable="true"/>
			<display:column property="value" title="Valor" sortable="true"/>
		</display:table>
			 
		
		<s:form name="PrepareCreateAttributeAction" action="PrepareCreateAttributeAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>