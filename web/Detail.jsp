<%-- 
    Document   : Detail
    Created on : Oct 22, 2023, 6:00:25 AM
    Author     : ngngh
--%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            .gallery-wrap .img-big-wrap img {
                height: 450px;
                width: auto;
                display: inline-block;
                cursor: zoom-in;
            }


            .gallery-wrap .img-small-wrap .item-gallery {
                width: 60px;
                height: 60px;
                border: 1px solid #ddd;
                margin: 7px 2px;
                display: inline-block;
                overflow: hidden;
            }

            .gallery-wrap .img-small-wrap {
                text-align: center;
            }
            .gallery-wrap .img-small-wrap img {
                max-width: 100%;
                max-height: 100%;
                object-fit: cover;
                border-radius: 4px;
                cursor: zoom-in;
            }
            .img-big-wrap img{
                width: 100% !important;
                height: auto !important;
            }
        </style>
    </head>
    <body>
        <jsp:include page="Menu.jsp"></jsp:include>
            <div class="container">
                <div class="row">

                <div class="col-sm-12">
                    <div class="container">
                        <c:set var="ProdIt" value="${dao.getProductIteambyProductId(detail.id)}" />
                        <c:set var="img" value="${dao.getImagebyProduct(ProdIt.gallery)}" />                            
                        <div class="card">
                            <div class="row">
                                <aside class="col-sm-5 border-right">
                                    <article class="gallery-wrap"> 
                                        <div class="img-big-wrap">                                            
                                            <div> <a href="#"><img src="${img.img}"></a></div>
                                        </div> <!-- slider-product.// -->
                                        <div class="img-small-wrap">
                                            
                                        </div> <!-- slider-nav.// -->
                                    </article> <!-- gallery-wrap .end// -->
                                </aside>
                                <aside class="col-sm-7">
                                    <article class="card-body p-5">
                                        <h3 class="title mb-3">${detail.name}</h3>
                                        <hr>
                                        <div class="row">                                                                                  
                                            <c:if test="${ProdIt.salePrice!=0}">
                                                <div class="col">                                                
                                                    <p style="color: red"><fmt:formatNumber value="${ProdIt.salePrice}" type="number" pattern="###,###"></fmt:formatNumber><sup>đ</sup></p>
                                                </div>
                                                <div class="col">
                                                    <!--<a href="#" class="btn btn-success btn-block">Add to cart</a>-->
                                                    <p style="color: #939393"><del><fmt:formatNumber value="${ProdIt.price}" type="number" pattern="###,###"></fmt:formatNumber><sup>đ</sup></del></p>
                                                </div>
                                            </c:if>
                                            <c:if test="${ProdIt.salePrice==0}">
                                                <div class="col">                                                
                                                    <p style="color: red"><fmt:formatNumber value="${ProdIt.price}" type="number" pattern="###,###"></fmt:formatNumber><sup>đ</sup></p>
                                                </div>                                                
                                            </c:if>
                                        </div> <!-- price-detail-wrap .// -->
                                        <hr>
                                        <dl class="item-property">                                            
                                            <dt>Kích thước:</dt>
                                            <dd><p>${detail.size} </p></dd>
                                            <hr>
                                            <dt>Chất liệu:</dt>
                                            <dd><p>${detail.material} </p></dd>
                                        </dl>
<!--                                        <dl class="param param-feature">
                                            <dt>Model#</dt>
                                            <dd>12345611</dd>
                                        </dl>   item-property-hor .// -->
                                        <dl class="param param-feature">
                                            <dt>Color</dt>
                                            <dd>Màu tự nhiên</dd>
                                        </dl>  
<!--                                        <dl class="param param-feature">
                                            <dt>Delivery</dt>
                                            <dd>Russia, USA, and Europe</dd>
                                        </dl>   item-property-hor .// -->

                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-5">
                                                <dl class="param param-inline">
                                                    <dt>Quantity: </dt>
                                                    <dd>
                                                        <input type="number">
                                                    </dd>
                                                </dl>   
                                            </div>                                              
                                        </div>  
                                        <hr>
                                        
                                        <c:if test="${sessionScope.acc.isadmin == false}">
                                            <a href="#" class="btn btn-lg btn-primary text-uppercase"> Buy now </a>
                                            <a href="#" class="btn btn-lg btn-outline-primary text-uppercase"> <i class="fas fa-shopping-cart"></i> Add to cart </a>
                                        </c:if>
                                            
                                        <c:if test="${sessionScope.acc.isadmin == true}">
                                            <a href="#" class="btn btn-lg btn-outline-primary text-uppercase"> <i class="fas fa-shopping-cart"></i> Edit </a>
                                        </c:if>
                                        
                                    </article> <!-- card-body.// -->
                                </aside> <!-- col.// -->
                            </div> <!-- row.// -->
                        </div> <!-- card.// -->


                    </div>
                </div>
            </div>
        </div>
        <!-- Footer -->
        <footer class="text-light">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-lg-4 col-xl-3">
                        <h5>About</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <p class="mb-0">
                            Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression.
                        </p>
                    </div>

                    <div class="col-md-2 col-lg-2 col-xl-2 mx-auto">
                        <h5>Informations</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <ul class="list-unstyled">
                            <li><a href="">Link 1</a></li>
                            <li><a href="">Link 2</a></li>
                            <li><a href="">Link 3</a></li>
                            <li><a href="">Link 4</a></li>
                        </ul>
                    </div>

                    <div class="col-md-3 col-lg-2 col-xl-2 mx-auto">
                        <h5>Others links</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <ul class="list-unstyled">
                            <li><a href="">Link 1</a></li>
                            <li><a href="">Link 2</a></li>
                            <li><a href="">Link 3</a></li>
                            <li><a href="">Link 4</a></li>
                        </ul>
                    </div>

                    <div class="col-md-4 col-lg-3 col-xl-3">
                        <h5>Contact</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <ul class="list-unstyled">
                            <li><i class="fa fa-home mr-2"></i> My company</li>
                            <li><i class="fa fa-envelope mr-2"></i> email@example.com</li>
                            <li><i class="fa fa-phone mr-2"></i> + 33 12 14 15 16</li>
                            <li><i class="fa fa-print mr-2"></i> + 33 12 14 15 16</li>
                        </ul>
                    </div>
                    <div class="col-12 copyright mt-3">
                        <p class="float-left">
                            <a href="#">Back to top</a>
                        </p>
                        <p class="text-right text-muted">created with <i class="fa fa-heart"></i> by <a href="https://t-php.fr/43-theme-ecommerce-bootstrap-4.html"><i>t-php</i></a> | <span>v. 1.0</span></p>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
