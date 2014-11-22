<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<title>Bem vindo ao Projeto CRUD</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/ProjetoCrud/css/style.css">
	<link rel="stylesheet" type="text/css" href="/ProjetoCrud/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/ProjetoCrud/css/read.css">
	<script type="text/javascript" src="/ProjetoCrud/js/jquery-1.5.1.min.js"></script>
	<script type="text/javascript" src="/ProjetoCrud/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/ProjetoCrud/js/delete.js"></script>
		

</head>
	<body>
		
		<div id="container">
			
			<jsp:include page="../pages/header.jsp"/>
			
			<s:form id="UserAction" action="readUser" method="post" validate="false">  
	
				<h2 class="title">Delete Page</h2>
				
					
				<section id="userData">
	
					<div class="tblForm">
								
						<div class="tblLeft">
							Código				
						</div>

						<div class="tblRight">
							<input type="text" placeholder="Código do usuário" name="user.id" value="${user.id}" size="8">			
						</div>
					
						<div class="tblLeft">
							Nome				
						</div>

						<div class="tblRight">
							<input type="text" placeholder="Nome do usuário" name="user.name" value="${user.name}" size="30">			
						</div>
					
					</div>
				</section>
				
				<div class="line"></div>
				
				<div style="clear: both;"></div>
				
				<br>
				
				<div class="line"></div>
				
				<div id="info-user" style="background-color: #F5F5F5; height: 200px;">
					
					<div class="posixMiddle">
						<p>
							Nome:&nbsp; <c:out value="${user.name}"/>
						</p>
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
				</div>
				
				<section id="btnSection">	
					<a href="#" onclick="javascript: readUserForDelete();">Ler usuário</a>
					<a href="#" onclick="javascript: confirmDelete();">Excluir o usuário</a>
				</section>	


			</s:form>	
			
			<jsp:include page="../pages/footer.jsp"/>
		</div>
	</body>
</html>