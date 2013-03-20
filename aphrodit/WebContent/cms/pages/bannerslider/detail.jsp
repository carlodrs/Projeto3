<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<div id="createUserContent" class="cmscontent">
	
		<h3>Tela de Detalhe do Banner Slider</h3>
			
		<span><s:actionerror/></span>
		
		<s:form name="UpdateBannerSliderCMSAction" action="UpdateBannerSliderCMSAction" method="post" validate="true">  
	
	
			<s:hidden name="banner.id"/>
				
			<img src="/images/${banner.image}" width="200px" height="100px"/>
			<a href="#" onclick="javascript:window.open('BannerSliderImageCMSAction?banner.id=${banner.id}','_blank','directories=no, status=no,width=500, height=500,top=0,left=0');">
				clique aqui
			</a>
			
			<s:textfield name="banner.title" key="banner.title" required="true"/>
			<s:textfield name="banner.link" key="banner.link" required="true"/>
			<s:textfield name="banner.sequence" key="category.showSequence" required="true"/>
			
			<%--
			<s:select  key="banner.category" required="true" headerKey="-1" headerValue="Selecione a categoria"
				list="categories" listKey="id" listValue="name" name="category.id" />
			--%>	
			<s:submit key="buttonupdate" align="center"/>
		</s:form>
		
		<s:form name="ListBannerSliderCMSAction" action="ListBannerSliderCMSAction" method="post"> 
			<s:submit key="buttonlistall" align="center"/>	
		</s:form>
	
</div>