<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="./home">Market Place</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item" id="home">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/home">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item" id="about">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/about">About Us</a>
            </li>
            <li class="nav-item" id="product">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/show/all/product">View Products</a>
            </li>
            <li class="nav-item" id="contact">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/contact">Contact Us</a>
            </li>
            <li class="nav-item" id="manageProduct">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/manage/products">Manage Products</a>
            </li>
            <li class="nav-item" id="addCategory">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/manageCategory/category">Add Category</a>
            </li>
           
          </ul>
        </div>
      </div>
    </nav>

 