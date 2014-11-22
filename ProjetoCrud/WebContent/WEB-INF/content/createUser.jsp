<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Bem vindo ao Projeto CRUD</title>
	
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/ProjetoCrud/css/style.css">
	<link rel="stylesheet" type="text/css" href="/ProjetoCrud/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/ProjetoCrud/css/user.css">
	
	<script type="text/javascript" src="/ProjetoCrud/js/jquery-1.5.1.min.js"></script>
	<script type="text/javascript" src="/ProjetoCrud/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/ProjetoCrud/js/jquery.mask.min.js"></script>
	<script type="text/javascript" src="/ProjetoCrud/js/crud.js"></script>
	<script type="text/javascript" src="/ProjetoCrud/js/user.js"></script>	

</head>
	<body>
		
		<div id="container">
			
			<jsp:include page="../pages/header.jsp"/>
			
			<s:form id="UserAction" action="create" method="post" validate="false">  
	
				<h2 class="title">Create Page</h2>
					
				<section id="userData" class="formSection fundoForm" title="Dados do usuário">
					
					<div class="tblForm">
								
						<div class="tblLeft">
							Nome Completo				
						</div>

						<div class="tblRight">
							<input type="text" name="user.name" id="name" value="" size="30" maxlength="255">			
						</div>
					
						<div class="tblLeft">
							Data de Nascimento				
						</div>

						<div class="tblRight">
							<input type="text" class="placeholder" id="birthday" name="user.birthday" value="" style="width: 80px;">			
						</div>
					
						<div class="tblLeft">
							Nacionalidade				
						</div>

						<div class="tblRight">
							<input type="text" name="user.nationality" id="nationality" value="" size="15">			
						</div>
					
						<div class="tblLeft">
							Sexo				
						</div>
						<div class="tblRight">
							<select name="user.gender" id="gender">
								<option value="M">Masculino</option>
								<option value="F">Feminino</option>
							</select>			
						</div>
					
						<div class="tblLeft">
							RG				
						</div>

						<div class="tblRight">
							<input type="text" name="user.rg" id="rg" class="rg" value="" size="15">			
						</div>
					
						<div class="tblLeft">
							CPF				
						</div>

						<div class="tblRight">
							<input type="text" name="user.cpf" id="cpf" class="cpf" value="" size="15">			
						</div>

						<div class="tblLeft">
							Email				
						</div>

						<div class="tblRight">
							<input type="text" name="user.email" id="email" value="" size="25">			
						</div>

						<div class="tblLeft" style="vertical-align: text-bottom;">
							<input type="checkbox" value="true" name="user.markSubscribe" id="newsletter">			
							Desejo Receber Informações do Site				
						</div>
						
					</div>

				</section>
					
				<div class="line"></div>
					
				<section id="addressData" class="formSection fundoForm" title="Dados do endereço do usuário">
				
					<div class="tblForm">
				
						<div class="tblLeft">
							Endereço				
						</div>

						<div class="tblRight">
							<input type="text" name="user.address.street" id="street" value="" size="30">			
						</div>
					
						<div class="tblLeft">
							Numero				
						</div>

						<div class="tblRight">
							<input type="text" name="user.address.number" id="streetNumber" value="" size="5">			
						</div>
					
						<div class="tblLeft">
							Cep				
						</div>

						<div class="tblRight">
							<input type="text" name="user.address.cep" id="zipCode" value="" size="10">			
						</div>
					
						<div class="tblLeft">
							Cidade				
						</div>

						<div class="tblRight">
							<input type="text" name="user.address.city" id="city" value="" size="10">			
						</div>
					
						<div class="tblLeft">
							Estado				
						</div>

						<div class="tblRight">
							<select name="user.address.state" id="state">
								<c:forEach  var="state" items="${states}">
									<c:choose>
										<c:when test="${user.address.state eq state.name}">
											<c:set var="attrSlct" value="selected"/>
										</c:when>
										<c:otherwise>
											<c:set var="attrSlct" value=""/>
										</c:otherwise>	
									</c:choose>
									<option value="${state.name}" <c:out value="${attrSlct}"/>>${state.name}</option> 
								</c:forEach>
							</select>
						</div>
					
						<div class="tblLeft">
							Pais				
						</div>

						<div class="tblRight">
							<select name="user.address.country">
								<c:forEach  var="country" items="${countries}">
									<c:choose>
										<c:when test="${user.address.country eq country.name}">
											<c:set var="attrSlct" value="selected"/>
										</c:when>
										<c:otherwise>
											<c:set var="attrSlct" value=""/>
										</c:otherwise>	
									</c:choose>
									<option value="${country.name}" <c:out value="${attrSlct}"/>>${country.name}</option> 
								</c:forEach>
							</select>
						</div>
						
						<div class="tblLeft">
							Telefone Residencial ou Comercial				
						</div>
				
						<div class="tblRight">
							<input type="text" class="sp_celphones" name="user.address.phone" id="phone" value="" size="20">			
						</div>
								
						<div class="tblLeft">
							Telefone Celular				
						</div>
				
						<div class="tblRight">
							<input type="text" class="sp_celphones" name="user.address.mobile" id="mobile" value="" size="20">			
						</div>
					</div>
				
				</section>	
				
				<div style="clear: both;"></div>
				
				<section id="btnSection">	
					<a href="#" class="submitBtn">Cadastrar usuário</a>
					<a href="#" class="clearBtn" onclick="">Novo usuário</a>
				</section>	


			</s:form>	
			
			<jsp:include page="../pages/footer.jsp"/>
		</div>
	</body>
</html>