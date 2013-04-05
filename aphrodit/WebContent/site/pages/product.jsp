<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- MAIN -->
			<div id="main">
				<!-- wrapper-main -->
				<div class="wrapper">
					
					<!-- content -->
					<div id="content">
						
						<!-- title -->
						<div id="page-title">
							<span class="title">${product.shortName}</span>
							<span class="subtitle">${product.name}</span>
						</div>
						<!-- ENDS title -->
						
						<!-- filter -->
						<ul class="filter">
							<li>Categoria</li>
				    		<li class="active"><a href="#" > ${product.category.name} </a></li>
				    	</ul>
						<!-- ENDS filter -->
						
		
						<c:forEach items="${product.attributes}" var="attr">
							<c:set var="nr" value="${attr.value}"/>
						</c:forEach>
							
						<fmt:formatNumber value="${product.price}" type="currency" var="priceCurrency"/>
						<fmt:formatNumber type="number" maxFractionDigits="0" value="${product.offerPrice}" var="installment" />
						<fmt:formatNumber value="${product.price/product.offerPrice}" type="currency" var="installmentValue"/>
			
						<!-- project column (left)-->
						<div class="project-column">
							<!-- shadow -->
							<div class="project-shadow">
								<div class="project-thumbnail"><img src="/images/${product.image}" width="438px" height="330px" alt="Clique" /></div>
							</div>
							<!-- ENDS shadow -->
							
							
							<!-- project gallery -->
							<h5>Galeria de imagens</h5>
							<ul class="project-gallery">
								<li><a href="/images/${product.thumb1}" rel="group${product.id}" class="fancybox"><img width="220px" height="150px" src="/images/${product.thumb1}" alt="${product.shortName}"></a></li>
								<li><a href="/images/${product.thumb2}" rel="group${product.id}" class="fancybox"><img width="220px" height="150px" src="/images/${product.thumb2}" alt="${product.shortName}"></a></li>
								<li><a href="/images/${product.thumb3}" rel="group${product.id}" class="fancybox"><img width="220px" height="150px" src="/images/${product.thumb3}" alt="${product.shortName}"></a></li>
								<li><a href="/images/${product.thumb4}" rel="group${product.id}" class="fancybox"><img width="220px" height="150px" src="/images/${product.thumb4}" alt="${product.shortName}"></a></li>
							</ul>
							<!-- ENDS project gallery -->
							
							<!-- project gallery -->
							<div class="project-gallery-others">
								<h6>Outras opções</h6>
								<ul class="project-gallery-others-images">
									<li><a href="/images/${product.thumb1}" rel="group${product.id}" class="fancybox"><img width="220px" height="150px" src="/images/${product.thumb1}" alt="${product.shortName}"></a></li>
									<li><a href="/images/${product.thumb2}" rel="group${product.id}" class="fancybox"><img width="220px" height="150px" src="/images/${product.thumb2}" alt="${product.shortName}"></a></li>
									<li><a href="/images/${product.thumb3}" rel="group${product.id}" class="fancybox"><img width="220px" height="150px" src="/images/${product.thumb3}" alt="${product.shortName}"></a></li>
									<li><a href="/images/${product.thumb4}" rel="group${product.id}" class="fancybox"><img width="220px" height="150px" src="/images/${product.thumb4}" alt="${product.shortName}"></a></li>
								</ul>
								<!-- ENDS project gallery -->
							</div>
							
						</div>
						<!-- ENDS project column (left)-->
						
						<!--project column (right) -->
						<div class="project-column">
							<h1 class="project-title">Informações sobre o produto</h1>
							<p><h6>${product.description}</h6></p>
						
							<!-- meta -->
								<ul>
									<li><h6><strong>Preço:</strong> ${priceCurrency} </h6></li>
									<li><h6><strong>Parcelas:</strong> ${installment} x de ${installmentValue} à prazo</h6></li> 
									<li><h6><strong>Numeração:</strong> ${nr}</h6></li>
								</ul>
								<!-- ENDS meta -->
						
							<div class="recommends">
								<div class="fb-like" data-send="true" data-width="450" data-show-faces="true" data-action="recommend"></div>
							</div>
							<div class="tweet">
								<a href="https://twitter.com/share" class="twitter-share-button" data-lang="pt">Tweetar</a>
							</div>
							<div class="follow">
								<a href="https://twitter.com/twitter" class="twitter-follow-button" data-show-count="false" data-lang="pt">Seguir @twitter</a>
							</div>
								
						</div>
						<div class="clear"></div>
						<!-- ENDS project column (right) -->
						
						
					</div>
					<!-- ENDS content -->

				</div>
				<!-- ENDS wrapper-main -->
			</div>
			<!-- ENDS MAIN -->