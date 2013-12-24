<!DOCTYPE  html>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html>
	<head>
		<script type="text/javascript" src="../js/jquery-1.5.1.min.js"></script>
			
		<script type="text/javascript">
			function relatedAttributes(){

				var allVals = [];
				var optSelect = true;
				$('#cb :checked').each(function() {
					allVals.push($(this).val());
					optSelect = false;
			     });
				
				if (optSelect == true){
					alert('Selectione os atributos');	
					return false;
				}
				
				document.forms[0].submit();
				//window.close();
			}
		</script>

	</head>
	
	<body>
		<div id="listProductContent" class="cmscontent">
			
				<h3>Selecione os attributos disponíveis</h3>
					
				<s:actionerror/>
				<s:actionmessage/>
		
		<s:form name="AddAttributeProductCMSAction" action="AddAttributeProductCMSAction" method="post"> 
				
				<display:table  export="true" id="attribute" name="product.attributes" 
				requestURI="ProductAttributeListCMSAction" pagesize="20">
					<display:column title="Mark" sortable="true">
						<div id="cb">
							<input type="checkbox" id="listAttributes" name="listAttributes"  value="${attribute.id}"/>
						</div>
					</display:column>
					<display:column property="name" title="Nome" sortable="true"/>
					<display:column property="value" title="Valor" sortable="true"/>
				</display:table>
				
					<s:hidden id="product.id" name="product.id"/>
					<input type="button" value="relacionar" onclick="javascript:relatedAttributes();"/>
					<input type="button" value="fechar" onclick="window.close();"/>
				</s:form>	 
				
		</div>
	</body>
</html>	