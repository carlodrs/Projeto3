<!DOCTYPE  html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<%-- HTM VERSION 5 DIV --%>
<html>
		<!-- TEMPLATE HEADER -->
	    	<tiles:insertAttribute name="header" />
	    <!-- ENDS TEMPLATE HEADER -->
    
   		<!-- TEMPLATE MAIN -->
    	
		<!-- BODY -->
		<body class='<tiles:getAsString name="cssClass"/>'>

			<!-- HEADER -->
	  			<tiles:insertAttribute name="top" />
  			<!-- ENDS HEADER -->
			
			<!-- MENU -->
	  			<tiles:insertAttribute name="menu" />
  			<!-- ENDS MENU -->
		
			<!-- SLIDER -->
				<tiles:insertAttribute name="slider" />
			<!-- ENDS SLIDER -->
			
		
			<!-- CONTENT -->
				<tiles:insertAttribute name="content" />
			<!-- ENDS  CONTENT -->
		
			<!-- TWITTER -->
				<tiles:insertAttribute name="twitter" />
			<!-- ENDS  TWITTER -->
			
			<!-- FOOTER -->
				<tiles:insertAttribute name="footer" />
			<!-- ENDS  FOOTER -->
			
			
			<!-- BOTTOM -->
				<tiles:insertAttribute name="bottom"/>
			<!-- ENDS BOTTOM -->
		</body>
		<!-- ENDS BODY -->
    	<!-- ENDS TEMPLATE MAIN -->
</html>
<%-- ENDS HTM VERSION 5 DIV --%>
