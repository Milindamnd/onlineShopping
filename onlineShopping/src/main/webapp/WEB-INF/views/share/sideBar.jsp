<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1 class="my-4">Market Place</h1>
<div class="list-group">
	<c:forEach items="${categories}" var="category">
		<a href="${pageContext.servletContext.contextPath}/show/category/${category.id}/product" class="list-group-item" id="a_${category.name}">${category.name}</a>
	</c:forEach>
</div>
