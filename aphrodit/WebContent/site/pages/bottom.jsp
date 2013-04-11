<!-- HEADER -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

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

<!-- Bottom -->
<div id="bottom">
	<!-- wrapper-bottom -->
	<div class="wrapper">
		<div id="bottom-text"><a>${appName}</a> - calçados e acessórios</div>
		<!-- Social -->
		<ul class="social ">
			<li><a href="http://www.facebook.com" class="poshytip  facebook" title="Become a fan"></a></li>
			<li><a href="http://www.twitter.com" class="poshytip twitter" title="Follow our tweets"></a></li>
			<li><a href="http://www.dribbble.com" class="poshytip dribbble" title="View our work"></a></li>
			<li><a href="http://www.addthis.com" class="poshytip addthis" title="Tell everybody"></a></li>
			<li><a href="http://www.youtube.com" class="poshytip youtube" title="View our videos"></a></li>
		</ul>
		<!-- ENDS Social -->
		<div id="to-top" class="poshytip" title="To top"></div>
	</div>
	<!-- ENDS wrapper-bottom -->
</div>
<!-- ENDS Bottom -->