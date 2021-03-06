	<%@taglib uri="/struts-tags" prefix="s" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
		
	<s:bean name="br.com.store.site.databean.SpotDataBean" var="spotBean">
  		<s:param name="name">${param.spotName}</s:param>
	</s:bean>
	
	
	<div>
		<ul class="blocks-thumbs thumbs-rollover">
			<c:forEach items="${spotBean.contentSpots}" var="contentSpot">
				<c:forEach items="${contentSpot.products}" var="product">
					<li>
					
					
						<a href="/images/${product.image}" rel="prettyPhoto" class="thumb" title="Clique no icone acima para expandir">
							<img src="/images/${product.thumb1}" width="282px" height="200px" alt="${produc.shorName}"  title="Ampliar"/>
						</a>
						
						<div class="excerpt">
							<a href="/DetailProduct?id=${product.id}" class="header">${product.name}</a>
							<span>${product.shortName}</span>
							<c:forEach items="${product.attributes}" var="attr">
								<span>N&deg; ${attr.value}</span>
							</c:forEach>
							
							<fmt:formatNumber value="${product.price}" type="currency" var="priceCurrency"/>
							<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.offerPrice}" var="installment" />
							<fmt:formatNumber value="${product.price/product.offerPrice}" type="currency" var="installmentValue"/>
			
       						<span>${priceCurrency} ou ${installment} x de ${installmentValue} sem juros � prazo</span>
						</div>
						
						<div class="fb-like" data-send="true" data-width="450" data-show-faces="false" data-font="verdana"></div>
					
						<%-- 
						<div class="fb-like" data-send="true" data-layout="button_count" data-width="450" data-show-faces="true" data-font="verdana"></div>
						
						<fb:like href="http://www.shoppingsaojoao.com" showfaces="false" send="false"></fb:like> 
						<fb:like send="true" layout="button_count" width="450" show-faces="true" />
						
						 --%>
						
						<a href="ProductDetalheAction?product.id=${product.id}" class="link-button"><span>Ver Detalhes</span></a>
					</li>
				</c:forEach>	
			</c:forEach>
		</ul>
	</div>
