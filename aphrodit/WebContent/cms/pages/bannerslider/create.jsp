<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela de configuração de banners</h3>
			
		<span><s:actionerror/></span>
		
		<s:form name="BannerSliderCreateCMSAction" action="BannerSliderCreateCMSAction" method="post" validate="true">  
			
			<s:file name="banner.image" key="banner.image"/>
			<s:textfield name="banner.title" key="banner.title" required="true"/>
			<s:textfield name="banner.link" key="banner.link" required="true"/>
			<s:textfield name="banner.sequence" key="category.showSequence" required="true"/>
			
			<s:select  key="banner.category" required="true" headerKey="null" headerValue="Selecione a categoria"
				list="categories" listKey="id" listValue="name" name="category.id" />
		
			<s:submit key="buttonregistry" align="center"/>
		</s:form>
		
		<s:form name="ListBannerSliderRegisteredAction" action="ListBannerSliderRegisteredAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>