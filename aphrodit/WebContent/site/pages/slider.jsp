<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<s:bean name="br.com.store.site.databean.BannerSliderDataBean" var="bannerBean"/>

<!-- Slider -->
<div id="slider-block">
	<div id="slider-holder">
		<div id="slider">
			<c:forEach items="${bannerBean.banners}" var="banner">
				<a href="${banner.link}"><img src="/images/${banner.image}" title="${banner.title}" alt="" /></a>
			</c:forEach>
		</div>
	</div>
</div>
<!-- ENDS Slider -->
