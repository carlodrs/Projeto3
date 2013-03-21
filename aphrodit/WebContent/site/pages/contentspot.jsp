	<%@taglib uri="/struts-tags" prefix="s" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		
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
							<span>R$ ${product.price} ou ${product.offerPrice}x sem juros no cartão</span>
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
