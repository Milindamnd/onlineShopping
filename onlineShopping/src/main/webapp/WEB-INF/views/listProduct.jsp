<div class="container">


	<div class="col-md-3">

		<%@ include file="./share/sideBar.jsp"%>
	</div>

	<div class="col-md-9">
		<div class="row">
			<div class="col-lg-12">
				<c:if test="${onClickAllProduct==true}">
					<ol class="breadcrumb">
						<script>
							window.categoryId = '';
						</script>
						<li><a href="${pageContext.servletContext.contextPath}/home">Home</a></li>
						<li class="active">All Products</li>
					</ol>

				</c:if>

				<c:if test="${onClickCategoryProduct==true}">
					<ol class="breadcrumb">
						<script>
							window.categoryId = '${category.id}';
						</script>
						<li><a href="${pageContext.servletContext.contextPath}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
					</ol>

				</c:if>
			</div>
		</div>

		<div class="col-xs-12">

			<table id="productListTable"
				class="table table-striped table-borderd" width="100%">
				<thead>
					<tr>
						<th></th>
						<th>Name</th>
						<th>Brand</th>
						<th>Unit Price</th>
						<th>Quantity</th>
						<th></th>
					</tr>


				</thead>
				<tfoot>
					<tr>
						<th></th>
						<th>Name</th>
						<th>Brand</th>
						<th>Unit Price</th>
						<th>Quantity</th>
						<th></th>
					</tr>


				</tfoot>

			</table>

		</div>


	</div>



</div>