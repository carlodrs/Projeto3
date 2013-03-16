<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="/struts-tags" prefix="s" %>
	
<s:bean name="br.com.store.site.databean.CategoryDataBean" var="categoryBean"></s:bean>

<!-- Menu -->
			<div id="menu">
			
				<!-- ENDS menu-holder -->
				<div id="menu-holder">
					<!-- wrapper-menu -->
					<div class="wrapper">
						<!-- Navigation -->
						<ul id="nav" class="sf-menu">
							<c:forEach items="${categoryBean.structure}" var="parent">
								<li><a href="${parent.category.url}">${parent.category.name}<span class="subheader">${parent.category.description}</span></a>
									<ul>
										<c:forEach items="${parent.categories}" var="child">
											<li><a href="${child.url}"><span> ${child.name}</span></a></li>
										</c:forEach>	
									</ul>
								</li>
							</c:forEach>
						</ul>
						<!-- Navigation -->
					</div>
					<!-- wrapper-menu -->
				</div>
				<!-- ENDS menu-holder -->
			</div>
			<!-- ENDS Menu -->