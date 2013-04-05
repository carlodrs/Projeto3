<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<s:bean name="br.com.store.site.databean.SpotDataBean" var="spotBean"/>
	
	<!-- MAIN -->
	<div id="main">
		<!-- wrapper-main -->
		<div class="wrapper">
			
			<!-- headline -->
			<div class="clear"></div>
			<div id="headline">
				<span class="main">Bem vindo ao site</span>
				<h6>Modelos diferenciados para você!</h6>
				<!-- <a href="http://luiszuno.com/blog/downloads/nova-html-template" id="link" class="link-button-big"><span>Download Nova</span></a> 
				 -->	
			</div>
			<!-- ENDS headline -->
			
			<!-- content -->
			<div id="content">
				
					<!-- TABS -->
					<!-- the tabs -->
					<ul class="tabs">
						<c:forEach items="${spotBean.spots}" var="spot">
							<li><a href="#"><span>${spot.spotDescription}</span></a></li>
						</c:forEach>
					</ul>
					
					<!-- tab "panes" -->
					<div class="panes">
						
						<!-- Posts -->
						<jsp:include page="contentspot.jsp">
							<jsp:param value="spot1" name="spotName"/>
						</jsp:include>
						<!-- ENDS posts -->
							
						<!-- Posts -->
						<jsp:include page="contentspot.jsp">
							<jsp:param value="spot2" name="spotName"/>
						</jsp:include>
						<!-- ENDS posts -->
											
	
						<!-- Posts -->
						<jsp:include page="contentspot.jsp">
							<jsp:param value="spot3" name="spotName"/>
						</jsp:include>
						<!-- ENDS posts -->
											
						
					</div>
					<!-- ENDS TABS -->
					<%--
					<div id="adsBanner" >
						<img alt="" src="images/redessociais.png">
					</div>
					 --%>
			</div>
			<!-- ENDS content -->
		</div>
		<!-- ENDS wrapper-main -->
	</div>
	<!-- ENDS MAIN -->