<%@taglib uri="/struts-tags" prefix="s" %>
	
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela cadastro de Categorias</h3>
			
		<span><s:actionerror/></span>
		
		<s:form name="CategoryCreateCMSAction" action="CategoryCreateCMSAction" method="post" validate="true">  
	
			<s:checkbox name="isParent" fieldValue="true" key="category.is.parent"/>
			<s:textfield name="name" key="category.name" required="true"/>
			<s:textfield name="description" key="category.description" required="true"/>
			<s:select  key="parent.categories" required="true"
				headerKey="-1" headerValue="Selecione a categoria"
				list="categories" 
				name="parentId" />
		
			<s:submit key="buttonregistry" align="center"/>
		</s:form>
		
		<s:form name="ListCategoryRegisteredAction" action="ListCategoryRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>