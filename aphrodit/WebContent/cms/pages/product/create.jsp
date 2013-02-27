<%@taglib uri="/struts-tags" prefix="s" %>

<div id="productContent" class="cmscontent">
	
		<h3>Tela cadastro de produtos</h3>
			
		<s:actionerror/>
		
		<s:form name="ProductCreateCMSAction" action="ProductCreateCMSAction" method="post"> 
	
			<s:file name="picture" key="product.picture" />
			<s:file name="picture" key="product.thumb1" />
			<s:file name="picture" key="product.thumb2" />
			<s:file name="picture" key="product.thumb3" />
			<s:file name="picture" key="product.thumb4" />
			<s:textfield name="name" key="product.name" />
			<s:textfield name="shortName" key="product.shortName" />
			<s:textarea name="description" key="product.description"  />
			<s:textfield name="price" key="product.price" />
			<s:textfield name="offerPrice" key="product.offerPrice" />
			<s:textfield name="discount" key="product.discount" />
			
			<s:submit key="button.registry" align="center"/>	
		</s:form>
			 
</div>