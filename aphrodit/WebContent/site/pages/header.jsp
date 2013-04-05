<!-- HEADER -->
<%@  taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@  taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="appRequest" value="${pageContext.request}" />
<c:choose>
	<c:when test="${appRequest.serverName eq 'aphrodit.com.br'}">
		<c:set var="appName" value="Aphrodit" />
	</c:when>
	<c:when test="${appRequest.serverName eq 'belezabrasil.net.br'}">
		<c:set var="appName" value="Beleza Brasil" />
	</c:when>
</c:choose>

<div id="header">
	<!-- wrapper-header -->
	<div class="wrapper">
		<a href="index.jsp" class="titlelogo">${appName}</a>
		<!-- search -->
		<div class="top-search">
			<form  method="get" id="searchform" action="#">
				<div>
					<input type="text" value="Pesquisar..." name="s" id="s" onfocus="defaultInput(this)" onblur="clearInput(this)" />
					<input type="submit" id="searchsubmit" value=" " />
				</div>
			</form>
		</div>
		<!-- ENDS search -->
	</div>
	<!-- ENDS wrapper-header -->					
</div>
<!-- ENDS HEADER -->