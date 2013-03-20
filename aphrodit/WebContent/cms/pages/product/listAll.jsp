<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<div id="listProductContent" class="cmscontent">
	
		<h3>Listagem de Produtos cadastrados</h3>
			
		<s:actionerror/>
	
		<display:table  export="true" id="product" name="products" 
		requestURI="ProductListCMSAction" pagesize="6">
		
			<s:url id="detailProduct" action="DetailProductRegisteredAction">
				<s:param name="product.id">${product.id}</s:param>
			</s:url>
			
			<display:column  title="Imagem">
				<s:a href="%{detailProduct}">
					<img src="/images/${product.image}" width="100px" height="100px"/>
				</s:a>	
			</display:column>
			<display:column property="name" title="Nome" sortable="true"/>
			<display:column property="description" title="Descrição" sortable="true"/>
			<display:column property="shortName" title="Curto Nome" sortable="true"/>
			<display:column property="price" title="Preço" sortable="true" />
			<display:column property="offerPrice" title="Qtd parcelas" sortable="true" />
			<display:column property="category.name" title="Categoria" sortable="true" />
		</display:table>
			 
		
		<s:form name="ProductPrepareCreateCMSAction" action="ProductPrepareCreateCMSAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>