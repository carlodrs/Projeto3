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
							<li>Classificação</li>
							<li><a href="#" data-filter="*" > Todas as marcas </a></li>
				    	</ul>
						<!-- ENDS filter -->
						
		
						<!-- gallery-->
						<ul id="portfolio-list" class="gallery three-cols">
							<c:forEach items="${products}" var="product">
								<li class="pink">
									<a href="ProductDetalheAction?product.id=${product.id}" title="${product.name}">
										<img src="/images/${product.image}" width="332px" height="267px" alt="${product.name}">
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
			
	