<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela detalhe do Content Spots</h3>
			
		<span><s:actionerror/></span>
		<span><s:actionmessage/></span>
			
		<s:form name="UpdateContentSpotRegisteredAction" action="UpdateContentSpotRegisteredAction" method="post" validate="true">  
	
				
			<script type="text/javascript">
				function removeProductsToContent(){

					var allVals = [];
					var optSelect = true;
					$('#listProduct option:selected').each(function() {
						allVals.push($(this).val());
						optSelect = false;
				     });
					
					if (optSelect == true){
						alert('Selectione os produtos');	
						return false;
					}else{
						if (confirm("Deseja remover produtos selecionados?")){
							$('#listProduct option:selected').each(function() {
								$(this).remove();
						     });
							
							selectAllproducts();
						}
					}
					
					
					
					//submit
					document.forms[0].submit();

				}
				
				
				function selectAllproducts(){
					$('#listProduct option').each(function() {
						$(this).attr('selected', true);
				     });
				}
				
			</script>
		
			<s:textfield name="contentSpot.contentName" key="spot.contentName" required="true"/>
			<s:textfield name="contentSpot.contentDescription" key="spot.contentDescription" required="true"/>
			<s:select multiple="true" key="product.spot.choose" required="true" list="contentSpot.products" listKey="id" listValue="name" name="listProduct" id="listProduct" />
			<s:hidden id="contentSpot.id" name="contentSpot.id"/>
			<div class="buttons">
				<input type="button" value="Adicionar produtos"
				onclick="javascript:window.open('ProductAvailableListCMSAction?contentSpot.id=${contentSpot.id}','_blank','directories=no, status=no,width=500, height=500,top=0,left=0');"/>
				
				<input type="button" value="Remover Produtos Selecionados" onclick="javascript:removeProductsToContent();"/> 
				<input type="button" value="Recarregar pagina" onclick="window.location.reload()"/>
				
			</div>
		
				<s:submit key="buttonregistry" align="center" onclick="javascript: selectAllproducts();"/>
			
		</s:form>
		
		<s:form name="ListContentSpotRegisteredAction" action="ListContentSpotRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>