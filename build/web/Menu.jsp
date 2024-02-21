<%-- 
    Document   : Menu
    Created on : Oct 23, 2023, 4:16:21 AM
    Author     : ngngh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Menu</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="home">MOHO</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
                    <ul class="navbar-nav m-auto">
                        
<!--                        <li class="nav-item">
                            <a class="nav-link" href="#">Category <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown">
                                <c:forEach items="${listC0}" var="o">
                                    <li><a href="category?id=${o.id}">${o.name}</a></li>
                                </c:forEach>
                            </ul>
                        </li>-->
                        
                    
                        <li class="nav-item">
                            <a class="nav-link" href="#">About Us</a>
                        </li>
                        
                        <c:if test="${sessionScope.acc.isadmin == true}">
<!--                            <li class="nav-item">
                                <a class="nav-link" href="#">Manager Account</a>
                            </li>-->
                            <li class="nav-item">
                                <a class="nav-link" href="managerP">Manager Product</a>
                            </li>
                        </c:if>
                        
                        <c:if test="${sessionScope.acc!=null}">
                            <li class="nav-item">
                                <a class="nav-link" href="#">Hello ${sessionScope.acc.name}</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="logout">Logout</a>
                            </li>
                        </c:if>
                            
                        <c:if test="${sessionScope.acc==null}">
                            <li class="nav-item">
                                <a class="nav-link" href="Login.jsp">Login</a>
                            </li>
                        </c:if>    
                        
                        
                    </ul>

                    <form action="search" method="post" class="form-inline my-2 my-lg-0">
                        <div class="input-group input-group-sm">
                            <input value="${txtS}" name="txt" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-secondary btn-number">
                                    <i class="fa fa-search"></i>
                                </button>
                            </div>
                        </div>
                        <a class="btn btn-success btn-sm ml-3" href="show">
                            <i class="fa fa-shopping-cart"></i> Cart
                            <span class="badge badge-light">3</span>
                        </a>
                    </form>
                </div>
            </div>
        </nav>
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading">Nội thất MOHO</h1>
                <p class="lead text-muted mb-0">Mang yêu thương gửi trọn trong từng không gian sống</p>
            </div>
        </section>
<!--end of menu-->
    </body>
</html>
