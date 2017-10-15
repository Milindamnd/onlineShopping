<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">

	<div class="row">
		<c:if test="${not empty message}">
			<div class="col-xs-12">
				<div class="alert alert-success alert-dismissible">
					<button type="button" class="close" data-dismiss="alert">&times;</button>
					${message}
				</div>
			</div>
		</c:if>
		<c:if test="${not empty messageError}">
			<div class="col-xs-12">
				<div class="alert alert-danger alert-dismissible">
					<button type="button" class="close" data-dismiss="alert">&times;</button>
					${messageError}
				</div>
			</div>
		</c:if>
		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Product Management</h4>
				</div>

				<div class="panel-body">

					<sf:form class="form-horizontal" modelAttribute="product"
						action="${pageContext.servletContext.contextPath}/manage/products"
						method="POST" enctype="multipart/form-data">
						<div class="form-group">

							<label class="control-lable col-md-4" for="brand">Enter
								Brand Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="brand" id="brand"
									placeholder="Brand Name" class="form-control" />
								<sf:errors path="brand" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="name">Enter
								Product Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="name" id="name"
									placeholder="Product Name" class="form-control" />
								<sf:errors path="name" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="category">Choose
								Category</label>
							<div class="col-md-8">
								<sf:select class="form-control" id="category_id"
									path="category_id" items="${categories}" itemLabel="name"
									itemValue="id" size="1" />

							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="description">Description</label>
							<div class="col-md-8">
								<sf:textarea rows="3" cols="4" path="description"
									id="description" class="form-control"
									placeholder="Describe Your Product" />

								<sf:errors path="description" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="unitPrice">Unit
								Price</label>
							<div class="col-md-8">
								<sf:input type="text" path="unitPrice" id="unitPrice"
									placeholder="Price" class="form-control" />
								<sf:errors path="unitPrice" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="image_file">Choose
								image </label>
							<div class="col-md-8">
								<sf:input type="file" path="image_file" id="image_file"
									 size="1"/>
							</div>
						</div>

						<div class="form-group">

							<label class="control-lable col-md-4" for="qty">Quantity
							</label>
							<div class="col-md-8">
								<sf:input type="text" path="qty" id="qty"
									placeholder="Enter Quantity" class="form-control" />
								<sf:errors path="qty" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<input type="submit" value="Submit" name="submit" id="submit"
									class="btn btn-primary" />
								<sf:hidden path="productId" />
								<sf:hidden path="code" />
								<sf:hidden path="active" />
								<sf:hidden path="purchases" />
								<sf:hidden path="views" />
								<sf:hidden path="supplier_id" />

							</div>
						</div>


					</sf:form>

				</div>
			</div>
		</div>

	</div>
</div>