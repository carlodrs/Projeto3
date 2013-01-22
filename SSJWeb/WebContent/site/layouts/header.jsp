<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%-- HEADER PAGE --%>
<head>
	<meta charset="<tiles:getAsString name="charset"/>">
	
	<title>
		<tiles:getAsString name="title"/>
	</title>
	
	<!-- BEGIN JAVASCRIPTS AND CSS DECLARATIONS -->
		<tiles:insertAttribute name="jsCss"/>
	<!-- ENDS JAVASCRIPTS AND CSS DECLARATIONS -->

</head>
<%-- ENDS HEADER PAGE --%>