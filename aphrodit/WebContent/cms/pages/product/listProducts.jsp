<!DOCTYPE  html>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html>
	<head>
		<script type="text/javascript" src="../js/jquery-1.5.1.min.js"></script>
			
		<script type="text/javascript">
			function sendProductsToContent(){

				var allVals = [];
				var optSelect = true;
				$('#cb :checked').each(function() {
					allVals.push($(this).val());
					optSelect = false;
			     });
				
				if (optSelect == true){
					alert('Selectione os produtos');	
					return false;
				}
				
				document.forms[0].submit();
				//window.close();
			}
		</script>

	</head>
	
	<body>
		<div id="listProductContent" class="cmscontent">
			
				<h3>Selecione os produtos disponíveis</h3>
					
				<s:actionerror/>
				<s:actionmessage/>
		
		<s:form name="AddProductContentSpot" action="AddProductContentSpot" method="post"> 
				
				<display:table  export="true" id="product" name="products" 
				requestURI="ProductListCMSAction" pagesize="20">
					<display:column title="Mark" sortable="true">
						<div id="cb">
							<input type="checkbox" id="listProduct" name="listProduct"  value="${product.id}"/>
						</div>
					</display:column>
					<display:column title="Imagem"><img src="/images/${product.image}" width="70px" height="70px"/></display:column>
					<display:column property="name" title="Nome" sortable="true"/>
					<display:column property="description" title="Descrição" sortable="true"/>
					<display:column property="shortName" title="Curto Nome" sortable="true"/>
					<display:column property="price" title="Preço" sortable="true" />
					<display:column property="offerPrice" title="Preço Sugerido" sortable="true" />
				</display:table>
				
					<s:hidden id="id" name="id"/>
					<input type="button" value="relacionar" onclick="javascript:sendProductsToContent();"/>
					<input type="button" value="fechar" onclick="window.close();"/>
				</s:form>	 
				
		</div>
	</body>
</html>	