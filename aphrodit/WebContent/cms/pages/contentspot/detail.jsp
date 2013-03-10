<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela detalhe do Content Spots</h3>
			
		<span><s:actionerror/></span>
		
		<s:form name="UpdateContentSpotCreateCMSAction" action="UpdateContentSpotCreateCMSAction" method="post" validate="true">  
	
			<s:textfield name="contentName" key="spot.contentName" required="true"/>
			<s:textfield name="contentDescription" key="spot.contentDescription" required="true"/>
			<s:select  key="spot.choose" required="true" list="spots" listKey="id" listValue="spotName"	name="spotId" />
			<s:select multiple="true" key="product.spot.choose" required="true" list="products" listKey="id" listValue="name" name="productId" />
			
			<div class="buttons">
				<input type="button" value="Adicionar produtos"
				onclick="javascript:window.open('ProductAvailableListCMSAction','_blank','directories=no, status=no,width=500, height=500,top=0,left=0');"/>
				
				<input type="button" value="Remover Produtos Selecionados"/>
				
				<input type="button" value="Recarregar pagina" onclick="window.location.reload()"/>
			</div>
		
				<s:submit key="buttonregistry" align="center"/>
			
		</s:form>
		
		<s:form name="ListContentSpotRegisteredAction" action="ListContentSpotRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>