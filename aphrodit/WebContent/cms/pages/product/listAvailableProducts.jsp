<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<div id="listProductContent" class="cmscontent">
	
		<h3>Selecione os produtos dispon�veis</h3>
			
		<s:actionerror/>

		<display:table  export="true" id="product" name="products" 
		requestURI="ProductListCMSAction" pagesize="20">
			<display:column title="Mark" sortable="true"><input type="checkbox" id="id" value="${product.id}"/></display:column>
			<display:column property="name" title="Nome" sortable="true"/>
			<display:column property="description" title="Descri��o" sortable="true"/>
			<display:column property="shortName" title="Curto Nome" sortable="true"/>
			<display:column property="price" title="Pre�o" sortable="true" />
			<display:column property="offerPrice" title="Pre�o Sugerido" sortable="true" />
		</display:table>
			 
		
		<s:form name="ProductListCMSAction" action="ProductListCMSAction" method="post"> 
			<s:submit key="product.related" align="center"/>	
		</s:form>
		
	
</div>