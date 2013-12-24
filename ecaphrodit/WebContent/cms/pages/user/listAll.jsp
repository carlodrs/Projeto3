<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<div id="listProductContent" class="cmscontent">
	
		<h3>Listagem de Usuários cadastrados</h3>
			
		<s:actionerror/>
		
		<display:table  export="true" id="client" name="clients" 
		requestURI="br.com.store.cms.user.action.ClientRegisteredAction" pagesize="20">
			<display:column property="name" title="Nome" sortable="true"/>
			<display:column property="nickName" title="Apelido" sortable="true"/>
			<display:column property="rg" title="RG" sortable="true"/>
			<display:column property="birthday.time" title="Nascimento" sortable="true"/>
			<display:column property="gender" title="Sexo" sortable="true" />
			<display:column property="userEmail.email" title="Email" sortable="true" />
		</display:table>
			 
		
		<s:form name="PrepareClientRegisteredAction" action="PrepareClientRegisteredAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>