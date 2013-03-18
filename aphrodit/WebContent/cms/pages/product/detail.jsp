<%@taglib uri="/struts-tags" prefix="s" %>

<div id="productContent" class="cmscontent">
	
		<h3>Tela detalhe de produtos</h3>
			
		<s:actionerror/>
		<s:actionmessage/>
		
		<s:form name="UpdateProductCMSAction" action="UpdateProductCMSAction" method="post" enctype="multipart/form-data" validate="true">  
	
			<img src="/images/${product.image}" width="80px" height="80px"/>
			<s:file name="image" key="product.image" value="%{product.image}" />
			
			<img src="/images/${product.thumb1}" width="80px" height="80px"/>
			<s:file name="thumb1" key="product.thumb1" value="%{product.thumb1}"/>
			
			<img src="/images/${product.thumb2}" width="80px" height="80px"/>
			<s:file name="thumb2" key="product.thumb2" value="%{product.thumb2}"/>
			
			<img src="/images/${product.thumb3}" width="80px" height="80px"/>
			<s:file name="thumb3" key="product.thumb3" value="%{product.thumb3}" />
			
			<img src="/images/${product.thumb4}" width="80px" height="80px"/>
			<s:file name="thumb4" key="product.thumb4" value="%{product.thumb4}" />
			
			<s:textfield name="product.name" key="product.name" />
			<s:textfield name="product.shortName" key="product.shortName" required="true"/>
			<s:textarea name="product.description" key="product.description"  required="true"/>
			<s:textfield name="product.price" key="product.price" required="true"/>
			<s:textfield name="product.offerPrice" key="product.offerPrice" required="true"/>
			<s:select  key="parent.categories" required="true" list="categories" listKey="id" listValue="name"
			 value="%{product.category.id}"  name="product.category.id" />
			
			<s:hidden name="product.id" value="%{product.id}"/>
			
			<s:submit key="buttonupdate" align="center"/>
		</s:form>
		
		<s:form name="ProductListCMSAction" action="ProductListCMSAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>