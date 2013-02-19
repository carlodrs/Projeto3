<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!-- BODY -->
<body class='<tiles:getAsString name="cssClass"/>'>

			<!-- HEADER -->
	  			<tiles:insertAttribute name="header" />
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