<!-- HEADER -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<%@  taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@  taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="appRequest" value="${pageContext.request}" />
<c:choose>
	<c:when test="${appRequest.serverName eq 'aphrodit.com.br'}">
		<c:set var="appName" value="CMS Aphrodit" />
	</c:when>
	<c:when test="${appRequest.serverName eq 'belezabrasil.net.br'}">
		<c:set var="appName" value="CMS Beleza Brasil" />
	</c:when>
</c:choose>

<div id="header">
	<!-- wrapper-header -->
	<div class="wrapper">
		<a href="cms/index.jsp" class="titlelogo">${appName}</a>
	</div>
	<!-- ENDS wrapper-header -->	
	
	<a href="../j_spring_security_logout">Logout</a>			
</div>
<!-- ENDS HEADER -->