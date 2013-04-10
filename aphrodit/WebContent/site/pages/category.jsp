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
							<span class="title">${category.name}</span>
							<span class="subtitle">${category.description}</span>
						</div>
						<!-- ENDS title -->
						
						<!-- filter -->
						<ul id="portfolio-filter" class="filter">
							<li>Produtos</li>
							<li><a href="#" data-filter="*" > por nome </a></li>
				    	</ul>
						<!-- ENDS filter -->
						
		
						<!-- gallery-->
						<ul id="portfolio-list" class="gallery three-cols">
							<c:forEach items="${products}" var="product">
								<li class="pink">
									<a href="/images/${product.image}" rel="group1" class="fancybox" title="${product.name}">
										<img src="/images/${product.thumb1}" width="282px" height="267px" alt="${product.name}">
									</a>
								</li>
							</c:forEach>
						</ul>
						<!-- ENDS gallery -->	
						
					</div>
					<!-- ENDS content -->

				</div>
				<!-- ENDS wrapper-main -->
			</div>
			<!-- ENDS MAIN -->
			
	