	<!-- MAIN -->
	<div id="main">
		<!-- wrapper-main -->
		<div class="wrapper">
			
			<!-- headline -->
			<div class="clear"></div>
			<div id="headline">
				<span class="main">Bem vindo ao nosso site</span>
				<span class="sub">Aproveite todas ofertas e destaques. A Aphrodit leva-os até você!</span>
				<!-- <a href="http://luiszuno.com/blog/downloads/nova-html-template" id="link" class="link-button-big"><span>Download Nova</span></a> 
				 -->	
			</div>
			<!-- ENDS headline -->
			
			<!-- content -->
			<div id="content">
				
					<!-- TABS -->
					<!-- the tabs -->
					<ul class="tabs">
						<li><a href="#"><span>Ofertas</span></a></li>
						<li><a href="#"><span>Destaques</span></a></li>
						<li><a href="#"><span>Mais comprados</span></a></li>
					</ul>
					
					<!-- tab "panes" -->
					<div class="panes">
						
						<!-- Posts -->
						<jsp:include page="contentspot.jsp">
							<jsp:param value="ofertas" name="spotName"/>
						</jsp:include>
						<!-- ENDS posts -->
							
						<!-- Posts -->
						<jsp:include page="contentspot.jsp">
							<jsp:param value="destaques" name="spotName"/>
						</jsp:include>
						<!-- ENDS posts -->
											
	
						<!-- Posts -->
						<jsp:include page="contentspot.jsp">
							<jsp:param value="maiscomprados" name="spotName"/>
						</jsp:include>
						<!-- ENDS posts -->
											
						
					</div>
					<!-- ENDS TABS -->
					
					<div id="adsBanner" >
						<img alt="" src="images/redessociais.png">
					</div>
			</div>
			<!-- ENDS content -->
		</div>
		<!-- ENDS wrapper-main -->
	</div>
	<!-- ENDS MAIN -->