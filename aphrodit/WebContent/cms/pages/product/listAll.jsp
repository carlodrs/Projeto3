<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<div id="listProductContent" class="cmscontent">
	
		<h3>Listagem de Produtos cadastrados</h3>
			
		<s:actionerror/>
	
		<display:table  export="true" id="product" name="products" 
		requestURI="ProductListCMSAction" pagesize="20">
			<display:column title="Imagem"><img src="/images/${product.image}" width="100px" height="100px"/></display:column>
			<display:column property="name" title="Nome" sortable="true"/>
			<display:column property="description" title="Descrição" sortable="true"/>
			<display:column property="shortName" title="Curto Nome" sortable="true"/>
			<display:column property="price" title="Preço" sortable="true" />
			<display:column property="offerPrice" title="Preço Sugerido" sortable="true" />
		</display:table>
			 
		
		<s:form name="ProductPrepareCreateCMSAction" action="ProductPrepareCreateCMSAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>