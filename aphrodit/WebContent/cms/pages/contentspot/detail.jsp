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
					$('#spotListProduct option:selected').each(function() {
						allVals.push($(this).val());
						optSelect = false;
				     });
					
					if (optSelect == true){
						alert('Selectione os produtos');	
						return false;
					}else{
						if (confirm("Deseja remover produtos selecionados?")){
							$('#spotListProduct option:selected').each(function() {
								$(this).remove();
						     });
							
							selectAllproducts();
						}
					}
					
					
					
					//submit
					document.forms[0].submit();

				}
				
				
				function selectAllproducts(){
					$('#spotListProduct option').each(function() {
						$(this).attr('selected', true);
				     });
				}
				
			</script>
		
			<s:textfield name="contentName" key="spot.contentName" required="true"/>
			<s:textfield name="contentDescription" key="spot.contentDescription" required="true"/>
			<s:select  key="spot.choose" required="true" list="spots" listKey="id" listValue="spotName"	name="spotId" />
			<s:select multiple="true" key="product.spot.choose" required="true" list="products" listKey="id" listValue="name" name="spotListProduct" id="spotListProduct" />
			<s:hidden id="id" name="id"/>
			<div class="buttons">
				<input type="button" value="Adicionar produtos"
				onclick="javascript:window.open('ProductAvailableListCMSAction?id=${id}','_blank','directories=no, status=no,width=500, height=500,top=0,left=0');"/>
				
				<input type="button" value="Remover Produtos Selecionados" onclick="javascript:removeProductsToContent();"/> 
				<input type="button" value="Recarregar pagina" onclick="window.location.reload()"/>
				
			</div>
		
				<s:submit key="buttonregistry" align="center" onclick="javascript: selectAllproducts();"/>
			
		</s:form>
		
		<s:form name="ListContentSpotRegisteredAction" action="ListContentSpotRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>