<!DOCTYPE  html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!-- HTM VERSION 5 DIV -->
<html xmlns:og="http://opengraphprotocol.org/schema/"
      xmlns:fb="http://www.facebook.com/2008/fbml">
		<!-- TEMPLATE HEADER -->
	    	<tiles:insertAttribute name="header" />
	    <!-- ENDS TEMPLATE HEADER -->
    
   		<!-- TEMPLATE MAIN -->
    	
		<!-- BODY -->
		<body class='<tiles:getAsString name="cssClass"/>'>
	
			<div id="fb-root"></div>
			<script>(function(d, s, id) {
				  var js, fjs = d.getElementsByTagName(s)[0];
				  if (d.getElementById(id)) return;
				  js = d.createElement(s); js.id = id;
				  js.src = "//connect.facebook.net/pt_BR/all.js#xfbml=1";
				  fjs.parentNode.insertBefore(js, fjs);
				}(document, 'script', 'facebook-jssdk'));
			</script>
			
			<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>

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
