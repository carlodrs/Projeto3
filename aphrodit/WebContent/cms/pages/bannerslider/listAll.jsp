<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<div id="listProductContent" class="cmscontent">
	
		<h3>Listagem de banners cadastradas</h3>
			
		<s:actionerror/>
		
		<display:table  export="true" id="banner" name="banners"
		requestURI="br.com.store.cms.spot.action.ContentBannerSliderCMSAction" pagesize="20">
			
			<s:url id="detailBanner" action="DetailBannerSliderCMSAction">
				<s:param name="banner.id">${banner.id}</s:param>
			</s:url>
			
			<display:column  title="Imagem">
				<s:a href="%{detailProduct}">
					<img src="/images/${banner.image}" width="100px" height="100px"/>
				</s:a>	
			</display:column>
			<display:column property="sequence" title="Sequencia de apresetação" sortable="true"/>
			<display:column property="title" title="Título" sortable="true"/>
			<display:column property="link" title="Link" sortable="true"/>
			<display:column property="category.name" title="Categoria" sortable="true"/>
		</display:table>
			 
		
		<s:form name="PrepareBannerSliderCMSAction" action="PrepareBannerSliderCMSAction" method="post"> 
			<s:submit key="buttonregistrynew" align="center"/>	
		</s:form>
		
	
</div>