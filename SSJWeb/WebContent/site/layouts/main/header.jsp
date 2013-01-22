<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<%-- HEADER DIV --%>
<div id="header">
				
	<!-- LOGTYPE AND TITLE -->
		<tiles:insertAttribute name="logo.title"/>
	<!-- ENDS LOGTYPE AND TITLE -->
				
   	<!-- SOCIAL NETWORK -->
		<tiles:insertAttribute name="social.network"/>
	<!-- ENDS SOCIAL NETWORK -->
			
	<!-- MENU HEADER  -->
		<tiles:insertAttribute name="menu.header"/>
	<!-- ENDS MENU HEADER  -->
				
	<!-- HEADER SEARCH -->
		<tiles:insertAttribute name="header.search"/>
	<!-- ENDS HEADER SEARCH -->
			
	<!-- SLIDER -->
		<tiles:insertAttribute name="header.slider"/>
	<!-- ENDS SLIDER -->
			
</div>
<%-- ENDS HEADER DIV --%>			