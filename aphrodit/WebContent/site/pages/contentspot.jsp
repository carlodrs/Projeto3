	<%@taglib uri="/struts-tags" prefix="s" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		
	<s:bean name="br.com.store.site.databean.SpotDataBean" var="spotBean">
  		<s:param name="name">${param.spotName}</s:param>
	</s:bean>
	
	<!-- Posts -->
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
							${product.description}
						</div>
						<div class="excerpt">
							De: ${product.price}
							Por: ${product.offerPrice}
						</div>
						
						<a href="single.html" class="link-button"><span>Ver Detalhes</span></a>
					</li>
				</c:forEach>	
			</c:forEach>
		</ul>
	</div>
	<!-- ENDS posts -->