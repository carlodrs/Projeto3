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
	<script type="text/javascript"src="/ProjetoCrud/js/crud.js"></script>	

</head>
	<body>
		
		<div id="container">
			
			<jsp:include page="../pages/header.jsp"/>
			
			<s:form id="UserAction" action="create" method="post" validate="false">  
	
				<h2 class="title">Sucesso!!!</h2>
				
					<div class="line"></div>
				
				<div style="clear: both;"></div>

				<section id="btnSection">	
					<a href="/ProjetoCrud/user/prepareCreate.action">Cadastrar Novamente</a>
					<a href="/ProjetoCrud/user/prepareRead.action">Carregar Usuário</a>
				</section>	


			</s:form>	
			
			<jsp:include page="../pages/footer.jsp"/>
		</div>
	</body>
</html>