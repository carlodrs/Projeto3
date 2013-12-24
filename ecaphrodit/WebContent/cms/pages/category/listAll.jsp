<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<script type="text/javascript">

function deleteCategory(id){
	if(confirm('Deseja excluir essa categoria?')){
		document.forms[0].action = 'DeleteCategoryCMSAction?category.id='+id;
		document.forms[0].submit();
	}	
}
</script>

<div id="listProductContent" class="cmscontent">
	
		<h3>Listagem de categorias cadastradas</h3>
			
		<s:actionerror/>
		
		<display:table  export="true" id="category" name="categories"
		requestURI="br.com.store.cms.category.action.CategoryCMSAction" pagesize="20">
			<display:column property="id" title="Id" sortable="true" paramId="category.id" url="/cms/DetailCategoryRegisteredAction"/>
			<display:column property="name" title="Nome" sortable="true"/>
			<display:column property="description" title="Descrição" sortable="true"/>
			<display:column property="parent.id" title="Categoria pai" sortable="true"/>
			<display:column property="url" title="Link" sortable="true"/>
			<display:column property="showSequence" title="Sequencia de apresetação" sortable="true"/>
			<display:column><input type="button" value="excluir" onclick="javascript: deleteCategory(${category.id});"></display:column>
		</display:table>
			 
		<s:form name="PrepareCreateCategoryAction" action="PrepareCreateCategoryAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>