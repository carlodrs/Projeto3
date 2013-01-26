<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!-- BODY -->
<body class='<tiles:getAsString name="cssClass"/>'>

	<!-- WRAPPER -->
		<div id="wrapper">

			<!-- HEADER -->
	  			<tiles:insertAttribute name="header" />
  			<!-- ENDS HEADER -->
			
			<!-- MAIN -->
			<div id="main">
				
				<!-- CONTENT -->
				<tiles:insertAttribute name="content" />
				<!-- ENDS  CONTENT -->

			</div>
			<!-- ENDS MAIN -->
			
			<!-- FOOTER -->
				<%--<tiles:insertAttribute name="footer"/>--%>
			<!-- ENDS FOOTER -->
		
		</div>
	<!-- ENDS WRAPPER -->

</body>
<!-- ENDS BODY -->