<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
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

<%-- HEADER PAGE --%>
<head>
	<meta charset="<tiles:getAsString name="charset"/>">
	
	<title>
		${appName}
	</title>
	
	<!-- BEGIN JAVASCRIPTS AND CSS DECLARATIONS -->
		<tiles:insertAttribute name="includes.js.css"/>
	<!-- ENDS JAVASCRIPTS AND CSS DECLARATIONS -->

</head>
<%-- ENDS HEADER PAGE --%>