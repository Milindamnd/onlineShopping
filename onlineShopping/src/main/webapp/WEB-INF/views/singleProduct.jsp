<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">

	<!-- Breadcrumb -->
	<div class="row">
		<div class="col-xs-12">
			<ol class="breadcrumb">

				<li><a href="${pageContext.servletContext.contextPath}/home">Home</a></li>
				<li><a
					href="${pageContext.servletContext.contextPath}/show/all/product">Products</a></li>
				<li class="active">${product.name}</li>
			</ol>
		</div>
	</div>
	<!-- Display Image -->
	<div class=row>

		<div class="col-xs-12 col-sm-4">
			<div class="thumbnail">
				<img
					src="${pageContext.servletContext.contextPath}/resources/images/${product.code}.jpg"
					class="img img-responsive" />

			</div>
		</div>
		<div class="col-xs-12 col-sm-8">
			<h3>${product.name}</h3>
			<hr />
			<p>${product.description}</p>
			<hr />
			<h4>
				Price : <strong>&#8377; ${product.unitPrice} /-</strong>
			</h4>
			<hr />

			<c:choose>
				<c:when test="${product.qty <1}">
					<h6>
						QTY.Available : <span style="color: red">Out of Stock</span>
					</h6>
				</c:when>
				<c:otherwise>
					<h6>QTY.Available : ${product.qty}</h6>
				</c:otherwise>

			</c:choose>
			<c:choose>
				<c:when test="${product.qty <1}">
					<a href="javascript:void(0)" class="btn btn-danger disable"><span
						class="glyphicon glyphicon-shopping-cart"><strike>Add&#160;to&#160;Cart</strike></a>
				</c:when>
				<c:otherwise>
					<a
						href="${pageContext.servletContext.contextPath}/cart/add/${product.productId}/product"
						class="btn btn-danger"><span
						class="glyphicon glyphicon-shopping-cart">Add&#160;to&#160;Cart</a>
				</c:otherwise>

			</c:choose>

			<a href="${pageContext.servletContext.contextPath}/show/all/product"
				class="btn btn-success">Back</a>
		</div>
	</div>