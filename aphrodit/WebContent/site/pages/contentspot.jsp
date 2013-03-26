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
						<a href="/DetailProduct?id=${product.id}" class="thumb" title="An image">
							<img src="/images/${product.image}" width="282px" height="150px" alt="Post" />
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
			
       						<span>${priceCurrency} ou ${installment} x de ${installmentValue} sem juros à prazo</span>
						</div>
						<%--
						<div class="excerpt">
							<c:choose>
								<c:when test="${product.offerPrice != null}">
									<span>De: R$ ${product.price}</span>
									<span>Por: R$ ${product.offerPrice}</span>
								</c:when>
								<c:otherwise>
									<span>à vista ou cartão</span>
									<span>Por: R$ ${product.price}</span>
								</c:otherwise>
							</c:choose>	
						</div>
						 --%>
						<a href="single.html" class="link-button"><span>Ver Detalhes</span></a>
					</li>
				</c:forEach>	
			</c:forEach>
		</ul>
	</div>
