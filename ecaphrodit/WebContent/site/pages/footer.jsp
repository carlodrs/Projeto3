<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="/struts-tags" prefix="s" %>

	<!-- FOOTER -->
			<div id="footer">
				<!-- wrapper-footer -->
				<div class="wrapper">
					<!-- footer-cols -->
					<ul id="footer-cols">
						<li class="col">
							<h6>P�ginas</h6>
							<ul>
								<c:forEach items="${categoryBean.structure}" var="parent">
									<li class="page_item"><a href="${parent.category.url}">${parent.category.name}</a></li>
								</c:forEach>	
							</ul>
						</li>
						
						<li class="col">
							<h6>Redes sociais</h6>
							
							<ul>
								<li class="page_item"><a href="#">Facebook</a></li>
								<li class="page_item"><a href="#">Twitter</a></li>
								<li class="page_item"><a href="#">Our Work</a></li>
								<li class="page_item"><a href="#">Tell Evebory</a></li>
								<li class="page_item"><a href="#">Youtube</a></li>
							</ul>
						</li>
						
						<li class="col">
							<h6>Sobre n�s</h6>
							Somos uma empresa que tem por objetivo oferecer produtos que estejam alinhados com as verdadeiras necesidades de nossas clientes.
							Com �tica e respeito, levamos tamb�m at� voc� nosso carinho e considera��o.
							Obrigado pela prefer�ncia e boas compras!   
						</li>
						
					</ul>
					<!-- ENDS footer-cols -->
				</div>
				<!-- ENDS wrapper-footer -->
			</div>
			<!-- ENDS FOOTER -->