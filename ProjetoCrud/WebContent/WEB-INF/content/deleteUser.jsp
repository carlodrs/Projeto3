<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<title>Bem vindo ao Projeto CRUD</title>
	
	<link rel="stylesheet" type="text/css" href="/ProjetoCrud/css/style.css">
	<link rel="stylesheet" type="text/css" href="/ProjetoCrud/css/read.css">
	
	<script type="text/javascript"src="/ProjetoCrud/js/jquery-1.5.1.min.js"></script>
	<script type="text/javascript"src="/ProjetoCrud/js/delete.js"></script>	

</head>
	<body>
		
		<div id="container">
			
			<jsp:include page="../pages/header.jsp"/>
			
			<s:form id="UserAction" action="readUser" method="post" validate="false">  
	
				<h2 class="title">Confirm delete ?</h2>

				<div class="line"></div>
				
				<div style="clear: both;"></div>
				
				<br>
				
				<div id="info-user" style="background-color: #F5F5F5; height: 200px;">
					<input type="hidden" name="user.id" value="${user.id}">
					<input type="hidden" name="user.name" value="${user.name}">
					
					Nome:&nbsp; <c:out value="${user.name}"/>
					
					<p>
						RG:&nbsp; <c:out value="${user.rg}"/>
					</p>
					
					<p>
						CPF:&nbsp; <c:out value="${user.cpf}"/> 
					</p>
						
					<p>
						Endereço:&nbsp;	<c:out value="${user.address.street}"/>
					</p>
					
					<p>
						Cidade:&nbsp; <c:out value="${user.address.city}"/>	
					</p>
					
					<p>
						Estado:&nbsp; <c:out value="${user.address.state}"/>	
					</p>		
				</div>
				
				<section id="btnSection">	
					<a href="#" onclick="javascript: deleteUser();">Confirmar</a>
					<a href="#" onclick="javascript: redirect('home');">Pagina Inicial</a>
				</section>	


			</s:form>	
			
			<jsp:include page="../pages/footer.jsp"/>
		</div>
	</body>
</html>