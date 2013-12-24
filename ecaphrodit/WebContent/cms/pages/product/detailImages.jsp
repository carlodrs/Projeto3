<!DOCTYPE  html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
	<body>
	
		<h2><s:actionerror/></h2>
		<h2><s:actionmessage/></h2>
		
	
		<s:form name="UpdateProductImagesCMSAction" action="UpdateProductImagesCMSAction"  method="post" enctype="multipart/form-data">	
			
			<s:hidden name="product.id" value="%{product.id}"/>
			
			<s:file name="image" key="product.image"/>
			
			<s:file name="thumb1" key="product.thumb1"/>
			
			<s:file name="thumb2" key="product.thumb2"/>
			
			<s:file name="thumb3" key="product.thumb3"/>
			
			<s:file name="thumb4" key="product.thumb4"/>
			
			<s:submit key="buttonupdate" />
	
		</s:form>		
	</body>
</html>		