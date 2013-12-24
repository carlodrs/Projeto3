<%@taglib uri="/struts-tags" prefix="s" %>

<div id="productContent" class="cmscontent">
	
		<h3>Tela cadastro de produtos</h3>
			
		<s:actionerror/>
		
		<s:form name="ProductCreateCMSAction" action="ProductCreateCMSAction" method="post" enctype="multipart/form-data" validate="true">  
	
			<s:file name="image" key="product.image" />
			<s:file name="thumb1" key="product.thumb1" />
			<s:file name="thumb2" key="product.thumb2" />
			<s:file name="thumb3" key="product.thumb3" />
			<s:file name="thumb4" key="product.thumb4" />
			<s:textfield name="product.name" key="product.name" />
			<s:textfield name="product.shortName" key="product.shortName" required="true"/>
			<s:textarea name="product.description" key="product.description"  required="true"/>
			<s:textfield name="product.price" key="product.price" required="true"/>
			<s:textfield name="product.offerPrice" key="product.offerPrice" required="true"/>
			<s:select  key="parent.categories" required="true" headerKey="-1" headerValue="Selecione a categoria"
				list="categories" listKey="id" listValue="name"  name="product.category.id" />
		
		
			<s:submit key="buttonregistry" align="center"/>
		</s:form>
		
		<s:form name="ProductListCMSAction" action="ProductListCMSAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>