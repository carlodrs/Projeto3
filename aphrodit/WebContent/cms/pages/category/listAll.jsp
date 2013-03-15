<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<div id="listProductContent" class="cmscontent">
	
		<h3>Listagem de categorias cadastradas</h3>
			
		<s:actionerror/>
		
		<display:table  export="true" id="category" name="categories"
		requestURI="br.com.store.cms.category.action.CategoryCMSAction" pagesize="20">
			<display:column property="id" title="Id" sortable="true" paramId="category.id" url="/site/DetailCategoryRegisteredAction"/>
			<display:column property="name" title="Nome" sortable="true"/>
			<display:column property="description" title="Descrição" sortable="true"/>
			<display:column property="parent.id" title="Categoria pai" sortable="true"/>
			<display:column property="url" title="Link" sortable="true"/>
		</display:table>
			 
		
		<s:form name="PrepareCreateCategoryAction" action="PrepareCreateCategoryAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>