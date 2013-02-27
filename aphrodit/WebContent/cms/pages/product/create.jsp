<%@taglib uri="/struts-tags" prefix="s" %>

<div id="productContent" class="cmscontent">
	
		<h3>Tela cadastro de produtos</h3>
			
		<s:actionerror/>
		
		<s:form action="ProductCreateCMSAction"> 
	
			<s:file name="picture" key="product.picture" />
			<s:file name="picture" key="product.thumb1" />
			<s:file name="picture" key="product.thumb2" />
			<s:file name="picture" key="product.thumb3" />
			<s:file name="picture" key="product.thumb4" />
			<s:textfield name="name" key="product.name" />
			<s:textfield name="shortName" key="product.shortName" required="true"/>
			<s:textarea name="description" key="product.description"  required="true"/>
			<s:textfield name="price" key="product.price" required="true"/>
			<s:textfield name="offerPrice" key="product.offerPrice" required="true"/>
			<s:textfield name="discount" key="product.discount" required="true"/>
			
			<s:submit key="buttonregistry" align="center"/>	
		</s:form>
			 
</div>