<!DOCTYPE  html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
	<body>
	
		<h2><s:actionerror/></h2>
		<h2><s:actionmessage/></h2>
		
	
		<s:form name="UpdateBannerImagesCMSAction" action="UpdateBannerImagesCMSAction"  method="post" enctype="multipart/form-data">	
			
			<s:hidden name="banner.id" value="%{banner.id}"/>
			
			<s:file name="image" key="banner.image"/>
			
			<s:submit key="buttonupdate" />
			
		</s:form>		
	</body>
</html>		