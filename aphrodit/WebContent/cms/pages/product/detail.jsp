<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div id="productContent" class="cmscontent">
	
		<h3>Tela detalhe de produtos</h3>
			
		<s:actionerror/>
		<s:actionmessage/>
		
		<s:form name="UpdateProductCMSAction" action="UpdateProductCMSAction" method="post" enctype="multipart/form-data" validate="true">  
			
			<script type="text/javascript">
			
					function reload(){
						document.forms[0].action = "DetailProductRegisteredAction";
						document.forms[0].submit();
					}
			
					function removeAttributes(){
	
						var allVals = [];
						var optSelect = true;
						$('#listAttributes option:selected').each(function() {
							allVals.push($(this).val());
							optSelect = false;
					     });
						
						if (optSelect == true){
							alert('Selectione os atributos');	
							return false;
						}else{
							if (confirm("Deseja remover atributos selecionados?")){
								$('#listAttributes option:selected').each(function() {
									$(this).remove();
							     });
								
								selectAllAttributes();
							}
						}
						
						
						
						//submit
						document.forms[0].submit();
	
					}
					
					
					function selectAllAttributes(){
						$('#listAttributes option').each(function() {
							$(this).attr('selected', true);
					     });
					}
					
				</script>
	
			<img src="/images/${product.image}" width="80px" height="80px"/>
			<img src="/images/${product.thumb1}" width="80px" height="80px"/>
			<img src="/images/${product.thumb2}" width="80px" height="80px"/>
			<img src="/images/${product.thumb3}" width="80px" height="80px"/>
			<img src="/images/${product.thumb4}" width="80px" height="80px"/>
			
			<a href="#" onclick="javascript:window.open('ProductImageCMSAction?product.id=${product.id}','_blank','directories=no, status=no,width=500, height=500,top=0,left=0');">
				clique aqui
			</a>
		
			<s:textfield name="product.name" key="product.name" />
			<s:textfield name="product.shortName" key="product.shortName" required="true"/>
			<s:textarea name="product.description" key="product.description"  required="true"/>
			
			<fmt:formatNumber value="${product.price}" type="number" maxFractionDigits="2" var="priceCurrency"/>
       		<s:set var="price">${priceCurrency}</s:set> 
       		<s:textfield name="product.price" key="product.price" required="true" value="%{price}"/> 
			
			<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.offerPrice}" var="nParc" />
			<s:set var="installment">${nParc}</s:set> 
			<s:textfield name="product.offerPrice" key="product.offerPrice" required="true" value="%{installment}"/>
			
			<s:select  key="parent.categories" required="true" list="categories" listKey="id" listValue="name"
			 value="%{product.category.id}"  name="product.category.id" headerKey="" headerValue="Sem categoria" />
			
			<s:select multiple="true" key="product.attributes" required="true" list="product.attributes" listKey="id" listValue="name"
			  name="listAttributes" id="listAttributes"/>
			
				
			<s:hidden name="product.id" value="%{product.id}"/>
			
			<s:submit key="buttonupdate" align="center" onclick="javascript: selectAllAttributes();"/>
		</s:form>
		
		<br>
		
		<div class="bt_attr">
			<input type="button" value="Configurar atributos"
				onclick="javascript:window.open('ProductAttributeListCMSAction?product.id=${product.id}','_blank','directories=no, status=no,width=500, height=500,top=0,left=0');"/>
		
				<input type="button" value="Remover Attributos Selecionados" onclick="javascript:removeAttributes();"/> 
				<input type="button" value="Recarregar pagina" onclick="javascript: reload();"/>
		</div>
		
			
		<s:form name="ProductListCMSAction" action="ProductListCMSAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>